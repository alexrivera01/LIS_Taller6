/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaviajes.negocio;

import avenciaviajes.acceso.IServidorCentral;
import avenciaviajes.acceso.ServicioServidorCentralSocket;

/**
 *
 * @author Alexander
 */
public class GestorClientesPotenciales {
    ConectorJdbc conector;
    IServidorCentral servidorCentral;
    
    public GestorClientesPotenciales(){
        this.conector = new ConectorJdbc();
        this.servidorCentral = new ServicioServidorCentralSocket();
    }
    
}
