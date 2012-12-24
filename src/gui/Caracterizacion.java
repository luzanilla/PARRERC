/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entidades.ModeloExamen;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;

/**
 *
 * @author Erick
 */
public class Caracterizacion extends javax.swing.JInternalFrame {
    private List<ModeloExamen> modelosExamenes;
    private List<String> temp;
    private List<String> temp2;
    private String[] variables_seleccionadas;
            
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
        nombres_variables_primera_fila = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        boton_aceptar = new javax.swing.JButton();
        boton_cancelar = new javax.swing.JButton();
        panel_resultados = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();

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

        nombres_variables_primera_fila.setText("Mostrar gráficos");

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
                .addComponent(nombres_variables_primera_fila)
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
                .addComponent(nombres_variables_primera_fila)
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

        panel_resultados.setViewportView(jEditorPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_resultados)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_resultados, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cancelarActionPerformed
        this.jDialog1.dispose();
    }//GEN-LAST:event_boton_cancelarActionPerformed

    private void boton_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_aceptarActionPerformed
        
        
        for(int i=0; i<this.lista_variable_id_sujeto.getModel().getSize(); i++) {
            
        }
        
        /*try {
            this.variable_id = this.lista_variable_id_sujeto.getModel().getElementAt(0).toString();
            this.variable_modelo = this.lista_variable_modelo_prueba.getModel().getElementAt(0).toString();            

            this.dispose();

            for(int j=0; j<this.modelosExamenes.size(); j++) {

                this.modelosExamenes.get(j).setVars_contexto(this.modelosExamenes.get(j).getVariables().subList(0, (this.modelosExamenes.get(j).getIndice_inicio_items()-1)));
                this.modelosExamenes.get(j).setVars_items( this.modelosExamenes.get(j).getVariables().subList(this.modelosExamenes.get(j).getIndice_inicio_items(), this.modelosExamenes.get(j).getIndice_fin_items()) );

                System.out.println("Opciones de respuesta: " + this.modelosExamenes.get(j).getNombreModelo());

                for (int i = 0; i < this.modelosExamenes.get(j).getOpcionesRespuesta().size(); i++) {
                    System.out.print(this.modelosExamenes.get(j).getOpcionesRespuesta().get(i) + ", ");
                }

                System.out.println("");

                System.out.println("Alumnos Ordenada: " + this.modelosExamenes.get(j).getNombreModelo());

                for (int i = 0; i < this.modelosExamenes.get(j).getAlumnosOrdenada().size(); i++) {
                    System.out.print(this.modelosExamenes.get(j).getAlumnosOrdenada().get(i).getAciertos() + ", ");
                }

                System.out.println("");
            }

            JOptionPane.showMessageDialog(this, "Base de datos cargada.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            this.inp.close();
        } catch (IOException ex) {
            Logger.getLogger(CargarDatosExcel.class.getName()).log(Level.SEVERE, null, ex);
        }*/
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
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listaVariables;
    private javax.swing.JList lista_variable_id_sujeto;
    private javax.swing.JCheckBox nombres_variables_primera_fila;
    private javax.swing.JScrollPane panel_resultados;
    // End of variables declaration//GEN-END:variables
}