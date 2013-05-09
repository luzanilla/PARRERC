/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entidades.ModeloExamen;
import java.util.List;
import javax.swing.JDesktopPane;

/**
 *
 * @author Erick
 */
public class DefineVariablesAnalisis extends javax.swing.JDialog {

    private List<ModeloExamen> modelosExamenes;
    
    /**
     * Creates new form DefineVariablesAnalisis
     */
    public DefineVariablesAnalisis(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public DefineVariablesAnalisis(List<ModeloExamen> modelosExamenes, JDesktopPane jDesktopPane1) {        
        this.setModal(true);
        this.modelosExamenes = modelosExamenes;
        initComponents();
        evaluaDefinicionDeVariables();
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

        jPanel1 = new javax.swing.JPanel();
        check_municipio = new javax.swing.JCheckBox();
        check_zona_escolar = new javax.swing.JCheckBox();
        check_escuela = new javax.swing.JCheckBox();
        check_grupo = new javax.swing.JCheckBox();
        check_mostrar_graficas = new javax.swing.JCheckBox();
        check_desplegar_anova = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        boton_aceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Selecciona variables a incluir en el análisis");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        check_municipio.setSelected(true);
        check_municipio.setText("Por municipio");

        check_zona_escolar.setSelected(true);
        check_zona_escolar.setText("Por zona escolar");

        check_escuela.setSelected(true);
        check_escuela.setText("Por escuela");

        check_grupo.setSelected(true);
        check_grupo.setText("Por grupo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check_municipio)
                    .addComponent(check_zona_escolar)
                    .addComponent(check_escuela)
                    .addComponent(check_grupo))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {check_escuela, check_grupo, check_municipio, check_zona_escolar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(check_municipio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(check_zona_escolar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(check_escuela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(check_grupo)
                .addContainerGap())
        );

        check_mostrar_graficas.setSelected(true);
        check_mostrar_graficas.setText("Mostrar gráficas");

        check_desplegar_anova.setText("Desplegar tabla de ANOVA (Análisis de varianza)");

        boton_aceptar.setText("Aceptar");
        boton_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_aceptarActionPerformed(evt);
            }
        });
        jPanel5.add(boton_aceptar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(check_mostrar_graficas)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(check_desplegar_anova))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(check_mostrar_graficas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(check_desplegar_anova)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_aceptarActionPerformed
        for(int i=0; i<this.modelosExamenes.size(); i++) {
            
            if(this.check_municipio.isSelected()) {
                this.modelosExamenes.get(i).setPor_municipio(true);
            }
            
            if(this.check_zona_escolar.isSelected()) {
                this.modelosExamenes.get(i).setPor_zona_escolar(true);
            }
            
            if(this.check_escuela.isSelected()) {
                this.modelosExamenes.get(i).setPor_escuela(true);
            }
            
            if(this.check_grupo.isSelected()) {
                this.modelosExamenes.get(i).setPor_grupo(true);
            }
            
            if(this.check_mostrar_graficas.isSelected()) {
                this.modelosExamenes.get(i).setDespliega_graficas(true);
            }
            
            if(this.check_desplegar_anova.isSelected()) {
                this.modelosExamenes.get(i).setDespliega_anova(true);
            }
        }
        
        this.dispose();
    }//GEN-LAST:event_boton_aceptarActionPerformed

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
            java.util.logging.Logger.getLogger(DefineVariablesAnalisis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DefineVariablesAnalisis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DefineVariablesAnalisis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DefineVariablesAnalisis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DefineVariablesAnalisis dialog = new DefineVariablesAnalisis(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton boton_aceptar;
    private javax.swing.JCheckBox check_desplegar_anova;
    private javax.swing.JCheckBox check_escuela;
    private javax.swing.JCheckBox check_grupo;
    private javax.swing.JCheckBox check_mostrar_graficas;
    private javax.swing.JCheckBox check_municipio;
    private javax.swing.JCheckBox check_zona_escolar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables

    private void evaluaDefinicionDeVariables() {
        if(this.modelosExamenes.get(0).getVarMunicipio()==null) {
            this.check_municipio.setEnabled(false);
        }
        
        if(this.modelosExamenes.get(0).getVarZonaEscolar()==null) {
            this.check_zona_escolar.setEnabled(false);
        }
        
        if(this.modelosExamenes.get(0).getVarEscuela()==null) {
            this.check_escuela.setEnabled(false);
        }
        
        if(this.modelosExamenes.get(0).getVarGrupo()==null) {
            this.check_grupo.setEnabled(false);
        }
    }
}
