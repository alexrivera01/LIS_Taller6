/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avenciaviajes.acceso;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alexander
 */
public class ServicioServidorCentralSocket implements IServidorCentral {

    private Socket socket = null;
    private Scanner entradaDecorada;
    private PrintStream salidaDecorada;
    private final String IP_SERVIDOR = "localhost";
    private final int PUERTO = 5000;
    
    
    
    private String consultarServicio(String servicio) {
       String respuesta = null;
        try{
            conectar(IP_SERVIDOR, PUERTO);
            respuesta = leerFlujoEntradaSalida(servicio);
            cerrarFlujos();
            desconectar();
            
        }catch (IOException ex) {
            Logger.getLogger(ServicioServidorCentralSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return respuesta;
    }
    
    /**
     * Envia al servidor el string con el servicio a través de
     * la salida decorada y lee la respuesta a través de la entrada
     * decorada
     * @param servicio String con el servicio a solcitar
     * @return String con la respuesta del servidor
     * @throws IOException 
     */
    private String leerFlujoEntradaSalida(String servicio) throws IOException {
        String respuesta = "";
        entradaDecorada = new Scanner(socket.getInputStream());
        salidaDecorada = new PrintStream(socket.getOutputStream());
        salidaDecorada.flush();
        // Usando el protocolo de comunicación
        salidaDecorada.println(servicio);
        if (entradaDecorada.hasNextLine()) {
            respuesta = entradaDecorada.nextLine();
        }
        return respuesta;
    }

    /**
     * Cierra la salidaDecorada y la entradaDecorada
     */
    private void cerrarFlujos() {
        salidaDecorada.close();
        entradaDecorada.close();
    }
    
    /**
     * Desconecta el socket del servidor
     */
    private void desconectar() {
        try {
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(ServicioServidorCentralSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Crea el socket para conectarse con el servidor a través 
     * de la direccion address y el puerto port
     * @param address
     * @param port
     * @throws IOException 
     */
    public void conectar(String address, int port) throws IOException {
        socket = new Socket(address, port);
        System.out.println("Conectado");
    }
    
    
    
    
    
    /**
     *  Definición del método que consulta los clientes 
     * guardados en la bd del servidor central
     * @return String Json con los clientes serializados
     */
    @Override
    public String consultarClientesServicio() {
        return consultarServicio("consultarClientes");
    }

    /**
     * Consulta los usuarios guardados en la bd del servidor central
     * @return String Json con los usuarios serializados 
     */
    @Override
    public String consultarPlanesServicio() {
        return consultarServicio("consultarPlanes");
    }

}
