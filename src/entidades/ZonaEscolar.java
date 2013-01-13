/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.List;
import org.jfree.chart.JFreeChart;

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
    private JFreeChart grafica_rg_zona;
    private JFreeChart grafica_rg_zona_esc_turno;
    private double[] puntaje_total_ua;
    private double[] frecuencia_ua;  
    private double[] promedios_ua;
    private double[] porcentajes_aciertos_ua;

    public double[] getPuntaje_total_ua() {
        return puntaje_total_ua;
    }

    public void setPuntaje_total_ua(double[] puntaje_total_ua) {
        this.puntaje_total_ua = puntaje_total_ua;
    }

    public double[] getFrecuencia_ua() {
        return frecuencia_ua;
    }

    public void setFrecuencia_ua(double[] frecuencia_ua) {
        this.frecuencia_ua = frecuencia_ua;
    }

    public double[] getPromedios_ua() {
        return promedios_ua;
    }

    public void setPromedios_ua(double[] promedios_ua) {
        this.promedios_ua = promedios_ua;
    }

    public double[] getPorcentajes_aciertos_ua() {
        return porcentajes_aciertos_ua;
    }

    public void setPorcentajes_aciertos_ua(double[] porcentajes_aciertos_ua) {
        this.porcentajes_aciertos_ua = porcentajes_aciertos_ua;
    }    

    public JFreeChart getGrafica_rg_zona_esc_turno() {
        return grafica_rg_zona_esc_turno;
    }

    public void setGrafica_rg_zona_esc_turno(JFreeChart grafica_rg_zona_esc_turno) {
        this.grafica_rg_zona_esc_turno = grafica_rg_zona_esc_turno;
    }

    public JFreeChart getGrafica_rg_zona() {
        return grafica_rg_zona;
    }

    public void setGrafica_rg_zona(JFreeChart grafica_rg_zona) {
        this.grafica_rg_zona = grafica_rg_zona;
    }

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
