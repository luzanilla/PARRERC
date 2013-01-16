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
public class Turno {
    private String id_turno;
    private String escuela;
    private String zona_escolar;
    private String municipio;
    private int frecuencia_turno = 0;
    private double puntaje_total_turno = 0.0;
    private double puntaje_promedio_turno;
    private double porcentaje_aciertos_turno;
    private List<Grupo> grupos;
    private double[] puntaje_total_ua;
    private double[] frecuencia_ua;  
    private double[] promedios_ua;
    private double[] porcentajes_aciertos_ua;
    private JFreeChart grafica_ua_grupos;

    public JFreeChart getGrafica_ua_grupos() {
        return grafica_ua_grupos;
    }

    public void setGrafica_ua_grupos(JFreeChart grafica_ua_grupos) {
        this.grafica_ua_grupos = grafica_ua_grupos;
    }

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

    public String getId_turno() {
        return id_turno;
    }

    public void setId_turno(String id_turno) {
        this.id_turno = id_turno;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
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

    public int getFrecuencia_turno() {
        return frecuencia_turno;
    }

    public void setFrecuencia_turno(int frecuencia_turno) {
        this.frecuencia_turno = frecuencia_turno;
    }

    public double getPuntaje_total_turno() {
        return puntaje_total_turno;
    }

    public void setPuntaje_total_turno(double puntaje_total_turno) {
        this.puntaje_total_turno = puntaje_total_turno;
    }

    public double getPuntaje_promedio_turno() {
        return puntaje_promedio_turno;
    }

    public void setPuntaje_promedio_turno(double puntaje_promedio_turno) {
        this.puntaje_promedio_turno = puntaje_promedio_turno;
    }

    public double getPorcentaje_aciertos_turno() {
        return porcentaje_aciertos_turno;
    }

    public void setPorcentaje_aciertos_turno(double porcentaje_aciertos_turno) {
        this.porcentaje_aciertos_turno = porcentaje_aciertos_turno;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }
    
    public Turno(String id_turno, String escuela, String zona_escolar, String municipio) {
        this.id_turno = id_turno;
        this.escuela = escuela;
        this.zona_escolar = zona_escolar;
        this.municipio = municipio;
    }
        
}
