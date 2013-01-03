/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entidades.ModeloExamen;
import java.awt.Color;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Erick
 */
public class Caracterizacion extends javax.swing.JInternalFrame {
    private List<ModeloExamen> modelosExamenes;
    private List<String> temp;
    private List<String> temp2;
    private String[] variables_seleccionadas;  
    private List<String>[] opciones_respuesta;
    private List<Integer>[] frecuencias_distractores;
    private List<JFreeChart> caract_graficas;
            
    /**
     * Creates new form Caracterizacion
     */
    public Caracterizacion(List<ModeloExamen> modelosExamenes, JDesktopPane jDesktopPane1) {
        this.modelosExamenes = modelosExamenes;
        
        initComponents();
        
        this.listaVariables.setListData(this.modelosExamenes.get(0).getVars_contexto().toArray());
        temp2 = new ArrayList<>(this.modelosExamenes.get(0).getVars_contexto().subList(0, this.modelosExamenes.get(0).getVars_contexto().size()));
                    
        this.jDialog1.pack();
        this.jDialog1.setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaVariables = new javax.swing.JList();
        boton_cambiar_id_sujeto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista_variable_id_sujeto = new javax.swing.JList();
        mostrar_graficas = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        boton_aceptar = new javax.swing.JButton();
        boton_cancelar = new javax.swing.JButton();
        jScollPane3 = new javax.swing.JScrollPane();
        panel_resultados = new javax.swing.JEditorPane();

        jDialog1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialog1.setTitle("Cargar datos desde Excel");
        jDialog1.setModal(true);
        jDialog1.setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        jDialog1.setResizable(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Elige las variables");
        jLabel1.setToolTipText("Nombre de archivo Excel");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel3.setText("Variables elegidas:");

        listaVariables.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaVariablesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaVariables);

        boton_cambiar_id_sujeto.setText(">");
        boton_cambiar_id_sujeto.setEnabled(false);
        boton_cambiar_id_sujeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cambiar_id_sujetoActionPerformed(evt);
            }
        });

        lista_variable_id_sujeto.setAutoscrolls(false);
        lista_variable_id_sujeto.setVisibleRowCount(1);
        lista_variable_id_sujeto.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lista_variable_id_sujetoValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lista_variable_id_sujeto);

        mostrar_graficas.setText("Mostrar gráficos");

        jLabel2.setText("Variables de contexto:");

        boton_aceptar.setText("Aceptar");
        boton_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_aceptarActionPerformed(evt);
            }
        });
        jPanel1.add(boton_aceptar);

        boton_cancelar.setText("Cancelar");
        boton_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(boton_cancelar);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton_cambiar_id_sujeto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(mostrar_graficas)
                .addContainerGap())
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jDialog1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane1, jScrollPane2});

        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(boton_cambiar_id_sujeto)))
                .addGap(18, 18, 18)
                .addComponent(mostrar_graficas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDialog1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane1, jScrollPane2});

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Caracterización de los examinados");
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        panel_resultados.setContentType("text/html");
        jScollPane3.setViewportView(panel_resultados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 342, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cancelarActionPerformed
        this.jDialog1.dispose();
    }//GEN-LAST:event_boton_cancelarActionPerformed

    private void boton_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_aceptarActionPerformed
        this.variables_seleccionadas = new String[this.lista_variable_id_sujeto.getModel().getSize()];
        
        for(int i=0; i<this.lista_variable_id_sujeto.getModel().getSize(); i++) {
            this.variables_seleccionadas[i] = this.lista_variable_id_sujeto.getModel().getElementAt(i).toString();
        }
        
        for(int i=0; i<this.modelosExamenes.size(); i++) {            
            opciones_respuesta = new ArrayList[this.variables_seleccionadas.length];
            frecuencias_distractores = new ArrayList[this.variables_seleccionadas.length];
            
            for(int j=0; j<this.modelosExamenes.get(i).getNumero_de_examinados(); j++) {
                calcularFrecuencias(j, i);
            }
            
            this.modelosExamenes.get(i).setCaract_variables_seleccionadas(variables_seleccionadas);
            this.modelosExamenes.get(i).setCaract_opciones_respuesta(opciones_respuesta);
            this.modelosExamenes.get(i).setCaract_frecuencias_distractores(frecuencias_distractores);
            
            if(this.mostrar_graficas.isSelected()) {
                crearGraficas(i);
            }            
            
        }                
        
        this.jDialog1.dispose();
        
        guardarImagenes();
        pintar_resultados();
        
        this.setVisible(true);
    }//GEN-LAST:event_boton_aceptarActionPerformed

    private void lista_variable_id_sujetoValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lista_variable_id_sujetoValueChanged
        //Quitamos los elementos seleccionados de los otros list
        this.listaVariables.clearSelection();        

        if (this.lista_variable_id_sujeto.getSelectedIndex() >= 0) {
            //Cambiamos el sentido del botón y lo habilitamos
            this.boton_cambiar_id_sujeto.setText("<");
            this.boton_cambiar_id_sujeto.setEnabled(true);
        } else {
            this.boton_cambiar_id_sujeto.setEnabled(false);
        }
    }//GEN-LAST:event_lista_variable_id_sujetoValueChanged

    private void boton_cambiar_id_sujetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cambiar_id_sujetoActionPerformed
        if(temp == null) {
            temp = new ArrayList<>();
        }

        if (this.boton_cambiar_id_sujeto.getText().equalsIgnoreCase(">")) {
            //Agregamos la variable a
            temp.add(this.listaVariables.getModel().getElementAt(this.listaVariables.getSelectedIndex()).toString());
            this.lista_variable_id_sujeto.setListData(temp.toArray());

            //Cambiamos el modelo de datos            
            temp2.remove(this.listaVariables.getSelectedIndex());
            this.listaVariables.setListData(temp2.toArray());
        } else {
            if (this.boton_cambiar_id_sujeto.getText().equalsIgnoreCase("<")) {
                temp2.add(this.lista_variable_id_sujeto.getModel().getElementAt(this.lista_variable_id_sujeto.getSelectedIndex()).toString());
                this.listaVariables.setListData(temp2.toArray());

                temp.remove(this.lista_variable_id_sujeto.getSelectedIndex());
                this.lista_variable_id_sujeto.setListData(temp.toArray());
            }
        }
    }//GEN-LAST:event_boton_cambiar_id_sujetoActionPerformed

    private void listaVariablesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaVariablesValueChanged
        this.lista_variable_id_sujeto.clearSelection();        

        if (this.listaVariables.getSelectedIndex() >= 0) {            
            this.boton_cambiar_id_sujeto.setText(">");
            this.boton_cambiar_id_sujeto.setEnabled(true);            
        } else {
            this.boton_cambiar_id_sujeto.setEnabled(false);            
        }
    }//GEN-LAST:event_listaVariablesValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_aceptar;
    private javax.swing.JButton boton_cambiar_id_sujeto;
    private javax.swing.JButton boton_cancelar;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScollPane3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listaVariables;
    private javax.swing.JList lista_variable_id_sujeto;
    private javax.swing.JCheckBox mostrar_graficas;
    private javax.swing.JEditorPane panel_resultados;
    // End of variables declaration//GEN-END:variables

    private void calcularFrecuencias(int indice_examinado, int indice_modelo_examen) {
        int indiceVar;
        String respuesta;
        
        for(int i=0; i<this.variables_seleccionadas.length; i++) {
            if(opciones_respuesta[i]==null) {
                List<String> opciones_temp = new ArrayList();
                opciones_respuesta[i] = opciones_temp;
            }
            
            if(frecuencias_distractores[i]==null) {
                List<Integer> frecuencias_temp = new ArrayList();
                frecuencias_distractores[i] = frecuencias_temp;
            }
            
            indiceVar = this.modelosExamenes.get(indice_modelo_examen).getIndiceVar(this.variables_seleccionadas[i]);
            
            respuesta = this.modelosExamenes.get(indice_modelo_examen).getAlumnosOrdenada().get(indice_examinado).getRespuesta(indiceVar);
            
            if( !opciones_respuesta[i].contains(respuesta) ) {
                opciones_respuesta[i].add(respuesta);
                frecuencias_distractores[i].add(new Integer(1));
            } else {
                int indice_respuesta = opciones_respuesta[i].indexOf(respuesta);
                
                if(indice_respuesta!=-1) {
                    int cont = frecuencias_distractores[i].get(indice_respuesta).intValue();
                    cont++;
                    frecuencias_distractores[i].set(indice_respuesta, new Integer(cont));
                } else {
                    System.out.println("Algo raro esta pasando");
                }
            }
                        
        }
                
    }
    
    private void crearGraficas(int indice_modelo_examen) {
        boolean auto = false;
        caract_graficas = new ArrayList<>();
        
        for(int i=0; i<this.modelosExamenes.get(indice_modelo_examen).getCaract_variables_seleccionadas().length; i++) {
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            
            for(int j=0; j<this.modelosExamenes.get(indice_modelo_examen).getCaract_opciones_respuesta()[i].size(); j++) {
                dataset.setValue(this.modelosExamenes.get(indice_modelo_examen).getCaract_frecuencias_distractores()[i].get(j), "Frecuencias", this.modelosExamenes.get(indice_modelo_examen).getCaract_opciones_respuesta()[i].get(j));           
            }
            
            JFreeChart chart = ChartFactory.createBarChart(this.modelosExamenes.get(indice_modelo_examen).getCaract_variables_seleccionadas()[i], "Opciones de respuesta", "Frecuencia", dataset, PlotOrientation.VERTICAL, false, true, true);
            
            chart.setBackgroundPaint(Color.white);

            final CategoryPlot plot = (CategoryPlot) chart.getPlot();

            plot.setBackgroundPaint(new Color(240, 240, 240));
            plot.setRangeGridlinePaint(Color.darkGray);
            plot.setRangeGridlinesVisible(true);
            plot.setDomainGridlinePaint(Color.darkGray);
            //plot.setDomainGridlinesVisible(true);
            
            final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
            rangeAxis.setUpperBound((this.modelosExamenes.get(indice_modelo_examen).getNumero_de_examinados()+10));

            /*
            // customise the range axis...
            final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
            rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
            //rangeAxis.setTickUnit(new NumberTickUnit(0.5), true,true);
            rangeAxis.setAutoRangeIncludesZero(false);

            if(auto) {
                rangeAxis.setLowerBound(0);
                rangeAxis.setUpperBound(100);
            }

            final CategoryAxis domainAxis = plot.getDomainAxis();   
            domainAxis.setCategoryLabelPositions(CategoryLabelPositions.STANDARD);
            domainAxis.setMaximumCategoryLabelLines(2);
            domainAxis.setLowerMargin(0.0);
            domainAxis.setUpperMargin(0.0);
            domainAxis.setFixedDimension(1.0);
            domainAxis.setCategoryMargin(1.0);        
            
            */
            // customise the renderer...
            final BarRenderer renderer = (BarRenderer) plot.getRenderer();        
            //renderer.setDrawShapes(true);
            renderer.setSeriesPaint(0, new Color(79, 129, 189));
            renderer.setMaximumBarWidth(.2);
            
            renderer.setSeriesItemLabelGenerator(0, new StandardCategoryItemLabelGenerator());
            renderer.setSeriesItemLabelsVisible(0, true);
            
            //renderer.setBaseItemLabelsVisible(true);
            //renderer.setSeriesItemLabelsVisible(0, true, true);
            //renderer.setPositiveItemLabelPositionFallback(new ItemLabelPosition(ItemLabelAnchor.CENTER, TextAnchor.CENTER));
            
            /*renderer.setSeriesStroke(
                    1, new BasicStroke(
                    3.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND,
                    1.0f, new float[]{4.0f, 6.0f}, 0.0f));
            renderer.setSeriesStroke(
                    2, new BasicStroke(
                    3.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND,
                    1.0f, new float[]{0.0f, 6.0f}, 0.0f));
            renderer.setSeriesStroke(
                    3, new BasicStroke(
                    3.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND,
                    1.0f, new float[]{10.0f, 6.0f}, 0.0f));

            renderer.setSeriesPaint(2, new Color(139, 186, 0));
            renderer.setSeriesPaint(3, new Color(246, 189, 15));

            renderer.setSeriesShapesVisible(0, true);
            renderer.setSeriesShapesVisible(1, true);
            renderer.setSeriesShapesVisible(2, true);
            renderer.setSeriesShapesVisible(3, true);        
*/
            renderer.setSeriesVisible(0, true);
            
 
            plot.setRenderer(renderer);
  
            /*ChartFrame frame1=new ChartFrame("Bar Chart", chart);
            frame1.setVisible(true);
            frame1.setSize(400,350);*/
            caract_graficas.add(chart);
        }
        
        this.modelosExamenes.get(indice_modelo_examen).setCaract_graficas(caract_graficas);
    }
   
    private void guardarImagenes() {
        File dir = new File("temp\\caract");                
        
        if(dir.exists()) {
            borrarDirectorio(dir);                                   
        }
        
        //this.jDialog1.setLocationRelativeTo(null);
        //this.jDialog1.setVisible(true);
        
        
        if (dir.mkdirs()) {
            for(int i=0; i<this.modelosExamenes.size(); i++) {
                
                /*this.jLabel1.setText("Modelo " + (i+1) + " de " + this.modelosExamenes.size() + ":");
                Rectangle progressLabel = this.jProgressBar1.getBounds();
                progressLabel.x = 0;
                progressLabel.y = 0;
                this.jLabel1.paintImmediately(progressLabel);
                
                this.jProgressBar1.setMinimum(0);
                this.jProgressBar1.setMaximum(this.modelosExamenes.get(i).getGraficasFrec().size());
                */
                File dirModelo = new File("temp\\caract\\" + this.modelosExamenes.get(i).getNombreModelo());                                                               
                
                if (dirModelo.mkdirs()) {
                    
                    for(int j=0; j<this.modelosExamenes.get(i).getCaract_graficas().size(); j++) {                                                 
                        
                        try {
                            ChartUtilities.saveChartAsPNG(
                                    new java.io.File("temp\\caract\\" + this.modelosExamenes.get(i).getNombreModelo() + "\\" + (this.modelosExamenes.get(i).getCaract_graficas().get(j).getTitle().getText()) + ".PNG"),
                                    this.modelosExamenes.get(i).getCaract_graficas().get(j),
                                    400,
                                    260);                                                        
                            
                        } catch (java.io.IOException exc) {
                            JOptionPane.showMessageDialog(this, "Error al guardar las imagenes.", "Error", JOptionPane.ERROR_MESSAGE);                            

                        }
                        
                        /*this.jProgressBar1.setValue(j);
                        System.out.println(j);
                        Rectangle progressRect = this.jProgressBar1.getBounds();
                        progressRect.x = 0;
                        progressRect.y = 0;
                        this.jProgressBar1.paintImmediately(progressRect);*/
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Error al crear el directorio del modelo.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error al crear el directorio temporal para imagenes.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        this.jDialog1.setVisible(false);        
    }

    //Pendiente
    private void borrarDirectorio(File directorio) {
        File[] ficheros = directorio.listFiles();
 
        for (int x=0;x<ficheros.length;x++) {
            
            if (ficheros[x].isDirectory()) {
                borrarDirectorio(ficheros[x]);
            }
            
            ficheros[x].delete();
        }
        
        directorio.delete();
    }

    private void pintar_resultados() {
        String out = "";
        DecimalFormat df = new DecimalFormat("0.000");
        
        for(int k=0; k<this.modelosExamenes.size(); k++) {            
        
            out = out +
                    "<table align=\"center\" width=\"400px\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\">"
                    + "<caption style=\"font-weight:bold;\"> " + this.modelosExamenes.get(k).getNombreModelo() + "</caption>"
                    + "<tr>"
                        +  "<td style=\"text-align:center; font-weight:bold;\">Variable</td>";
            
            out = out + "<td style=\"text-align:center; font-weight:bold;\">Opci&oacute;n de respuesta</td>";
            out = out + "<td style=\"text-align:center; font-weight:bold;\">Frecuencia</td>";
            //out = out + "<td colspan=\"2\" style=\"text-align:center; font-weight:bold;\">Porcentaje</td>";
            out = out + "</tr>";                                  

            for(int i=0; i<this.modelosExamenes.get(k).getCaract_variables_seleccionadas().length; i++) {
                out = out + "<tr>";

                out = out + "<td style=\"text-align:center;\"";                
                out = out + " rowspan=\"" + this.modelosExamenes.get(k).getCaract_opciones_respuesta()[i].size() + "\">" + this.modelosExamenes.get(k).getCaract_variables_seleccionadas()[i] + "</td>";
                
                for(int j=0; j<this.modelosExamenes.get(k).getCaract_opciones_respuesta()[i].size(); j++) {
                    /*double por;
                    por = this.modelosExamenes.get(k).getFrecuencias_distractores()[i][j];
                    por = (por/this.modelosExamenes.get(k).getAlumnosOrdenada().size())*100;                    
                    */
                    
                    if(j!=0) {
                        out = out + "<tr>";
                    }
                    
                    out = out + "<td style=\"text-align:center;\">" + this.modelosExamenes.get(k).getCaract_opciones_respuesta()[i].get(j) + " </td>";
                    out = out + "<td style=\"text-align:center;\">" + this.modelosExamenes.get(k).getCaract_frecuencias_distractores()[i].get(j).intValue() + "</td>";
                    out = out + "</tr>";                                        
                }
                
                               
                
            }        

            out = out + "</table>";
            out = out + "<br /><br />";
            
        }
        
        for(int k=0; k<this.modelosExamenes.size(); k++) {            
                        
            out = out +
                    "<table align=\"center\" width=\"400px\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\">"
                    + "<caption style=\"text-align:center; font-weight:bold;\"> " + this.modelosExamenes.get(k).getNombreModelo() + "</caption>";
            
            for(int i=0; i<this.modelosExamenes.get(k).getCaract_graficas().size(); i++) {                                
                out = out + "<tr>"
                        +  "<td style=\"text-align:center; border:0;\">&nbsp;</td>";            

                out = out + "</tr>";            
                
                out = out + "<tr>";
                out = out + "<td style=\"text-align:center; border:0;\">";
                
                String nombreArchivo = "\"file:temp/caract/" + this.modelosExamenes.get(k).getNombreModelo() + "/" + (this.modelosExamenes.get(k).getCaract_graficas().get(i).getTitle().getText()) + ".PNG\"";                                
                
                out = out + "<img src=" + nombreArchivo + " width=\"400\" height=\"260\" border=\"0\">";
                out = out + "</td>";
                out = out + "</tr>";            
                
                out = out + "<tr>";
                out = out + "<td style=\"text-align:center; border:0;\">";
                out = out + "&nbsp;";
                out = out + "</td>";
                out = out + "</tr>";  
                
                out = out + "<tr>";
                out = out + "<td style=\"text-align:center; border:0;\">";
                out = out + "&nbsp;";
                out = out + "</td>";
                out = out + "</tr>"; 
            }        

            out = out + "</table>";
            out = out + "<br /> <br />";
        }
        
        this.panel_resultados.setText(out); 
    }

}
