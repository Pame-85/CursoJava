package com.javaintro.model;

/**
 * Representa una persona
 * 
 * @author javaintro
 * @version 1.0
 */

public class persona {
    private Integer id;
    private String nombre;

    public persona() {
    }

    /**
     * Constructor
     * 
     * @param id     id de la persona
     * @param nombre nombre de la persona
     */
    public persona(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        persona other = (persona) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "persona [id=" + id + ", nombre=" + nombre + "]";
    }

}
