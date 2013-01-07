/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Erick
 */
public class Alumno {

    public Alumno(){
        respuestas = new ArrayList<>();
    }
    
    public Alumno(int num_items){
        respuestas = new ArrayList<>();
        this.num_items = num_items;
        respuestas_calificadas = new int[this.num_items];
    }

    @Override
    public String toString() {
        return this.getAciertos() + " " + this.getId() + " " + this.getCuartil();
    }
    
    public String getDatosAlumno() {
        return this.getId() + " " + this.getModelo() + " " + this.getRespuestas();
    }

    public int numRespuestas() {
        return this.respuestas.size();
    }

    public void addRespuesta(String res) {
        this.respuestas.add(res);        
    }

    public String getRespuesta(int indice) {
        return this.respuestas.get(indice);
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId(){
        return this.id;
    }

    public int getAciertos() {
        return this.aciertos;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
        
        double ac = (double) this.aciertos;
        this.setPorcentaje_aciertos((ac/this.respuestas_calificadas.length)*100);
    }
    
    public double getPorcentaje_aciertos() {
        return porcentaje_aciertos;
    }

    public void setPorcentaje_aciertos(double porcentaje_aciertos) {
        this.porcentaje_aciertos = porcentaje_aciertos;
    }

    public int getCuartil() {
        return this.cuartil;
    }

    public void setCuartil(int cuartil) {
        this.cuartil = cuartil;
    }    

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getRespuestas() {
        return this.respuestas.toArray().toString();
    }
    
    public void addRespuestaCalificada(int valor, int indice) {
        this.respuestas_calificadas[indice] = valor;
    }
    
    public int getRespuestaCalificada(int indice) {
        return this.respuestas_calificadas[indice];
    }
    
    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
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

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }    
    
    private List<String> respuestas;
    private String id;
    private String modelo;
    private int aciertos = 0;
    private double porcentaje_aciertos = 0.0;    
    private int cuartil = 0;
    private int[] respuestas_calificadas;
    private int num_items;
    private String grupo;
    private String turno;
    private String escuela;
    private String zona_escolar;
    private String municipio;    
    
}
