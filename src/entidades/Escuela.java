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
public class Escuela {
    private String id_escuela;
    private String zona_escolar;
    private String municipio;
    private int frecuencia_escuela = 0;
    private double puntaje_total_escuela = 0.0;
    private double puntaje_promedio_escuela;
    private double porcentaje_aciertos_escuela;
    private List<Turno> turnos;
    private JFreeChart grafica_rg_trunos_grupos;
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

    public JFreeChart getGrafica_rg_trunos_grupos() {
        return grafica_rg_trunos_grupos;
    }

    public void setGrafica_rg_trunos_grupos(JFreeChart grafica_rg_trunos_grupos) {
        this.grafica_rg_trunos_grupos = grafica_rg_trunos_grupos;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }

    public int getFrecuencia_escuela() {
        return frecuencia_escuela;
    }

    public void setFrecuencia_escuela(int frecuencia_escuela) {
        this.frecuencia_escuela = frecuencia_escuela;
    }

    public double getPuntaje_total_escuela() {
        return puntaje_total_escuela;
    }

    public void setPuntaje_total_escuela(double puntaje_total_escuela) {
        this.puntaje_total_escuela = puntaje_total_escuela;
    }

    public double getPuntaje_promedio_escuela() {
        return puntaje_promedio_escuela;
    }

    public void setPuntaje_promedio_escuela(double puntaje_promedio_escuela) {
        this.puntaje_promedio_escuela = puntaje_promedio_escuela;
    }

    public double getPorcentaje_aciertos_escuela() {
        return porcentaje_aciertos_escuela;
    }

    public void setPorcentaje_aciertos_escuela(double porcentaje_aciertos_escuela) {
        this.porcentaje_aciertos_escuela = porcentaje_aciertos_escuela;
    }

    public String getId_escuela() {
        return id_escuela;
    }

    public void setId_escuela(String id_escuela) {
        this.id_escuela = id_escuela;
    }

    public String getZona_escolar() {
        return zona_escolar;
    }

    public void setZona_escolar(String zona_escolar) {
        this.zona_escolar = zona_escolar;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
    public Escuela(String id_escuela, String zona_escolar, String municipio) {
        this.id_escuela = id_escuela;
        this.zona_escolar = zona_escolar;
        this.municipio = municipio;
    }
}
