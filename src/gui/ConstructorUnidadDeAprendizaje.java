/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entidades.ModeloExamen;
import entidades.UnidadAprendizaje;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;

/**
 *
 * @author UEE
 */
public class ConstructorUnidadDeAprendizaje extends javax.swing.JDialog {

    private List<ModeloExamen> modelosExamenes;
    private List<String> temp; //Lista de items seleccionados
    private List<String> temp2; //Lista de items
    private List<String> temp3; //Lista de unidades de aprendizaje
    private List<UnidadAprendizaje> unidades_aprendizaje;
    private UnidadAprendizaje unidad;
    
    /**
     * Creates new form ConstructorUnidadDeAprendizaje
     */
    public ConstructorUnidadDeAprendizaje(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public ConstructorUnidadDeAprendizaje(List<ModeloExamen> modelosExamenes, JDesktopPane jDesktopPane1) {
        this.setModal(true);
        this.modelosExamenes = modelosExamenes;
        initComponents();
        temp2 = new ArrayList<>(this.modelosExamenes.get(0).getNombresItems());
        this.listaItems.setListData(temp2.toArray());
        this.setLocationRelativeTo(jDesktopPane1);
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

        botonAgregar = new javax.swing.JButton();
        botonCambiar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextNombreUnidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaUnidadesApendizaje = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaItems = new javax.swing.JList();
        botonCambiarVariable = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaItemsSeleccionados = new javax.swing.JList();
        jPanel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Define Unidades de Aprendizaje");
        setBounds(new java.awt.Rectangle(0, 0, 329, 365));
        setResizable(false);

        botonAgregar.setText("Agregar");
        botonAgregar.setEnabled(false);
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        botonCambiar.setText("Cambiar");
        botonCambiar.setEnabled(false);
        botonCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiarActionPerformed(evt);
            }
        });

        botonEliminar.setText("Eliminar");
        botonEliminar.setEnabled(false);
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre de Unidad de Aprendizaje:");

        jTextNombreUnidad.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextNombreUnidadCaretUpdate(evt);
            }
        });

        listaUnidadesApendizaje.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaUnidadesApendizaje.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaUnidadesApendizajeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaUnidadesApendizaje);

        listaItems.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaItems.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaItemsValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listaItems);

        botonCambiarVariable.setText(">");
        botonCambiarVariable.setEnabled(false);
        botonCambiarVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiarVariableActionPerformed(evt);
            }
        });

        listaItemsSeleccionados.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaItemsSeleccionados.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaItemsSeleccionadosValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listaItemsSeleccionados);

        jButton5.setText("Cerrar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonCambiar)
                            .addComponent(botonEliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextNombreUnidad)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonCambiarVariable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane2, jScrollPane3});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botonAgregar, botonCambiar, botonEliminar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregar)
                    .addComponent(jTextNombreUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonCambiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonEliminar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(botonCambiarVariable)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botonAgregar, botonCambiar, botonEliminar});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane2, jScrollPane3});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        for(int i=0; i<this.modelosExamenes.size(); i++) {
            this.modelosExamenes.get(i).setUnidades_aprendizaje(unidades_aprendizaje);
        }
        
        //Imprimimos el contenido de cada unidad de aprensizaje para revisar que todo este correcto
        for(int i=0; i<this.modelosExamenes.get(0).getUnidades_aprendizaje().size(); i++) {
            String n = this.modelosExamenes.get(0).getUnidades_aprendizaje().get(i).getNombre() + ":";
            
            for(int j=0; j<this.modelosExamenes.get(0).getUnidades_aprendizaje().get(i).getItems().size(); j++) {
                n = n + " " + this.modelosExamenes.get(0).getUnidades_aprendizaje().get(i).getItems().get(j);
            }
            
            System.out.println(n);
        }
        
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void listaItemsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaItemsValueChanged
        this.listaItemsSeleccionados.clearSelection();
        this.botonCambiar.setEnabled(false);
        
        if (this.listaItems.getSelectedIndex() >= 0) {
            this.botonCambiarVariable.setText(">");
            this.botonCambiarVariable.setEnabled(true);
        } else {
            this.botonCambiarVariable.setEnabled(false);
        }
    }//GEN-LAST:event_listaItemsValueChanged

    private void botonCambiarVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambiarVariableActionPerformed
        
        if(temp == null) {
            temp = new ArrayList<>();
        }
        
        if (this.botonCambiarVariable.getText().equalsIgnoreCase(">")) {
            //Agregamos la variable al modelo de datos y a la lista
            temp.add(this.listaItems.getModel().getElementAt(this.listaItems.getSelectedIndex()).toString());
            this.listaItemsSeleccionados.setListData(temp.toArray());

            //Cambiamos el modelo de datos y la lista
            temp2.remove(this.listaItems.getSelectedIndex());
            this.listaItems.setListData(temp2.toArray());
        } else {
            if (this.botonCambiarVariable.getText().equalsIgnoreCase("<")) {                
                temp2.add(this.listaItemsSeleccionados.getModel().getElementAt(this.listaItemsSeleccionados.getSelectedIndex()).toString());
                this.listaItems.setListData(temp2.toArray());

                temp.remove(this.listaItemsSeleccionados.getSelectedIndex());
                this.listaItemsSeleccionados.setListData(temp.toArray());
            }
        }
        
        if(this.listaUnidadesApendizaje.getSelectedIndex()==-1) {
            if(evaluaContenido()) {
                this.botonAgregar.setEnabled(true);
            } else {
                this.botonAgregar.setEnabled(false);
            }
        } else {
            this.botonEliminar.setEnabled(false);
            this.botonCambiar.setEnabled(true);
        }
    }//GEN-LAST:event_botonCambiarVariableActionPerformed

    private void listaItemsSeleccionadosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaItemsSeleccionadosValueChanged
        //Quitamos los elementos seleccionados de los otros list
        this.listaItems.clearSelection(); 
        this.botonCambiar.setEnabled(false);

        if (this.listaItemsSeleccionados.getSelectedIndex() >= 0) {
            //Cambiamos el sentido del botón y lo habilitamos
            this.botonCambiarVariable.setText("<");
            this.botonCambiarVariable.setEnabled(true);
        } else {
            this.botonCambiarVariable.setEnabled(false);
        }
    }//GEN-LAST:event_listaItemsSeleccionadosValueChanged

    private void jTextNombreUnidadCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextNombreUnidadCaretUpdate
        
        if(this.listaUnidadesApendizaje.getSelectedIndex()==-1) {
            if(evaluaContenido()) {
                this.botonAgregar.setEnabled(true);
            } else {
                this.botonAgregar.setEnabled(false);
            }
        } else {
            this.botonEliminar.setEnabled(false);
            this.botonCambiar.setEnabled(true);
        }
        
    }//GEN-LAST:event_jTextNombreUnidadCaretUpdate

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        if(temp3 == null) {
            temp3 = new ArrayList<>();
        }    
        
        if(unidades_aprendizaje == null) {
            unidades_aprendizaje = new ArrayList<>();
        }        
        
        //Creamos la unidad de aprendizaje
        unidad = new UnidadAprendizaje(this.jTextNombreUnidad.getText().trim(), temp);
        //Agregamos la unidad de aprendizaje a la lista
        unidades_aprendizaje.add(unidad);
        
        //Agregamos el nombre de la unidad de aprendizaje al jList de unidades de aprendizaje
        temp3.add(this.jTextNombreUnidad.getText().trim());
        this.listaUnidadesApendizaje.setListData(temp3.toArray());
        
        reiniciarContenido();
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void listaUnidadesApendizajeValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaUnidadesApendizajeValueChanged
        
        if(this.listaUnidadesApendizaje.getSelectedIndex()>=0) {
            this.listaItems.clearSelection();
            this.listaItemsSeleccionados.clearSelection();
            this.botonCambiarVariable.setEnabled(false);
            
            this.jTextNombreUnidad.setText(this.unidades_aprendizaje.get(this.listaUnidadesApendizaje.getSelectedIndex()).getNombre());
            
            unidad = this.unidades_aprendizaje.get(this.listaUnidadesApendizaje.getSelectedIndex());
            this.temp = unidad.getItems();
            this.listaItemsSeleccionados.setListData(temp.toArray());
            
            temp2 = new ArrayList<>(this.modelosExamenes.get(0).getNombresItems().subList(0, this.modelosExamenes.get(0).getNombresItems().size()));            
            
            for(int i=0; i<this.temp.size(); i++) {
                int indice = temp2.indexOf(temp.get(i));
                temp2.remove(indice);
            }
            
            this.listaItems.setListData(temp2.toArray());

            this.botonEliminar.setEnabled(true);
            this.botonAgregar.setEnabled(false);
            this.botonCambiar.setEnabled(false);
        }
        
    }//GEN-LAST:event_listaUnidadesApendizajeValueChanged

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        //Eliminamos la unidad de la lista de unidades de aprendizaje
        this.unidades_aprendizaje.remove(this.listaUnidadesApendizaje.getSelectedIndex());
        
        //Eliminamos la unidad de aprendizaje del modelo de datos y actualizamos el contenido del jList
        temp3.remove(this.listaUnidadesApendizaje.getSelectedIndex());
        this.listaUnidadesApendizaje.setListData(temp3.toArray());
        
        this.botonEliminar.setEnabled(false);
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambiarActionPerformed
        unidad = unidades_aprendizaje.get(this.listaUnidadesApendizaje.getSelectedIndex());
        unidad.setNombre(this.jTextNombreUnidad.getText());
        unidad.setItems(temp);
        unidades_aprendizaje.set(this.listaUnidadesApendizaje.getSelectedIndex(), unidad);
        
        //Agregamos el nombre de la unidad de aprendizaje al jList de unidades de aprendizaje
        temp3.set(this.listaUnidadesApendizaje.getSelectedIndex(), this.jTextNombreUnidad.getText().trim());
        this.listaUnidadesApendizaje.setListData(temp3.toArray());
        
        reiniciarContenido();
    }//GEN-LAST:event_botonCambiarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConstructorUnidadDeAprendizaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConstructorUnidadDeAprendizaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConstructorUnidadDeAprendizaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConstructorUnidadDeAprendizaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConstructorUnidadDeAprendizaje dialog = new ConstructorUnidadDeAprendizaje(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonCambiar;
    private javax.swing.JButton botonCambiarVariable;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextNombreUnidad;
    private javax.swing.JList listaItems;
    private javax.swing.JList listaItemsSeleccionados;
    private javax.swing.JList listaUnidadesApendizaje;
    // End of variables declaration//GEN-END:variables

    private boolean evaluaContenido() {
        if(this.listaItemsSeleccionados.getModel().getSize()>0 && jTextNombreUnidad.getText().length()>0) {
            return true;
        }
        
        return false;
    }

    private void reiniciarContenido() {
        //Reiniciamos el contenido de items del jList
        temp2 = new ArrayList<>(this.modelosExamenes.get(0).getNombresItems());
        this.listaItems.setListData(temp2.toArray());
        
        //Reiniciamos el contenido de los items seleccionados del jList
        temp = new ArrayList<>();
        this.listaItemsSeleccionados.setListData(temp.toArray());
        
        //Reiniciamos el contenido del nombre de la unidad de aprendizaje
        this.jTextNombreUnidad.setText("");
        
        //Desactivamos los botones
        this.botonAgregar.setEnabled(false);
        this.botonCambiar.setEnabled(false);
        this.botonEliminar.setEnabled(false);
    }
}
