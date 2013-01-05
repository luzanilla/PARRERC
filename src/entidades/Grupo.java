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
public class Grupo {
    private String id_grupo;
    private String turno;
    private String escuela;
    private String zona_escolar;
    private String municipio;
    private int frecuencia_grupo = 0;
    private double puntaje_total_grupo = 0.0;
    private double puntaje_promedio_grupo;
    private double porcentaje_aciertos_grupo;
    private List<Alumno> alumnos;

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public int getFrecuencia_grupo() {
        return frecuencia_grupo;
    }

    public void setFrecuencia_grupo(int frecuencia_grupo) {
        this.frecuencia_grupo = frecuencia_grupo;
    }

    public double getPuntaje_total_grupo() {
        return puntaje_total_grupo;
    }

    public void setPuntaje_total_grupo(double puntaje_total_grupo) {
        this.puntaje_total_grupo = puntaje_total_grupo;
    }

    public double getPuntaje_promedio_grupo() {
        return puntaje_promedio_grupo;
    }

    public void setPuntaje_promedio_grupo(double puntaje_promedio_grupo) {
        this.puntaje_promedio_grupo = puntaje_promedio_grupo;
    }

    public double getPorcentaje_aciertos_grupo() {
        return porcentaje_aciertos_grupo;
    }

    public void setPorcentaje_aciertos_grupo(double porcentaje_aciertos_grupo) {
        this.porcentaje_aciertos_grupo = porcentaje_aciertos_grupo;
    }

    public String getId_grupo() {
        return id_grupo;
    }

    public void setId_grupo(String id_grupo) {
        this.id_grupo = id_grupo;
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
    
    public Grupo(String id_grupo, String turno, String escuela, String zona_escolar, String municipio) {
        this.id_grupo = id_grupo;
        this.turno = turno;
        this.escuela = escuela;
        this.zona_escolar = zona_escolar;
        this.municipio = municipio;
    }
}
