/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaviajes.presentacion;

import agenciaviajes.negocio.GestorClientesPotenciales;
import java.awt.event.ActionEvent;
import mvcf.AController;

/**
 *
 * @author Alexander
 */
public class GUIClientesPotencialesController extends AController {

    private GestorClientesPotenciales gestor; // Modelo
    private GUIClientesPotenciales vista; //Vista
    
    public GUIClientesPotencialesController(GestorClientesPotenciales gestor,GUIClientesPotenciales vista){
        this.gestor = gestor;
        this.vista = vista;
    }
    
    @Override
    public void actualizar(ActionEvent ae) {
    }
    
    
}
