/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorcentral.negocio;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Alexander
 */
public class GestorClientes {
    ArrayList<Cliente> listado;
    private final ConectorJdbc conector;
    
    /**
     * Constructor por defecto
     */
    public GestorClientes() {
        listado = new ArrayList();
        conector = new ConectorJdbc();
        
    } 
    
    /**
     * Get para listado
     * @return ArrayList con el listado de Cliente
     */
    public ArrayList<Cliente> getListado(){
        return (ArrayList<Cliente>) listado;
    }
    
    
    
    public ArrayList<Cliente> consultarClientes() throws ClassNotFoundException, SQLException{
        conector.conectarse();
        conector.crearConsulta("SELECT * FROM CLIENTE;");
        ArrayList<Cliente> clientes = new ArrayList();

        while (conector.getResultado().next()) {
            Cliente cli = new Cliente(conector.getResultado().getString("id"), 
                                      conector.getResultado().getString("nombres"),
                                      conector.getResultado().getString("apellidos"),
                                      conector.getResultado().getString("email"),
                                      conector.getResultado().getString("genero"),
                                      conector.getResultado().getString("edad"));
            clientes.add(cli);
        }
        conector.desconectarse();
        return clientes;
    }
    
    
}
