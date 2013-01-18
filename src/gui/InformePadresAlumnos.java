/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entidades.Alumno;
import entidades.ModeloExamen;
import java.awt.Color;
import java.awt.Dimension;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author UEE
 */
public class InformePadresAlumnos extends javax.swing.JInternalFrame {

    private String buscar_id_examen;
    private List<ModeloExamen> modelosExamenes;
    private Alumno alumno;
    private int indice_modelo;        
    private double media_grupo;
    /**
     * Creates new form InformePadresAlumnos
     */
    public InformePadresAlumnos(List<ModeloExamen> modelosExamenes, JDesktopPane jDesktopPane1) {        
        this.modelosExamenes = modelosExamenes;
        initComponents();   
        
        this.jDialog1.setLocationRelativeTo(this);
        this.pack();       
        this.jDialog1.setVisible(true);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jt_id_examen = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextArea1 = new javax.swing.JTextArea();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        panel_resultados = new javax.swing.JEditorPane();

        jDialog1.setTitle("Informe de resultados para alumnos y padres de familia");
        jDialog1.setBounds(new java.awt.Rectangle(0, 0, 460, 410));
        jDialog1.setModal(true);
        jDialog1.setPreferredSize(new java.awt.Dimension(424, 440));
        jDialog1.setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel1.setText("Id. del examen:");
        jPanel1.add(jLabel1);

        jt_id_examen.setColumns(7);
        jt_id_examen.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jt_id_examenCaretUpdate(evt);
            }
        });
        jPanel1.add(jt_id_examen);

        jButton1.setText("Aceptar");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(214, 217, 223));
        jTextArea1.setColumns(10);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Los estudiantes son usuarios de los resultados de las evaluaciones al mismo tiempo que son los sujetos de las mismas evaluaciones del aprendizaje. La información al estudiante de los resultados que obtuvo en una evaluación a gran escala debe cumplir con la función de retroalimentarlo en su desempeño general y específico.");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Los estudiantes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jTextArea1.setFocusable(false);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(214, 217, 223));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("Para que la información obtenida en las evaluaciones pueda ser funcional, es necesario que los padres de familia sean informados previamente por los profesores sobre los aspectos que serán examinados y los aprendizajes que se espera hayan adquirido los alumnos y que se verá reflejado en las evaluaciones.");
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Los padres de familia", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jTextArea2.setFocusable(false);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextArea2)
                    .addComponent(jTextArea1))
                .addContainerGap())
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Informe de resultados para alumnos y padres de familia");

        panel_resultados.setContentType("text/html");
        jScrollPane1.setViewportView(panel_resultados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.jDialog1.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String id = this.jt_id_examen.getText().trim();                
        
        if(buscarExamen(id)){
            pintarResultados();
            this.jDialog1.setVisible(false);
            this.setVisible(true);            
        } else {
            JOptionPane.showMessageDialog(this, "El examen " + id + " no se encuentra en la base de datos", "Id de examen no encontrado", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jt_id_examenCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jt_id_examenCaretUpdate
        if(this.jt_id_examen.getText().length()>0) {
            this.jButton1.setEnabled(true);
        } else {
            this.jButton1.setEnabled(false);
        }
    }//GEN-LAST:event_jt_id_examenCaretUpdate

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jt_id_examen;
    private javax.swing.JEditorPane panel_resultados;
    // End of variables declaration//GEN-END:variables

    private boolean buscarExamen(String id_examen) {        
        boolean flag = false;
        
        for(int i=0; i<this.modelosExamenes.size(); i++) {
            
            for(int j=0; j<this.modelosExamenes.get(i).getAlumnosOrdenada().size(); j++) {
                String res_id_examen = this.modelosExamenes.get(i).getAlumnosOrdenada().get(j).getId();
                
                if(id_examen.equalsIgnoreCase(res_id_examen)) {
                    this.indice_modelo = i;
                    this.alumno = this.modelosExamenes.get(i).getAlumnosOrdenada().get(j);
                    
                    flag = true;
                    break;
                    
                }
            }
        }
        
        return flag;
    }

    private void pintarResultados() {
        String out = "<table width=\"50%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">";
        out = out + "<tr>"
                    + "<th scope=\"col\">Informe de resultados para alumnos y padres de familia.</th>"
                + "  </tr>";
        out = out + "<tr>"
                    + "<td>El estudiante con el examen <strong>" + this.alumno.getId() + "</strong> aplic&oacute; el modelo de examen <strong>" + this.alumno.getModelo() + "</strong> que tenía <strong>" + this.modelosExamenes.get(this.indice_modelo).getNumero_de_items() + "</strong> &iacute;tems." + this.getTextoUA() + " El total de aciertos obtenidos en todo el examen fue de " + this.alumno.getAciertos() + ", " + this.getTextoMediaGrupo() + " " + this.getTextoMinMaxUA() + "</td>"
                  + "</tr>";
        out = out + "<tr>"
                    + "<td>"
                    + "<table width=\"100%\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\">"
                        + "<tr>"
                            + "<th width=\"35%\" rowspan=\"2\" scope=\"col\">No. exmanen</th>"
                            + "<th width=\"16%\" scope=\"col\">Total de aciertos</th>"
                            + "<th scope=\"col\" colspan=\"" + this.modelosExamenes.get(indice_modelo).getUnidades_aprendizaje().size() + "\">Unidades de aprendizaje</th>"
                        + "</tr>"
                        + "<tr>"
                            + "<th width=\"13%\" scope=\"col\">General</th>";
        for(int i=0; i<this.modelosExamenes.get(indice_modelo).getUnidades_aprendizaje().size(); i++) {
            out = out + "<th scope=\"col\">" + this.modelosExamenes.get(indice_modelo).getUnidades_aprendizaje().get(i).getNombre() + "</th>";
        }
        
        out = out + "</tr>";
        
        out = out + "<tr>";
        out = out + "<td>" + alumno.getId() + "</td>";
        out = out + "<td>" + alumno.getAciertos() + "</td>";
        
        for(int i=0; i<this.modelosExamenes.get(indice_modelo).getUnidades_aprendizaje().size(); i++) {
            out = out + "<td>" + alumno.getPuntajes_ua()[i] + "</td>";
        }
        
        out = out + "</tr>";
        out = out + "</table>";
        out = out + "</td>";
        out = out + "</tr>";                        
        out = out + "</table>";
        
        this.panel_resultados.setText(out); 
    }

    private String getTextoUA() {
        String text = "";
        
        for(int i=0; i<this.modelosExamenes.get(this.indice_modelo).getUnidades_aprendizaje().size(); i++) {
            int n_items_unidad = this.modelosExamenes.get(this.indice_modelo).getUnidades_aprendizaje().get(i).getItems().size();
            String nombre_unidad = this.modelosExamenes.get(this.indice_modelo).getUnidades_aprendizaje().get(i).getNombre();
            
            text = text + " <strong>" + n_items_unidad + "</strong> de ellos correspond&iacute;an a la unidad de aprendizaje <strong>" + nombre_unidad + "</strong>";
            
            int dif = this.modelosExamenes.get(this.indice_modelo).getUnidades_aprendizaje().size()-i;
            
            if(dif>2) {
                text = text + ",";
            } else {
                if(dif==2) {
                    text = text + " y";
                }
                
                if(dif==1) {
                    text = text + ".";
                }
            }
        }
        
        return text;        
    }

    private String getTextoMediaGrupo() {
        String text = "";
        
        for(int i=0; i<this.modelosExamenes.get(indice_modelo).getOpciones_respuesta_municipio().size(); i++) {
            String municipio = this.modelosExamenes.get(indice_modelo).getOpciones_respuesta_municipio().get(i);
            
            if(municipio.equalsIgnoreCase(alumno.getMunicipio())) {
                
                for(int j=0; j<this.modelosExamenes.get(indice_modelo).getZona_escolar_por_municipio()[i].size(); j++) {
                    String zona = this.modelosExamenes.get(indice_modelo).getZona_escolar_por_municipio()[i].get(j).getNombre_zona_escolar();
                    
                    if(zona.equalsIgnoreCase(alumno.getZona_escolar())) {
                        
                        for(int k=0; k<this.modelosExamenes.get(indice_modelo).getZona_escolar_por_municipio()[i].get(j).getEscuelas().size(); k++) {
                            String escuela = this.modelosExamenes.get(indice_modelo).getZona_escolar_por_municipio()[i].get(j).getEscuelas().get(k).getId_escuela();
                            
                            if(escuela.equalsIgnoreCase(alumno.getEscuela())) {
                                
                                for(int l=0; l<this.modelosExamenes.get(indice_modelo).getZona_escolar_por_municipio()[i].get(j).getEscuelas().get(k).getTurnos().size(); l++) {
                                    String turno = this.modelosExamenes.get(indice_modelo).getZona_escolar_por_municipio()[i].get(j).getEscuelas().get(k).getTurnos().get(l).getId_turno();
                                    
                                    if(turno.equalsIgnoreCase(alumno.getTurno())) {
                                        
                                        for(int m=0; m<this.modelosExamenes.get(indice_modelo).getZona_escolar_por_municipio()[i].get(j).getEscuelas().get(k).getTurnos().get(l).getGrupos().size(); m++) {
                                            String grupo = this.modelosExamenes.get(indice_modelo).getZona_escolar_por_municipio()[i].get(j).getEscuelas().get(k).getTurnos().get(l).getGrupos().get(m).getId_grupo();
                                            
                                            if(grupo.equalsIgnoreCase(alumno.getGrupo())) {
                                                this.media_grupo = this.modelosExamenes.get(indice_modelo).getZona_escolar_por_municipio()[i].get(j).getEscuelas().get(k).getTurnos().get(l).getGrupos().get(m).getPuntaje_promedio_grupo();
                                                double dif = this.media_grupo - alumno.getAciertos();
                                                
                                                if(Math.abs(dif)<=1) {
                                                    text = text + "dentro del promedio del grupo general.";
                                                } else {
                                                    if(dif>1) {
                                                        text = text + "por debajo del promedio del grupo general.";
                                                    } else {
                                                        if(dif<-1) {
                                                            text = text + "por encima del promedio del grupo general.";
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
        return text;
    }

    private String getTextoMinMaxUA() {
        String text = "";
        String min_ua = "";
        String max_ua = "";
        int indice_min = 0;
        int indice_max = 0;
        
        for(int i=0; i<this.modelosExamenes.get(indice_modelo).getUnidades_aprendizaje().size(); i++) {
            if(i==0) {
                indice_min = 0;
                indice_max = 0;
            } else {
                if(alumno.getPorcentajes_ua()[i]<alumno.getPorcentajes_ua()[indice_min]) {
                    indice_min = i;
                }
                
                if(alumno.getPorcentajes_ua()[i]>alumno.getPorcentajes_ua()[indice_max]) {
                    indice_max = i;
                }
            }
        }
        
        if(indice_min!=indice_max) {
            text = text + "En la unidad de aprendizaje <strong>" + this.modelosExamenes.get(indice_modelo).getUnidades_aprendizaje().get(indice_max).getNombre() + "</strong> obtuvo el mayor porcentaje de aciertos y en la unidad de aprendizaje <strong>" + this.modelosExamenes.get(indice_modelo).getUnidades_aprendizaje().get(indice_min).getNombre() + "</strong> obtuvo el menor menor poorcentaje de aciertos.";
        }
        
        return text;
    }
    
}
