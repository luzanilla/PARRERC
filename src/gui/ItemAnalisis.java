/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entidades.Alumno;
import entidades.ModeloExamen;
import java.awt.Dialog;
import java.awt.Dimension;
import java.beans.PropertyVetoException;
import java.text.DecimalFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;

/**
 *
 * @author Erick
 */
public class ItemAnalisis extends javax.swing.JInternalFrame {

       
    private boolean calcular_dificultad;
    private boolean calcular_discriminacion;
    private boolean calcular_distractores; 
    private int indice_inicio_items;    
    private double[] dificultad_reactivos;
    private double[] discriminacion_reactivos;
    private int[][] frecuencias_distractores;
    private List<ModeloExamen> modelosExamenes;
    private JDesktopPane jDesktopPane1;
            
    /**
     * Creates new form ItemAnalisis
     */      
    ItemAnalisis(List<ModeloExamen> modelosExamenes, JDesktopPane jDesktopPane1) {
        this.modelosExamenes = modelosExamenes;
        this.jDesktopPane1 = jDesktopPane1;
        
        initComponents();
        
        this.dialog_conf.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        this.dialog_conf.setLocationRelativeTo(this.getParent());
        this.dialog_conf.setVisible(true);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialog_conf = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        check_dificultad = new javax.swing.JCheckBox();
        check_discriminacion = new javax.swing.JCheckBox();
        check_distractores = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        panel_resultados = new javax.swing.JEditorPane();

        dialog_conf.setTitle("Análisis de ítems");
        dialog_conf.setBounds(new java.awt.Rectangle(0, 0, 350, 250));
        dialog_conf.setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de análisis"));

        check_dificultad.setSelected(true);
        check_dificultad.setText("Dificultad");

        check_discriminacion.setSelected(true);
        check_discriminacion.setText("Discriminación");

        check_distractores.setSelected(true);
        check_distractores.setText("Análisis de distractores");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check_distractores, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(check_discriminacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(44, 44, 44))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(check_dificultad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(66, 66, 66)))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(check_dificultad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(check_discriminacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(check_distractores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton2.setText("Cancelar");
        jPanel2.add(jButton2);

        javax.swing.GroupLayout dialog_confLayout = new javax.swing.GroupLayout(dialog_conf.getContentPane());
        dialog_conf.getContentPane().setLayout(dialog_confLayout);
        dialog_confLayout.setHorizontalGroup(
            dialog_confLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialog_confLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dialog_confLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        dialog_confLayout.setVerticalGroup(
            dialog_confLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialog_confLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addContainerGap())
        );

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Análisis de ítems");
        setAutoscrolls(true);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        panel_resultados.setEditable(false);
        panel_resultados.setContentType("text/html");
        jScrollPane1.setViewportView(panel_resultados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.asignaCuartil();
        
        if(this.check_dificultad.isSelected()) {
            this.calcular_dificultad = true;
        } else {
            this.calcular_dificultad = false;
        }
        
        if(this.check_discriminacion.isSelected()) {
            this.calcular_discriminacion = true;
        } else {
            this.calcular_discriminacion = false;
        }
        
        if(this.check_distractores.isSelected()) {
            this.calcular_distractores = true;
        } else {
            this.calcular_distractores = false;
        }
        
        this.dialog_conf.dispose();                
        
        hacerCalculos();        
        pintar_resultados();       
        
        /*pintaLista(this.dificultad_reactivos, "Dificultad reactivos");
        pintaLista(this.discriminacion_reactivos, "Discriminacion reactivos");
        pintaArreglo("Análisis de distractores", this.frecuencias_distractores);*/
        
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension jInternalFrameSize = this.getSize();

        this.setLocation((desktopSize.width - jInternalFrameSize.width)/2, (desktopSize.height- jInternalFrameSize.height)/2);                
        
        this.setVisible(true);   
        
        try {
            this.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ItemAnalisis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox check_dificultad;
    private javax.swing.JCheckBox check_discriminacion;
    private javax.swing.JCheckBox check_distractores;
    private javax.swing.JDialog dialog_conf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JEditorPane panel_resultados;
    // End of variables declaration//GEN-END:variables

    private void asignaCuartil() {
        
        for(int j=0; j<this.modelosExamenes.size(); j++) {
            int tamCuartil = this.modelosExamenes.get(j).getAlumnosOrdenada().size() / 4;

            //Si es de los primeros en la lista, se le asigna el cuartil mas alto
            for (int i = 0; i < this.modelosExamenes.get(j).getAlumnosOrdenada().size(); i++) {
                if ((i + 1) <= tamCuartil) {
                    this.modelosExamenes.get(j).getAlumnosOrdenada().get(i).setCuartil(4);
                }

                if ((i + 1) <= (tamCuartil * 2) && (i + 1) >= (tamCuartil + 1)) {
                    this.modelosExamenes.get(j).getAlumnosOrdenada().get(i).setCuartil(3);
                }

                if ((i + 1) <= (tamCuartil * 3) && (i + 1) >= ((tamCuartil * 2) + 1)) {
                    this.modelosExamenes.get(j).getAlumnosOrdenada().get(i).setCuartil(2);
                }

                //Si es de los últimos en la lista, se le asigna el cuartil mas bajo
                if ((i + 1) >= ((tamCuartil * 3) + 1)) {
                    this.modelosExamenes.get(j).getAlumnosOrdenada().get(i).setCuartil(1);
                }

            }
        }
        
    }

    private void hacerCalculos() {
        
        if(this.calcular_dificultad) {
            calculaDificultad();            
        }
        
        if(this.calcular_discriminacion) {
            calculaDiscriminacion();            
        }
                
    }

    private void calculaDificultad() {
        
        for(int j=0; j<this.modelosExamenes.size(); j++) {
            dificultad_reactivos = new double[this.modelosExamenes.get(j).getClavesRespuesta().size()];

            if(this.calcular_distractores) {
                frecuencias_distractores = new int[this.modelosExamenes.get(j).getClavesRespuesta().size()][this.modelosExamenes.get(j).getOpcionesRespuesta().size()];
                inicializar_frecuencias();
            }

            for(int i=0; i<this.modelosExamenes.get(j).getClavesRespuesta().size(); i++) {
                double aciertos = 0;

                for(Alumno a : this.modelosExamenes.get(j).getAlumnosOrdenada()) {
                    aciertos += a.getRespuestaCalificada(i);

                    if(this.calcular_distractores) {
                        calculaDistractores(i, a.getRespuesta(i+this.modelosExamenes.get(j).getIndice_inicio_items()), j);
                    }
                }

                dificultad_reactivos[i] = (aciertos/this.modelosExamenes.get(j).getAlumnosOrdenada().size()); 

            }   
            
            this.modelosExamenes.get(j).setDificultad_reactivos(dificultad_reactivos);
            this.modelosExamenes.get(j).setFrecuencias_distractores(frecuencias_distractores);
            
        }
                
    }
    
    private void calculaDistractores(int indice, String respuesta, int j) {
        int res = -1;
        
        res = this.modelosExamenes.get(j).getOpcionesRespuesta().indexOf(respuesta);
        
        if( res != -1 ) {
            this.frecuencias_distractores[indice][res]++;
        } else {
            System.out.println("Respuesta no encontrada: " + respuesta);
        }     
    }

    private void calculaDiscriminacion() {
        
        for(int j=0; j<this.modelosExamenes.size(); j++) {
            discriminacion_reactivos = new double[this.modelosExamenes.get(j).getClavesRespuesta().size()];
            int numero_sujetos = (int) (this.modelosExamenes.get(j).getAlumnosOrdenada().size()*.27);

            System.out.println("Numero de sujetos para grupos alto y bajo: " + numero_sujetos);

            for(int i=0; i<this.modelosExamenes.get(j).getClavesRespuesta().size(); i++) {
                int aciertos = 0;
                //System.out.println("HOLA: "+this.claves_respuesta.size());

                double aciertos_altos = getAciertosGrupoAlto(i, numero_sujetos, j);
                double aciertos_bajos = getAciertosGrupoBajo(i, numero_sujetos, j);

                discriminacion_reactivos[i] = ((aciertos_altos-aciertos_bajos)/numero_sujetos);                         
            }
            
            this.modelosExamenes.get(j).setDiscriminacion_reactivos(discriminacion_reactivos);
        }
        
    }    

    private int getAciertosGrupoAlto(int indice_item, int numero_sujetos, int j) {
        int aciertos = 0;
        
        for(int i=0; i<numero_sujetos; i++) {
            Alumno a = this.modelosExamenes.get(j).getAlumnosOrdenada().get(i);
            aciertos += a.getRespuestaCalificada(indice_item);
        }
        
        return aciertos;
    }

    private int getAciertosGrupoBajo(int indice_item, int numero_sujetos, int j) {
        int aciertos = 0;
        int indice = this.modelosExamenes.get(j).getAlumnosOrdenada().size()-numero_sujetos-1;
        
        for(int i=0; i<numero_sujetos; i++) {
            Alumno a = this.modelosExamenes.get(j).getAlumnosOrdenada().get(indice);
            aciertos += a.getRespuestaCalificada(indice_item);
            indice++;
        }
        
        return aciertos;
    }

    public void pintaLista(double[] lista, String titulo) {
        System.out.println(titulo);
        
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + ", ");
        }
        
    }
    
    /*public void pintaArreglo(String titulo, int[][] arreglo) {
        System.out.println(titulo);
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ítem " + (i+1) + ": ");
            
            for (int j = 0; j < arreglo[0].length; j++) {
                System.out.print(this.opcionesRespuesta.get(j) + ": " + arreglo[i][j] + ",   ");
            }
            
            System.out.println("");
            
        }
        
    }*/

    private void inicializar_frecuencias() {
        for (int i = 0; i < this.frecuencias_distractores.length; i++) {            
            
            for (int j = 0; j < this.frecuencias_distractores[0].length; j++) {
                this.frecuencias_distractores[i][j] = 0;
            }                       
            
        }
    }

    private void pintar_resultados() {
        String out = "";
        DecimalFormat df = new DecimalFormat("0.000");
        
        for(int k=0; k<this.modelosExamenes.size(); k++) {            
        
            out = out +
                    "<table align=\"center\" width=\"400px\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\">"
                    + "<caption style=\"font-weight:bold;\"> " + this.modelosExamenes.get(k).getNombreModelo() + "</caption>"
                    + "<tr>"
                        +  "<td style=\"text-align:center; font-weight:bold;\">&Iacute;tem</td>";

            if(this.calcular_dificultad) {
                out = out + "<td style=\"text-align:center; font-weight:bold;\">Dificultad</td>";
            }

            if(this.calcular_discriminacion) {
                out = out + "<td style=\"text-align:center; font-weight:bold;\">Discriminaci&oacute;n</td>";
            }

            if(this.calcular_distractores) {
                out = out + "<td colspan=\"2\" style=\"text-align:center; font-weight:bold;\">Opciones de respuesta</td>";
            }

            out = out + "</tr>";                       

            for(int i=0; i<this.modelosExamenes.get(k).getClavesRespuesta().size(); i++) {
                out = out + "<tr>";

                out = out + "<td style=\"text-align:center;\"";

                if(this.calcular_distractores) {
                    out = out + " rowspan=\"" + this.modelosExamenes.get(k).getOpcionesRespuesta().size() + "\">" + this.modelosExamenes.get(k).getNombresItems().get(i) + "</td>";
                } else {
                    out = out + " >" + this.modelosExamenes.get(k).getNombresItems().get(i) + "</td>";
                }

                if(this.calcular_dificultad) {
                    out = out + "<td style=\"text-align:center;\"";

                    if(this.calcular_distractores) {
                        out = out + " rowspan=\"" + this.modelosExamenes.get(k).getOpcionesRespuesta().size() + "\">" + df.format(this.modelosExamenes.get(k).getDificultad_reactivos()[i]) + "</td>";
                    } else {
                        out = out + " >" + df.format(this.modelosExamenes.get(k).getDificultad_reactivos()[i]) + "</td>";
                    }
                }

                if(this.calcular_discriminacion) {
                    out = out + "<td style=\"text-align:center;\"";

                    if(this.calcular_distractores) {
                        out = out + " rowspan=\"" + this.modelosExamenes.get(k).getOpcionesRespuesta().size() + "\">" + df.format(this.modelosExamenes.get(k).getDiscriminacion_reactivos()[i]) + "</td>";
                    } else {
                        out = out + " >" + df.format(this.modelosExamenes.get(k).getDiscriminacion_reactivos()[i]) + "</td>";
                    }
                }

                if(this.calcular_distractores) {                

                    for(int j=0; j<this.modelosExamenes.get(k).getOpcionesRespuesta().size(); j++) {
                        String correcta = "";

                        if( this.modelosExamenes.get(k).getClavesRespuesta().get(i).equalsIgnoreCase(this.modelosExamenes.get(k).getOpcionesRespuesta().get(j)) ) {
                            correcta = "*";
                        }

                        double por;
                        por = this.modelosExamenes.get(k).getFrecuencias_distractores()[i][j];
                        por = (por/this.modelosExamenes.get(k).getAlumnosOrdenada().size())*100;
                        
                        if(j!=0) {
                            out = out + "<tr>";
                        } 
                            
                        out = out + "<td style=\"text-align:center;\">" + this.modelosExamenes.get(k).getOpcionesRespuesta().get(j) + correcta + ": </td>";
                        out = out + "<td style=\"text-align:center;\">" + df.format(por) + "%</td>";
                        out = out + "</tr>";
                        

                    }
                } else {
                    out = out + "</tr>";
                }
                
            }        

            out = out + "</table>";
            out = out + "<br /><br />";
        }        
        
        this.panel_resultados.setText(out);        
    }
        
}