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
public class ModeloExamen {
    //Variables de la lectura de la BD
    private List<String> variables;
    private List<String> vars_items;    
    private List<String> vars_contexto;
    private List<String> clavesRespuesta;
    private List<Alumno> alumnos;
    private List<Alumno> alumnosOrdenada;
    private List<String> opcionesRespuesta;
    private String nombreModelo;
    private String varIdSujeto;
    private String varMunicipio;
    private String varZonaEscolar;
    private String varEscuela;
    private String varTurno;
    private String varGrupo;
    private int indice_inicio_items;
    private int indice_fin_items;
    private int rango_minimo = 0;
    private int rango_maximo = 0;
    private int numero_de_items = 0;
    private int numero_de_examinados = 0;
    
    //Variables del análisis psicométrico
    double[] dificultad_reactivos;
    double[] discriminacion_reactivos;
    int[][] frecuencias_distractores;
    
    //Variables de análisis gráfico de ítems
    private List<JFreeChart> graficasPor;
    private List<JFreeChart> graficasFrec;
    
    //Variables del análisis de versiones de la prueba
    private double confiabilidad = 0;
    private double mediaDif = 0;
    private double mediaDis = 0;    
    private double[] respuestas_calificadas_item;
    private double[] totalAciertos;
    
    //Variables del análisis de Caracterización de examinados
    private String[] caract_variables_seleccionadas;        
    private List<String>[] caract_opciones_respuesta;
    private List<Integer>[] caract_frecuencias_distractores;
    private List<JFreeChart> caract_graficas;
    
    //Variables de constructor de unidad de aprendizaje
    private List<UnidadAprendizaje> unidades_aprendizaje;
    
    //Variables de define variables para el análisis
    private boolean por_municipio;
    private boolean por_zona_escolar;
    private boolean por_escuela;
    private boolean por_grupo;
    private boolean despliega_graficas;
    private boolean despliega_anova;

    //Variables de resultados generales
    //por municipio
    private List<String> opciones_respuesta_municipio;
    private List<Double> puntaje_promedio_municipio;
    private List<Double> porcentaje_aciertos_municipio;
    //por zona escolar y municipio
    private List<ZonaEscolar>[] zona_escolar_por_municipio;
    private JFreeChart grafica_rg_municipio;
    private List<JFreeChart> graficas_rg_zona_escolar;

    public JFreeChart getGrafica_rg_municipio() {
        return grafica_rg_municipio;
    }

    public void setGrafica_rg_municipio(JFreeChart grafica_rg_municipio) {
        this.grafica_rg_municipio = grafica_rg_municipio;
    }

    public List<JFreeChart> getGraficas_rg_zona_escolar() {
        return graficas_rg_zona_escolar;
    }

    public void setGraficas_rg_zona_escolar(List<JFreeChart> graficas_rg_zona_escolar) {
        this.graficas_rg_zona_escolar = graficas_rg_zona_escolar;
    }
            
    //Reiniciamos la selección de tipo de análisis
    public void reiniciarSeleccionAnalisis() {
        this.por_municipio = false;
        this.por_zona_escolar = false;
        this.por_escuela = false;
        this.por_grupo = false;
        this.despliega_graficas = false;
        this.despliega_anova = false;
    }

    public List<ZonaEscolar>[] getZona_escolar_por_municipio() {
        return zona_escolar_por_municipio;
    }

    public void setZona_escolar_por_municipio(List<ZonaEscolar>[] zona_escolar_por_municipio) {
        this.zona_escolar_por_municipio = zona_escolar_por_municipio;
    }

    public List<Double> getPorcentaje_aciertos_municipio() {
        return porcentaje_aciertos_municipio;
    }

    public void setPorcentaje_aciertos_municipio(List<Double> porcentaje_aciertos_municipio) {
        this.porcentaje_aciertos_municipio = porcentaje_aciertos_municipio;
    }

    public List<Double> getPuntaje_promedio_municipio() {
        return puntaje_promedio_municipio;
    }

    public void setPuntaje_promedio_municipio(List<Double> puntaje_promedio_municipio) {
        this.puntaje_promedio_municipio = puntaje_promedio_municipio;
    }

    public List<String> getOpciones_respuesta_municipio() {
        return opciones_respuesta_municipio;
    }

    public void setOpciones_respuesta_municipio(List<String> opciones_respuesta_municipio) {
        this.opciones_respuesta_municipio = opciones_respuesta_municipio;
    }            
    
    public boolean isPor_municipio() {
        return por_municipio;
    }

    public void setPor_municipio(boolean por_municipio) {
        this.por_municipio = por_municipio;
    }

    public boolean isPor_zona_escolar() {
        return por_zona_escolar;
    }

    public void setPor_zona_escolar(boolean por_zona_escolar) {
        this.por_zona_escolar = por_zona_escolar;
    }

    public boolean isPor_escuela() {
        return por_escuela;
    }

    public void setPor_escuela(boolean por_escuela) {
        this.por_escuela = por_escuela;
    }

    public boolean isPor_grupo() {
        return por_grupo;
    }

    public void setPor_grupo(boolean por_grupo) {
        this.por_grupo = por_grupo;
    }

    public boolean isDespliega_graficas() {
        return despliega_graficas;
    }

    public void setDespliega_graficas(boolean despliega_graficas) {
        this.despliega_graficas = despliega_graficas;
    }

    public boolean isDespliega_anova() {
        return despliega_anova;
    }

    public void setDespliega_anova(boolean despliega_anova) {
        this.despliega_anova = despliega_anova;
    }

    
    public List<UnidadAprendizaje> getUnidades_aprendizaje() {
        return unidades_aprendizaje;
    }

    public void setUnidades_aprendizaje(List<UnidadAprendizaje> unidades_aprendizaje) {
        this.unidades_aprendizaje = unidades_aprendizaje;
    }

    public List<JFreeChart> getCaract_graficas() {
        return caract_graficas;
    }

    public void setCaract_graficas(List<JFreeChart> caract_graficas) {
        this.caract_graficas = caract_graficas;
    }
    
    public String[] getCaract_variables_seleccionadas() {
        return caract_variables_seleccionadas;
    }

    public void setCaract_variables_seleccionadas(String[] caract_variables_seleccionadas) {
        this.caract_variables_seleccionadas = caract_variables_seleccionadas;
    }

    public List<String>[] getCaract_opciones_respuesta() {
        return caract_opciones_respuesta;
    }

    public void setCaract_opciones_respuesta(List<String>[] caract_opciones_respuesta) {
        this.caract_opciones_respuesta = caract_opciones_respuesta;
    }

    public List<Integer>[] getCaract_frecuencias_distractores() {
        return caract_frecuencias_distractores;
    }

    public void setCaract_frecuencias_distractores(List<Integer>[] caract_frecuencias_distractores) {
        this.caract_frecuencias_distractores = caract_frecuencias_distractores;
    }    
    
    public double[] getTotalAciertosItem(int indice) {        
        int totalAciertosItem = 0;
        
        for(Alumno a : alumnosOrdenada) {
            totalAciertosItem += a.getRespuestaCalificada(indice);
        }
        
        return totalAciertos;
    }

    public double[] getTotalAciertos() {
        int i = 0;
        totalAciertos = new double[getNumero_de_examinados()];
        
        for(Alumno a : alumnosOrdenada) {
            totalAciertos[i] = a.getAciertos();            
            i++;
        }
        
        return totalAciertos;
    }

    public void setTotalAciertos(double[] totalAciertos) {
        this.totalAciertos = totalAciertos;
    }

    public double[] getRespuestas_calificadas_item(int indice) {
        int i = 0;
        respuestas_calificadas_item = new double[getNumero_de_examinados()];
        
        for(Alumno a : alumnosOrdenada) {
            respuestas_calificadas_item[i] = a.getRespuestaCalificada(indice);            
            i++;
        }
        
        return respuestas_calificadas_item;
    }

    public void setRespuestas_calificadas_item(double[] respuestas_calificadas_item) {
        this.respuestas_calificadas_item = respuestas_calificadas_item;
    }

    public double getConfiabilidad() {
        return confiabilidad;
    }

    public void setConfiabilidad(double confiabilidad) {
        this.confiabilidad = confiabilidad;
    }

    public double getMediaDif() {
        return mediaDif;
    }

    public void setMediaDif(double mediaDif) {
        this.mediaDif = mediaDif;
    }

    public double getMediaDis() {
        return mediaDis;
    }

    public void setMediaDis(double mediaDis) {
        this.mediaDis = mediaDis;
    }

    public int getRango_minimo() {
        return rango_minimo;
    }

    public void setRango_minimo(int rango_minimo) {
        this.rango_minimo = rango_minimo;
    }

    public int getRango_maximo() {
        return rango_maximo;
    }

    public void setRango_maximo(int rango_maximo) {
        this.rango_maximo = rango_maximo;
    }

    public int getNumero_de_items() {
        return numero_de_items;
    }

    public void setNumero_de_items(int numero_de_items) {
        this.numero_de_items = numero_de_items;
    }

    public int getNumero_de_examinados() {
        return numero_de_examinados;
    }

    public void setNumero_de_examinados(int numero_de_examinados) {
        this.numero_de_examinados = numero_de_examinados;
    }

    public List<JFreeChart> getGraficasFrec() {
        return graficasFrec;
    }

    public void setGraficasFrec(List<JFreeChart> graficasFrec) {
        this.graficasFrec = graficasFrec;
    }

    public List<JFreeChart> getGraficasPor() {
        return graficasPor;
    }

    public void setGraficasPor(List<JFreeChart> graficasPor) {
        this.graficasPor = graficasPor;
    }

    public double[] getDificultad_reactivos() {
        return dificultad_reactivos;
    }

    public void setDificultad_reactivos(double[] dificultad_reactivos) {
        this.dificultad_reactivos = dificultad_reactivos;
    }

    public double[] getDiscriminacion_reactivos() {
        return discriminacion_reactivos;
    }

    public void setDiscriminacion_reactivos(double[] discriminacion_reactivos) {
        this.discriminacion_reactivos = discriminacion_reactivos;
    }

    public int[][] getFrecuencias_distractores() {
        return frecuencias_distractores;
    }

    public void setFrecuencias_distractores(int[][] frecuencias_distractores) {
        this.frecuencias_distractores = frecuencias_distractores;
    }    

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public List<Alumno> getAlumnosOrdenada() {
        return alumnosOrdenada;
    }

    public void setAlumnosOrdenada(List<Alumno> alumnosOrdenada) {
        this.alumnosOrdenada = alumnosOrdenada;
    }

    public List<String> getOpcionesRespuesta() {
        return opcionesRespuesta;
    }

    public void setOpcionesRespuesta(List<String> opcionesRespuesta) {
        this.opcionesRespuesta = opcionesRespuesta;
    }
    
    public int getIndice_inicio_items() {
        return indice_inicio_items;
    }

    public void setIndice_inicio_items(int indice_inicio_items) {
        this.indice_inicio_items = indice_inicio_items;
    }

    public int getIndice_fin_items() {
        return indice_fin_items;
    }

    public void setIndice_fin_items(int indice_fin_items) {
        this.indice_fin_items = indice_fin_items;
    }    

    public List<String> getClavesRespuesta() {
        return clavesRespuesta;
    }

    public void setClavesRespuesta(List<String> clavesRespuesta) {
        this.clavesRespuesta = clavesRespuesta;
    }       

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }
    
    public List<String> getVars_items() {
        return vars_items;
    }

    public void setVars_items(List<String> vars_items) {
        this.vars_items = vars_items;
    }

    public List<String> getVars_contexto() {
        return vars_contexto;
    }

    public void setVars_contexto(List<String> vars_contexto) {
        this.vars_contexto = vars_contexto;
    }

    public List<String> getVariables() {
        return variables;
    }

    public void setVariables(List<String> variables) {
        this.variables = variables;
    }
    
    public List<String> getNombresItems() {
        return variables.subList(this.indice_inicio_items, (this.indice_fin_items+1));
    }
    
    public ModeloExamen() {
        
    }

    public void setVarIdSujeto(String variable_id) {
        this.varIdSujeto = variable_id;
    }
    
    public String getVarIdSujeto() {
        return this.varIdSujeto;
    }
    
    public String getVarMunicipio() {
        return varMunicipio;
    }

    public void setVarMunicipio(String varMunicipio) {
        this.varMunicipio = varMunicipio;
    }

    public String getVarZonaEscolar() {
        return varZonaEscolar;
    }

    public void setVarZonaEscolar(String varZonaEscolar) {
        this.varZonaEscolar = varZonaEscolar;
    }

    public String getVarEscuela() {
        return varEscuela;
    }

    public void setVarEscuela(String varEscuela) {
        this.varEscuela = varEscuela;
    }

    public String getVarTurno() {
        return varTurno;
    }

    public void setVarTurno(String varTurno) {
        this.varTurno = varTurno;
    }

    public String getVarGrupo() {
        return varGrupo;
    }

    public void setVarGrupo(String varGrupo) {
        this.varGrupo = varGrupo;
    }
    
    public int getIndiceVarIdSujeto() {
        return this.variables.indexOf(this.varIdSujeto);
    }
    
    public int getIndiceVar(String var) {
        return this.variables.indexOf(var);
    }
}
