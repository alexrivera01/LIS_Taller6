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
public class GestorPlanes {
    ArrayList<Plan> listado;
    private final ConectorJdbc conector;

    /**
     * Constructor por defecto
     */
    public GestorPlanes() {
        this.listado = new ArrayList<>();
        this.conector = new ConectorJdbc();
    }
    
    /**
     * Consulta todos los usuarios registrados en la base de datos
     * @return ArrayList con el listado de los usuarios encontrados
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public ArrayList<Plan> consultarPlanes() throws ClassNotFoundException, SQLException{
        conector.conectarse();
        conector.crearConsulta("SELECT * FROM Plan;");
        ArrayList<Plan> usuarios = new ArrayList();

        while (conector.getResultado().next()) {
            Plan pla = new Plan(conector.getResultado().getString("id"),
                                          conector.getResultado().getString("nombre"),
                                          conector.getResultado().getString("descripcion"),
                                          conector.getResultado().getString("rangoEdad1"),
                                          conector.getResultado().getString("rangoEdad2"));
            usuarios.add(pla);
        }
        conector.desconectarse();
        return usuarios;
    }
}
