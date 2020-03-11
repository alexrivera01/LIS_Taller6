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
public class Plan {
    private String id;
    private String nombre;
    private String descripcion;
    private String rangoEdad1;
    private String rangoEdad2;


    public Plan(){
        
    }
    
    public Plan( String id,String nombre,String descripcion,String rangoEdad1,String rangoEdad2){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.rangoEdad1 = rangoEdad1;
        this.rangoEdad2 = rangoEdad2;
    }
    
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the rangoEdad1
     */
    public String getRangoEdad1() {
        return rangoEdad1;
    }

    /**
     * @param rangoEdad1 the rangoEdad1 to set
     */
    public void setRangoEdad1(String rangoEdad1) {
        this.rangoEdad1 = rangoEdad1;
    }

    /**
     * @return the rangoEdad2
     */
    public String getRangoEdad2() {
        return rangoEdad2;
    }

    /**
     * @param rangoEdad2 the rangoEdad2 to set
     */
    public void setRangoEdad2(String rangoEdad2) {
        this.rangoEdad2 = rangoEdad2;
    }
}
