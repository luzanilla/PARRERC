/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author UEE
 */
public class Parrerc extends javax.swing.JFrame {
    private CargarDatosExcel cd;
    private ItemAnalisis ia;
    private PAGI pagi;
    private AnalisisVersionesPrueba versiones;
    private Caracterizacion caracterizar;
    private ResultadosPorUnidadAprendizaje resPorUnidad;
    private ResultadosGenerales resGenerales;
    private InformePadresAlumnos infAlumnnos;

    /**
     * Creates new form Parrerc
     */
    public Parrerc() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        miCargarBD = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        miGuardarAnalisis = new javax.swing.JMenuItem();
        miGuardarReporte = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        miImprimirAnalisis = new javax.swing.JMenuItem();
        miImpirmirReporte = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        miSalir = new javax.swing.JMenuItem();
        menuPsicometricos = new javax.swing.JMenu();
        miAnalisisItems = new javax.swing.JMenuItem();
        miPAGI = new javax.swing.JMenuItem();
        miAnalisisVersionesPrueba = new javax.swing.JMenuItem();
        menuAnalisisResultados = new javax.swing.JMenu();
        miCaracExaminados = new javax.swing.JMenuItem();
        miResultadosGenerales = new javax.swing.JMenuItem();
        miResultadosPorUnidadAprendizaje = new javax.swing.JMenuItem();
        miResultadosGeneralesVC = new javax.swing.JMenuItem();
        miResultadosUnidadApendizajeVC = new javax.swing.JMenuItem();
        menuReporteResultados = new javax.swing.JMenu();
        miReporteEstudiantesYPadres = new javax.swing.JMenuItem();
        miReporteDocentes = new javax.swing.JMenuItem();
        miReporteDirectores = new javax.swing.JMenuItem();
        miReporteInspectores = new javax.swing.JMenuItem();
        miPlaneadorEducativo = new javax.swing.JMenuItem();
        miReporteSecretarioEducacion = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        miAyudaGeneral = new javax.swing.JMenuItem();
        miAcercaDe = new javax.swing.JMenuItem();

        fileChooser.setApproveButtonText("Abrir");
        fileChooser.setApproveButtonToolTipText("Abrir");
        fileChooser.setDialogTitle("Cargar Base de Datos");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos de Excel (.xls, xlsx)", "xls", "xlsx"));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Programa para el análisis y reporte de resultados de exámenes de referencia criterial");

        menuArchivo.setText("Archivo");

        miCargarBD.setText("Cargar base de datos");
        miCargarBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCargarBDActionPerformed(evt);
            }
        });
        menuArchivo.add(miCargarBD);
        menuArchivo.add(jSeparator1);

        miGuardarAnalisis.setText("Guardar análisis");
        miGuardarAnalisis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miGuardarAnalisisActionPerformed(evt);
            }
        });
        menuArchivo.add(miGuardarAnalisis);

        miGuardarReporte.setText("Guardar reporte");
        menuArchivo.add(miGuardarReporte);
        menuArchivo.add(jSeparator2);

        miImprimirAnalisis.setText("Imprimir análisis");
        menuArchivo.add(miImprimirAnalisis);

        miImpirmirReporte.setText("Imprimir reporte");
        menuArchivo.add(miImpirmirReporte);
        menuArchivo.add(jSeparator3);

        miSalir.setText("Salir");
        miSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(miSalir);

        jMenuBar1.add(menuArchivo);

        menuPsicometricos.setText("Análisis psicométricos");

        miAnalisisItems.setText("Análisis de ítems");
        miAnalisisItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAnalisisItemsActionPerformed(evt);
            }
        });
        menuPsicometricos.add(miAnalisisItems);

        miPAGI.setText("Análisis gráfico de ítems");
        miPAGI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPAGIActionPerformed(evt);
            }
        });
        menuPsicometricos.add(miPAGI);

        miAnalisisVersionesPrueba.setText("Análisis de versiones de la prueba");
        miAnalisisVersionesPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAnalisisVersionesPruebaActionPerformed(evt);
            }
        });
        menuPsicometricos.add(miAnalisisVersionesPrueba);

        jMenuBar1.add(menuPsicometricos);

        menuAnalisisResultados.setText("Análisis de resultados");

        miCaracExaminados.setText("Caracterización de examinados");
        miCaracExaminados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCaracExaminadosActionPerformed(evt);
            }
        });
        menuAnalisisResultados.add(miCaracExaminados);

        miResultadosGenerales.setText("Resultados generales");
        miResultadosGenerales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miResultadosGeneralesActionPerformed(evt);
            }
        });
        menuAnalisisResultados.add(miResultadosGenerales);

        miResultadosPorUnidadAprendizaje.setText("Resultados por unidad de aprendizaje");
        miResultadosPorUnidadAprendizaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miResultadosPorUnidadAprendizajeActionPerformed(evt);
            }
        });
        menuAnalisisResultados.add(miResultadosPorUnidadAprendizaje);

        miResultadosGeneralesVC.setText("Resultados generales contra variables de contexto");
        menuAnalisisResultados.add(miResultadosGeneralesVC);

        miResultadosUnidadApendizajeVC.setText("Resultados por unidad de aprendizaje contra variables de contexto");
        menuAnalisisResultados.add(miResultadosUnidadApendizajeVC);

        jMenuBar1.add(menuAnalisisResultados);

        menuReporteResultados.setText("Reporte de resultados");

        miReporteEstudiantesYPadres.setText("Reporte para estudiantes y padres");
        miReporteEstudiantesYPadres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miReporteEstudiantesYPadresActionPerformed(evt);
            }
        });
        menuReporteResultados.add(miReporteEstudiantesYPadres);

        miReporteDocentes.setText("Reporte para el docente");
        menuReporteResultados.add(miReporteDocentes);

        miReporteDirectores.setText("Reporte para el director");
        menuReporteResultados.add(miReporteDirectores);

        miReporteInspectores.setText("Reporte para el inspector");
        menuReporteResultados.add(miReporteInspectores);

        miPlaneadorEducativo.setText("Reporte para el planeador educativo");
        menuReporteResultados.add(miPlaneadorEducativo);

        miReporteSecretarioEducacion.setText("Reporte para el secretario de educación");
        menuReporteResultados.add(miReporteSecretarioEducacion);

        jMenuBar1.add(menuReporteResultados);

        menuAyuda.setText("Ayuda");

        miAyudaGeneral.setText("Ayuda General");
        menuAyuda.add(miAyudaGeneral);

        miAcercaDe.setText("Acerca de PARRERC");
        menuAyuda.add(miAcercaDe);

        jMenuBar1.add(menuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 763, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miGuardarAnalisisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGuardarAnalisisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miGuardarAnalisisActionPerformed

    private void miSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalirActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_miSalirActionPerformed

    private void miCargarBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCargarBDActionPerformed
        int valorDevuelto = this.fileChooser.showOpenDialog(this);
        
        if(valorDevuelto == JFileChooser.APPROVE_OPTION) {            
                        
            cd = new CargarDatosExcel(this, this.fileChooser.getSelectedFile().getAbsolutePath());            
            
            cd.setLocationRelativeTo(this);
            cd.setVisible(true);
        }
    }//GEN-LAST:event_miCargarBDActionPerformed

    private void miAnalisisItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAnalisisItemsActionPerformed
        /*ia = new ItemAnalisis(cd.getAlumnosOrdenada(), cd.getVariables().subList(cd.getIndice_inicio_items(), cd.getIndice_fin_items()), cd.getClavesRespuesta(), cd.getOpcionesRespuesta(), cd.getIndice_inicio_items());        */
        ia = new ItemAnalisis(cd.getModelosExamenes(), this.jDesktopPane1);        
        this.jDesktopPane1.add(ia); 
        this.jDesktopPane1.setSelectedFrame(ia);
    }//GEN-LAST:event_miAnalisisItemsActionPerformed

    private void miPAGIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPAGIActionPerformed
        pagi = new PAGI(cd.getModelosExamenes(), this.jDesktopPane1);        
        this.jDesktopPane1.add(pagi);
        this.jDesktopPane1.setSelectedFrame(pagi);
    }//GEN-LAST:event_miPAGIActionPerformed

    private void miAnalisisVersionesPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAnalisisVersionesPruebaActionPerformed
        versiones = new AnalisisVersionesPrueba(cd.getModelosExamenes(), this.jDesktopPane1);        
        this.jDesktopPane1.add(versiones);
        this.jDesktopPane1.setSelectedFrame(versiones);        
    }//GEN-LAST:event_miAnalisisVersionesPruebaActionPerformed

    private void miCaracExaminadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCaracExaminadosActionPerformed
        caracterizar = new Caracterizacion(cd.getModelosExamenes(), this.jDesktopPane1);
        this.jDesktopPane1.add(caracterizar);
        this.jDesktopPane1.setSelectedFrame(caracterizar);           
    }//GEN-LAST:event_miCaracExaminadosActionPerformed

    private void miResultadosPorUnidadAprendizajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miResultadosPorUnidadAprendizajeActionPerformed
        resPorUnidad = new ResultadosPorUnidadAprendizaje(cd.getModelosExamenes(), this.jDesktopPane1);
        this.jDesktopPane1.add(resPorUnidad);
        this.jDesktopPane1.setSelectedFrame(resPorUnidad);
    }//GEN-LAST:event_miResultadosPorUnidadAprendizajeActionPerformed

    private void miResultadosGeneralesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miResultadosGeneralesActionPerformed
        resGenerales = new ResultadosGenerales(cd.getModelosExamenes(), this.jDesktopPane1);
        this.jDesktopPane1.add(resGenerales);
        this.jDesktopPane1.setSelectedFrame(resGenerales);
    }//GEN-LAST:event_miResultadosGeneralesActionPerformed

    private void miReporteEstudiantesYPadresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miReporteEstudiantesYPadresActionPerformed
        infAlumnnos = new InformePadresAlumnos();
        this.jDesktopPane1.add(infAlumnnos);
        this.jDesktopPane1.setSelectedFrame(infAlumnnos);
    }//GEN-LAST:event_miReporteEstudiantesYPadresActionPerformed

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
            java.util.logging.Logger.getLogger(Parrerc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Parrerc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Parrerc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Parrerc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Parrerc().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenu menuAnalisisResultados;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuPsicometricos;
    private javax.swing.JMenu menuReporteResultados;
    private javax.swing.JMenuItem miAcercaDe;
    private javax.swing.JMenuItem miAnalisisItems;
    private javax.swing.JMenuItem miAnalisisVersionesPrueba;
    private javax.swing.JMenuItem miAyudaGeneral;
    private javax.swing.JMenuItem miCaracExaminados;
    private javax.swing.JMenuItem miCargarBD;
    private javax.swing.JMenuItem miGuardarAnalisis;
    private javax.swing.JMenuItem miGuardarReporte;
    private javax.swing.JMenuItem miImpirmirReporte;
    private javax.swing.JMenuItem miImprimirAnalisis;
    private javax.swing.JMenuItem miPAGI;
    private javax.swing.JMenuItem miPlaneadorEducativo;
    private javax.swing.JMenuItem miReporteDirectores;
    private javax.swing.JMenuItem miReporteDocentes;
    private javax.swing.JMenuItem miReporteEstudiantesYPadres;
    private javax.swing.JMenuItem miReporteInspectores;
    private javax.swing.JMenuItem miReporteSecretarioEducacion;
    private javax.swing.JMenuItem miResultadosGenerales;
    private javax.swing.JMenuItem miResultadosGeneralesVC;
    private javax.swing.JMenuItem miResultadosPorUnidadAprendizaje;
    private javax.swing.JMenuItem miResultadosUnidadApendizajeVC;
    private javax.swing.JMenuItem miSalir;
    // End of variables declaration//GEN-END:variables
}
