/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaviajes.negocio;

/**
 *
 * @author Alexander
 */
public class Cliente {
    /**
     * Numero de Identificacion del cliente
     */
    private String identificacion;
    /**
     * Nombre del cliente
     */
    private String nombre;
    /**
     * Apellidos del cliente
     */
    private String apellidos;
    /**
     * Fecha de nacimiento
     */

    private String genero;
    /**
     * Direccion de residencia
     */

    private String email;
    
    private String edad;
    
    public Cliente() {
    }

    /**
     * Constructor parametrizado
     * @param id
     * @param nombres
     * @param apellidos
     * @param email
     * @param genero
     * @param edad
     * @param celular
     * @param sexo 
     */
    public Cliente(String id, String nombres, String apellidos, String email, String genero , String edad) {
        this.identificacion = id;
        this.nombre = nombres;
        this.apellidos = apellidos;
        this.genero = genero;
        this.email = email;
        this.edad = edad;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

   
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the edad
     */
    public String getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }
    
}
