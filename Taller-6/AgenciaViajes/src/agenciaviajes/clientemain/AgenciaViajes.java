/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaviajes.clientemain;

import agenciaviajes.presentacion.GUIClientesPotenciales;
import avenciaviajes.acceso.IServidorCentral;
import avenciaviajes.acceso.ServicioServidorCentralSocket;

/**
 *
 * @author Alexander
 */
public class AgenciaViajes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //IServidorCentral servidor = new ServicioServidorCentralSocket();
        //servidor.consultarPlanesServicio();
        GUIClientesPotenciales vista = new GUIClientesPotenciales();
        vista.setVisible(true);
    }
    
}
