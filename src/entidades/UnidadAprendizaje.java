/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.List;

/**
 *
 * @author UEE
 */
public class UnidadAprendizaje {
    private List<String> items;
    private String nombre;

    public UnidadAprendizaje(String nombre, List<String> items) {
        this.nombre = nombre;
        this.items = items;
    }
    
    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        
}
