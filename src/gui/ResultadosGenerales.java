/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entidades.Alumno;
import entidades.Escuela;
import entidades.Grupo;
import entidades.ModeloExamen;
import entidades.Turno;
import entidades.ZonaEscolar;
import java.awt.Dimension;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;
import org.jfree.chart.JFreeChart;

/**
 *
 * @author Erick
 */
public class ResultadosGenerales extends javax.swing.JInternalFrame {

    private List<ModeloExamen> modelosExamenes;
    private DefineVariablesAnalisis dv;
    //Por municipio
    private List<String> opciones_respuesta_municipio;
    private List<Integer> frecuencias_op_res_municipio;
    private List<Double> puntaje_total_municipio;
    private List<Double> puntaje_promedio_municipio;
    private List<Double> porcentaje_aciertos_municipio;   
    //Por municipio y zona escolar
    private List<ZonaEscolar>[] zona_escolar_por_municipio;    
    
    /**
     * Creates new form ResultadosGenerales
     */
    public ResultadosGenerales(List<ModeloExamen> modelosExamenes, JDesktopPane jDesktopPane1) {
        this.modelosExamenes = modelosExamenes;
        initComponents();
        
        dv = new DefineVariablesAnalisis(this.modelosExamenes, jDesktopPane1);
        
        realizarAnalisis();
        pintar_resultados();
        
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension jInternalFrameSize = this.getSize();

        this.setLocation((desktopSize.width - jInternalFrameSize.width)/2, (desktopSize.height- jInternalFrameSize.height)/2);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        panel_resultados = new javax.swing.JEditorPane();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Resultados generales");

        panel_resultados.setEditable(false);
        panel_resultados.setContentType("text/html");
        jScrollPane1.setViewportView(panel_resultados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JEditorPane panel_resultados;
    // End of variables declaration//GEN-END:variables

    private void realizarAnalisis() {
        for(int i=0; i<this.modelosExamenes.size(); i++) {
            
            if(this.modelosExamenes.get(i).isPor_municipio()) {
                calcularPorMunicipio(i);                
            }
            
            if(this.modelosExamenes.get(i).isPor_zona_escolar()) {
                calcularPorZonaEscolar(i);
            }
            
            if(this.modelosExamenes.get(i).isPor_escuela()) {
                calcularPorEscuela(i);                
            }
                        
        }
    }

    private void calcularPorMunicipio(int indice_modelo) {                
        int indiceVar = this.modelosExamenes.get(indice_modelo).getIndiceVar(this.modelosExamenes.get(indice_modelo).getVarMunicipio());
        
        opciones_respuesta_municipio = new ArrayList<>();
        frecuencias_op_res_municipio = new ArrayList<>();
        puntaje_total_municipio = new ArrayList<>();
        puntaje_promedio_municipio = new ArrayList<>();
        porcentaje_aciertos_municipio = new ArrayList<>();
        
        //Calculamos la frecuencia de cada municipio y su puntaje total para despues calcular el puntaje promedio por municipio y porcentaje de aciertos
        for(int i=0; i<this.modelosExamenes.get(indice_modelo).getNumero_de_examinados(); i++) {            
            String respuesta;               
            double aciertos;

            respuesta = this.modelosExamenes.get(indice_modelo).getAlumnosOrdenada().get(i).getRespuesta(indiceVar);
            aciertos = this.modelosExamenes.get(indice_modelo).getAlumnosOrdenada().get(i).getAciertos();

            if( !opciones_respuesta_municipio.contains(respuesta) ) {
                opciones_respuesta_municipio.add(respuesta);
                frecuencias_op_res_municipio.add(new Integer(1));
                puntaje_total_municipio.add(new Double(aciertos));
            } else {
                int indice_respuesta = opciones_respuesta_municipio.indexOf(respuesta);

                if(indice_respuesta!=-1) {
                    int cont = frecuencias_op_res_municipio.get(indice_respuesta).intValue();
                    cont++;
                    frecuencias_op_res_municipio.set(indice_respuesta, new Integer(cont));
                    aciertos += puntaje_total_municipio.get(indice_respuesta); 
                    puntaje_total_municipio.set(indice_respuesta, new Double(aciertos));
                } else {
                    System.out.println("Algo raro esta pasando");
                }
            }
            
        }
        
        //Calculamos el puntaje promedio por municipio y porcentaje de aciertos
        for(int i=0; i<opciones_respuesta_municipio.size(); i++) {
            double promedio = (puntaje_total_municipio.get(i).doubleValue()/frecuencias_op_res_municipio.get(i).intValue());
            puntaje_promedio_municipio.add(promedio);            
            porcentaje_aciertos_municipio.add(promedio/this.modelosExamenes.get(indice_modelo).getNumero_de_items());
            
            System.out.println(promedio);
        }
        
        this.modelosExamenes.get(indice_modelo).setOpciones_respuesta_municipio(opciones_respuesta_municipio);
        this.modelosExamenes.get(indice_modelo).setPuntaje_promedio_municipio(puntaje_promedio_municipio);
        this.modelosExamenes.get(indice_modelo).setPorcentaje_aciertos_municipio(porcentaje_aciertos_municipio);
    }

    private void calcularPorZonaEscolar(int indice_modelo) {
        //Si eligió la opción por municipio calculamos las zonas escolares por municipio
        if(this.modelosExamenes.get(indice_modelo).isPor_municipio()) {
            zona_escolar_por_municipio = new ArrayList[this.opciones_respuesta_municipio.size()];
            int indice_municipio = this.modelosExamenes.get(indice_modelo).getIndiceVar(this.modelosExamenes.get(indice_modelo).getVarMunicipio());
            int indice_zona_escolar = this.modelosExamenes.get(indice_modelo).getIndiceVar(this.modelosExamenes.get(indice_modelo).getVarZonaEscolar());
            
            for(int i=0; i<this.modelosExamenes.get(indice_modelo).getNumero_de_examinados(); i++) {                
                String municipio = this.modelosExamenes.get(indice_modelo).getAlumnosOrdenada().get(i).getRespuesta(indice_municipio);
                String zona_escolar = this.modelosExamenes.get(indice_modelo).getAlumnosOrdenada().get(i).getRespuesta(indice_zona_escolar);
                double aciertos = this.modelosExamenes.get(indice_modelo).getAlumnosOrdenada().get(i).getAciertos();
                
                int indice_opcion_municipio = this.modelosExamenes.get(indice_modelo).getOpciones_respuesta_municipio().indexOf(municipio);
                
                List<ZonaEscolar> zonas_temp;
                if(zona_escolar_por_municipio[indice_opcion_municipio]==null) {                    
                    zonas_temp = new ArrayList();
                } else {
                    zonas_temp = zona_escolar_por_municipio[indice_opcion_municipio];
                }
                
                boolean flag = false;
                int j=0;
                
                for(j=0; j<zonas_temp.size(); j++) {
                    if(zonas_temp.get(j).getNombre_zona_escolar().equalsIgnoreCase(zona_escolar)) {
                        flag = true;
                        break;
                    }
                }
                
                ZonaEscolar zona;
                if(flag) {
                    zona = zonas_temp.get(j);
                } else {
                    zona = new ZonaEscolar(zona_escolar, municipio);
                }                                              
                
                zona.setFrecuencia_zona_escolar( (zona.getFrecuencia_zona_escolar()+1) );
                zona.setPuntaje_total_zona_escolar( (zona.getPuntaje_total_zona_escolar()+aciertos) );
                
                if(flag) {
                    zonas_temp.set(j, zona);
                } else {
                    zonas_temp.add(zona);
                }
                
                zona_escolar_por_municipio[indice_opcion_municipio] = zonas_temp;
                this.modelosExamenes.get(indice_modelo).setZona_escolar_por_municipio(zona_escolar_por_municipio);
            }
            
        }
        
        //Calcular puntaje promedio, porcentaje e imprimir resultados
        for(int i=0; i<this.modelosExamenes.get(indice_modelo).getOpciones_respuesta_municipio().size(); i++) {
            for(int j=0; j<this.modelosExamenes.get(indice_modelo).getZona_escolar_por_municipio()[i].size(); j++) {                
                
                double puntaje_promedio = this.modelosExamenes.get(indice_modelo).getZona_escolar_por_municipio()[i].get(j).getPuntaje_total_zona_escolar()/this.modelosExamenes.get(indice_modelo).getZona_escolar_por_municipio()[i].get(j).getFrecuencia_zona_escolar();
                double porcentaje = (puntaje_promedio/this.modelosExamenes.get(indice_modelo).getNumero_de_items())*100;
                
                this.modelosExamenes.get(indice_modelo).getZona_escolar_por_municipio()[i].get(j).setPuntaje_promedio_zona_escolar(puntaje_promedio);
                this.modelosExamenes.get(indice_modelo).getZona_escolar_por_municipio()[i].get(j).setPorcentaje_aciertos_zona_escolar(puntaje_promedio);
                
                System.out.println(this.modelosExamenes.get(indice_modelo).getOpciones_respuesta_municipio().get(i) + ": " + this.modelosExamenes.get(indice_modelo).getZona_escolar_por_municipio()[i].get(j).getNombre_zona_escolar() + " : " + this.modelosExamenes.get(indice_modelo).getZona_escolar_por_municipio()[i].get(j).getFrecuencia_zona_escolar() + " : " + this.modelosExamenes.get(indice_modelo).getZona_escolar_por_municipio()[i].get(j).getPuntaje_total_zona_escolar() + " : Puntaje promedio=" + puntaje_promedio + " : Porcentaje=" + porcentaje);
                
            }
        }
    }

    private void calcularPorEscuela(int indice_modelo) {
        
        if(this.modelosExamenes.get(indice_modelo).isPor_municipio()) {
            
            for(int i=0; i<this.modelosExamenes.get(indice_modelo).getOpciones_respuesta_municipio().size(); i++) {
                String municipio = this.modelosExamenes.get(indice_modelo).getOpciones_respuesta_municipio().get(i);
                
                if(this.modelosExamenes.get(indice_modelo).isPor_zona_escolar()) {
                    
                    for(int j=0; j<this.modelosExamenes.get(indice_modelo).getZona_escolar_por_municipio()[i].size(); j++) {
                        ZonaEscolar zona = this.modelosExamenes.get(indice_modelo).getZona_escolar_por_municipio()[i].get(j);
                        String nombre_zona_escolar = zona.getNombre_zona_escolar();
                        List<Escuela> escuelas = new ArrayList<>();
                        
                        for(int k=0; k<this.modelosExamenes.get(indice_modelo).getNumero_de_examinados(); k++) {                
                            int indice_var_escuela = this.modelosExamenes.get(indice_modelo).getIndiceVar(this.modelosExamenes.get(indice_modelo).getVarEscuela());
                            int indice_municipio = this.modelosExamenes.get(indice_modelo).getIndiceVar(this.modelosExamenes.get(indice_modelo).getVarMunicipio());
                            int indice_zona_escolar = this.modelosExamenes.get(indice_modelo).getIndiceVar(this.modelosExamenes.get(indice_modelo).getVarZonaEscolar());
                            String res_escuela = this.modelosExamenes.get(indice_modelo).getAlumnosOrdenada().get(k).getRespuesta(indice_var_escuela);
                            double aciertos = this.modelosExamenes.get(indice_modelo).getAlumnosOrdenada().get(k).getAciertos();                            
                            String res_municipio = this.modelosExamenes.get(indice_modelo).getAlumnosOrdenada().get(k).getRespuesta(indice_municipio);
                            String res_zona_escolar = this.modelosExamenes.get(indice_modelo).getAlumnosOrdenada().get(k).getRespuesta(indice_zona_escolar);
                            
                            if(municipio.equalsIgnoreCase(res_municipio) && nombre_zona_escolar.equalsIgnoreCase(res_zona_escolar)) {                                
                                
                                if(zona.getEscuelas()== null) {
                                    escuelas = new ArrayList<>();
                                } else {
                                    escuelas = zona.getEscuelas();
                                }
                                
                                boolean flag = false;
                                int l=0;
                                for(Escuela es : escuelas) {
                                    if(es.getId_escuela().equalsIgnoreCase(res_escuela)) {
                                        flag = true;
                                        break;
                                    }
                                    l++;
                                }
                                
                                if(flag) {
                                    escuelas.get(l).setFrecuencia_escuela( (escuelas.get(l).getFrecuencia_escuela()+1) );
                                    escuelas.get(l).setPuntaje_total_escuela( (escuelas.get(l).getPuntaje_total_escuela()+aciertos) );
                                } else {
                                    Escuela es = new Escuela(res_escuela, nombre_zona_escolar, municipio);
                                    es.setFrecuencia_escuela(1);
                                    es.setPuntaje_total_escuela(aciertos);
                                    escuelas.add(es);
                                }
                                                                
                                escuelas.set(l, calculaTurnos(escuelas.get(l), k, indice_modelo, aciertos));                                                                    
                                
                                zona.setEscuelas(escuelas);
                                
                            }
                        }
                        
                        this.modelosExamenes.get(indice_modelo).getZona_escolar_por_municipio()[i].set(j, zona);
                        
                        //Calcular puntaje promedio, porcentaje e imprimir resultados
                        for(int l=0; l<this.modelosExamenes.get(indice_modelo).getZona_escolar_por_municipio()[i].get(j).getEscuelas().size(); l++) {
                            double puntaje_promedio = this.modelosExamenes.get(indice_modelo).getZona_escolar_por_municipio()[i].get(j).getEscuelas().get(l).getPuntaje_total_escuela()/this.modelosExamenes.get(indice_modelo).getZona_escolar_por_municipio()[i].get(j).getEscuelas().get(l).getFrecuencia_escuela();
                            double porcentaje = (puntaje_promedio/this.modelosExamenes.get(indice_modelo).getNumero_de_items())*100;
                            
                            this.modelosExamenes.get(indice_modelo).getZona_escolar_por_municipio()[i].get(j).getEscuelas().get(l).setPuntaje_promedio_escuela(puntaje_promedio);
                            this.modelosExamenes.get(indice_modelo).getZona_escolar_por_municipio()[i].get(j).getEscuelas().get(l).setPorcentaje_aciertos_escuela(porcentaje);
                            
                            System.out.println("Municipio " + municipio + " : Zona escolar " + nombre_zona_escolar + " : Escuela " + this.modelosExamenes.get(indice_modelo).getZona_escolar_por_municipio()[i].get(j).getEscuelas().get(l).getId_escuela() + " : Puntaje promedio " + puntaje_promedio + " : Porcentaje " + porcentaje + " : Número de Turnos " + this.modelosExamenes.get(indice_modelo).getZona_escolar_por_municipio()[i].get(j).getEscuelas().get(l).getTurnos().size() + " : Número de Grupos del primer turno " + this.modelosExamenes.get(indice_modelo).getZona_escolar_por_municipio()[i].get(j).getEscuelas().get(l).getTurnos().get(0).getGrupos().size());
                        }
                    }
                }
            }
                        
        }
    }
    
    private Escuela calculaTurnos(Escuela escuela, int indice_sujeto, int indice_modelo, double aciertos) {
        Escuela esc = escuela;        
        List<Turno> turnos;
                
        String res_turno = this.modelosExamenes.get(indice_modelo).getAlumnosOrdenada().get(indice_sujeto).getTurno();        
        String res_escuela = this.modelosExamenes.get(indice_modelo).getAlumnosOrdenada().get(indice_sujeto).getEscuela();        
        String res_zona = this.modelosExamenes.get(indice_modelo).getAlumnosOrdenada().get(indice_sujeto).getZona_escolar();        
        
        if(esc.getTurnos()==null) {
            turnos = new ArrayList<>();
        } else {
            turnos = esc.getTurnos();
        }
        
        boolean flag = false;
        int l=0;
        for(Turno tur : turnos) {
            if(tur.getZona_escolar().equalsIgnoreCase(res_zona) && tur.getEscuela().equalsIgnoreCase(res_escuela) && tur.getId_turno().equalsIgnoreCase(res_turno)) {
                flag = true;
                break;
            }
            l++;
        }

        if(flag) {
            turnos.get(l).setFrecuencia_turno( (turnos.get(l).getFrecuencia_turno()+1) );
            turnos.get(l).setPuntaje_total_turno( (turnos.get(l).getPuntaje_total_turno()+aciertos) );              
        } else {
            Turno tur = new Turno(res_turno, esc.getId_escuela(), esc.getZona_escolar(), esc.getMunicipio());            
            tur.setFrecuencia_turno(1);
            tur.setPuntaje_total_turno(aciertos);            
            turnos.add(tur);
        }
        
        turnos.set(l, calculaGrupos(turnos.get(l), indice_sujeto, indice_modelo, aciertos));
        
        esc.setTurnos(turnos);
        
        return esc;
    }
    
    private Turno calculaGrupos(Turno turno, int indice_sujeto, int indice_modelo, double aciertos) {
        Turno tur = turno;        
        List<Grupo> grupos;
                
        String res_grupo = this.modelosExamenes.get(indice_modelo).getAlumnosOrdenada().get(indice_sujeto).getGrupo();        
        String res_turno = this.modelosExamenes.get(indice_modelo).getAlumnosOrdenada().get(indice_sujeto).getTurno();        
        
        if(tur.getGrupos()==null) {
            grupos = new ArrayList<>();
        } else {
            grupos = tur.getGrupos();
        }
        
        boolean flag = false;
        int l=0;
        for(Grupo gr : grupos) {
            if(gr.getTurno().equalsIgnoreCase(res_turno) && gr.getId_grupo().equalsIgnoreCase(res_grupo)) {
                flag = true;
                break;
            }
            l++;
        }

        if(flag) {
            grupos.get(l).setFrecuencia_grupo( (grupos.get(l).getFrecuencia_grupo()+1) );
            grupos.get(l).setPuntaje_total_grupo( (grupos.get(l).getPuntaje_total_grupo()+aciertos) );              
        } else {
            Grupo gr = new Grupo(res_grupo, tur.getId_turno(), tur.getEscuela(), tur.getZona_escolar(), tur.getMunicipio());            
            gr.setFrecuencia_grupo(1);
            gr.setPuntaje_total_grupo(aciertos);            
            grupos.add(gr);
        }
        
        if(this.modelosExamenes.get(indice_modelo).isPor_grupo()) {
            grupos.set(l, calcularPorGrupo(grupos.get(l), indice_sujeto, indice_modelo));
        }
        
        tur.setGrupos(grupos);
        
        return tur;
    }

    private Grupo calcularPorGrupo(Grupo grupo, int indice_sujeto, int indice_modelo) {
        Grupo gr = grupo;
        List<Alumno> alumnos;
                        
        Alumno al = this.modelosExamenes.get(indice_modelo).getAlumnosOrdenada().get(indice_sujeto);        
        
        if(gr.getAlumnos()==null) {
            alumnos = new ArrayList<>();
        } else {
            alumnos = gr.getAlumnos();
        }
        
        if( gr.getEscuela().equalsIgnoreCase(al.getEscuela()) && gr.getId_grupo().equalsIgnoreCase(al.getGrupo()) ) {
            alumnos.add(this.modelosExamenes.get(indice_modelo).getAlumnosOrdenada().get(indice_sujeto));
        }                
        
        grupo.setAlumnos(alumnos);        
        
        return grupo;
    }
    
    private void pintar_resultados() {
        String out = "";
        DecimalFormat df = new DecimalFormat("0.000");                
        
        for(int i=0; i<this.modelosExamenes.size(); i++) {                                
            out = out +
                    "<table align=\"center\" width=\"550px\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\">"
                    + "<caption style=\"text-align:center; font-weight:bold;\"> " + this.modelosExamenes.get(i).getNombreModelo() + "</caption>";
            
            //Por municipio
            if(this.modelosExamenes.get(i).isPor_municipio()) { 
                //abrimos renglón de tabla principal
                out = out + "<tr>";
                out = out + "<td style=\"text-align:center; border:0;\">";
                
                out = out + "<h3 style=\"color:#666\"><strong>Resultados por Municipio</strong></h3>";
                out = out +
                    "<table align=\"center\" width=\"400px\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\">"
                    + "<caption style=\"font-weight:bold;\"> " + this.modelosExamenes.get(i).getNombreModelo() + "</caption>"
                    + "<tr>";

                out = out + "<td style=\"text-align:center; font-weight:bold;\">Municipio</td>";
                out = out + "<td style=\"text-align:center; font-weight:bold;\">Total</td>";
                out = out + "<td style=\"text-align:center; font-weight:bold;\">Porcentaje</td>";
                out = out + "</tr>";                                  

                out = out + "<tr>";            

                for(int j=0; j<this.modelosExamenes.get(i).getOpciones_respuesta_municipio().size(); j++) {                                             

                    if(j!=0) {
                        out = out + "<tr>";
                    }

                    out = out + "<td style=\"text-align:center;\">" + this.modelosExamenes.get(i).getOpciones_respuesta_municipio().get(j) + " </td>";
                    out = out + "<td style=\"text-align:center;\">" + df.format(this.modelosExamenes.get(i).getPuntaje_promedio_municipio().get(j).doubleValue()) + "</td>";
                    out = out + "<td style=\"text-align:center;\">" + df.format(this.modelosExamenes.get(i).getPorcentaje_aciertos_municipio().get(j).doubleValue()*100) + "%</td>";
                    out = out + "</tr>";                                        
                }


                out = out + "</table>";
                out = out + "<br /><br />";
                
                //cerramos renglón de tabla principal
                out = out + "</td>";
                out = out + "</tr>"; 
            }
            
            //Por zona escolar
            if(this.modelosExamenes.get(i).isPor_zona_escolar()) {
                //abrimos renglón de tabla principal
                out = out + "<tr>";
                out = out + "<td style=\"text-align:center; border:0;\">";
                
                out = out + "<h3 style=\"color:#666\"><strong>Resultados por Zona Escolar</strong></h3>";
                for(int j=0; j<this.modelosExamenes.get(i).getOpciones_respuesta_municipio().size(); j++) {
                    String nombre_municipio = this.modelosExamenes.get(i).getOpciones_respuesta_municipio().get(j);
                    
                    out = out +
                        "<table align=\"center\" width=\"400px\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\">"
                        + "<caption style=\"font-weight:bold;\">Municipio: " + nombre_municipio + "</caption>"
                        + "<tr>";

                    out = out + "<td style=\"text-align:center; font-weight:bold;\">Zona escolar</td>";
                    out = out + "<td style=\"text-align:center; font-weight:bold;\">Promedio</td>";
                    out = out + "<td style=\"text-align:center; font-weight:bold;\">Porcentaje</td>";
                    out = out + "</tr>";                                  

                    out = out + "<tr>";
                    
                    for(int k=0; k<this.modelosExamenes.get(i).getZona_escolar_por_municipio()[j].size(); k++) {
                        
                        if(k!=0) {
                            out = out + "<tr>";
                        }            
                        
                        out = out + "<td style=\"text-align:center;\">" + this.modelosExamenes.get(i).getZona_escolar_por_municipio()[j].get(k).getNombre_zona_escolar() + " </td>";
                        out = out + "<td style=\"text-align:center;\">" + df.format(this.modelosExamenes.get(i).getZona_escolar_por_municipio()[j].get(k).getPuntaje_promedio_zona_escolar()) + "</td>";
                        out = out + "<td style=\"text-align:center;\">" + df.format(this.modelosExamenes.get(i).getZona_escolar_por_municipio()[j].get(k).getPorcentaje_aciertos_zona_escolar()) + "%</td>";
                        out = out + "</tr>";                        
                    }
                    
                    out = out + "</table>";
                    out = out + "<br /><br />";                                          
                }                
                
                //cerramos renglón de tabla principal
                out = out + "</td>";
                out = out + "</tr>"; 
            }
            
            out = out + "</table>";
                        
        }                        
        
        this.panel_resultados.setText(out); 
    }
    
}
