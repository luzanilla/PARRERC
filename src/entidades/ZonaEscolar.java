/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.List;

/**
 *
 * @author Erick
 */
public class ZonaEscolar {
    private String municipio;
    private String nombre_zona_escolar;
    private int frecuencia_zona_escolar = 0;
    private double puntaje_total_zona_escolar = 0.0;
    private double puntaje_promedio_zona_escolar;
    private double porcentaje_aciertos_zona_escolar;
    private List<Escuela> escuelas;

    public List<Escuela> getEscuelas() {
        return escuelas;
    }

    public void setEscuelas(List<Escuela> escuelas) {
        this.escuelas = escuelas;
    }

    public String getNombre_zona_escolar() {
        return nombre_zona_escolar;
    }

    public void setNombre_zona_escolar(String nombre_zona_escolar) {
        this.nombre_zona_escolar = nombre_zona_escolar;
    }

    public int getFrecuencia_zona_escolar() {
        return frecuencia_zona_escolar;
    }

    public void setFrecuencia_zona_escolar(int frecuencia_zona_escolar) {
        this.frecuencia_zona_escolar = frecuencia_zona_escolar;
    }

    public double getPuntaje_total_zona_escolar() {
        return puntaje_total_zona_escolar;
    }

    public void setPuntaje_total_zona_escolar(double puntaje_total_zona_escolar) {
        this.puntaje_total_zona_escolar = puntaje_total_zona_escolar;
    }

    public double getPuntaje_promedio_zona_escolar() {
        return puntaje_promedio_zona_escolar;
    }

    public void setPuntaje_promedio_zona_escolar(double puntaje_promedio_zona_escolar) {
        this.puntaje_promedio_zona_escolar = puntaje_promedio_zona_escolar;
    }

    public double getPorcentaje_aciertos_zona_escolar() {
        return porcentaje_aciertos_zona_escolar;
    }

    public void setPorcentaje_aciertos_zona_escolar(double porcentaje_aciertos_zona_escolar) {
        this.porcentaje_aciertos_zona_escolar = porcentaje_aciertos_zona_escolar;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }    
    
    public ZonaEscolar() {
        
    }
    
    public ZonaEscolar(String nombre_zona, String nombre_municipio) {
        this.nombre_zona_escolar = nombre_zona;
        this.municipio = nombre_municipio;
    }
}
