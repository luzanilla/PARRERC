/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entidades.Alumno;
import entidades.ModeloExamen;
import entidades.MyLineChart;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JEditorPane;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;

/**
 *
 * @author Erick
 */
public class PAGI extends javax.swing.JInternalFrame {    
    private List<Alumno> alumnosOrdenada;
    private List<String> claves_respuesta;
    private List<String> items;
    private List<String> opcionesRespuesta;
    private List<JFreeChart> graficasFrec;
    private List<int[][]> tablaFinalFrec;
    private List<JFreeChart> graficasPor;
    private List<float[][]> tablaFinalPor;
    float[][] tablaPor;
    int[][] tablaCuartiles;
    private MyLineChart chart;
    private int indice = 0;
    private ChartPanel chartPanel;    
    private int indice_inicio_items;
    private List<ModeloExamen> modelosExamenes;        
    
    /**
     * Creates new form PAGI
     */    
    PAGI(List<ModeloExamen> modelosExamenes, JDesktopPane jDesktopPane1) {
        this.modelosExamenes = modelosExamenes;
        initComponents();
        creaGraficas();
        guardarImagenes();
        pintarResultados();
        
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension jInternalFrameSize = this.getSize();

        this.setLocation((desktopSize.width - jInternalFrameSize.width)/2, (desktopSize.height- jInternalFrameSize.height)/2);                        
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
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane3 = new javax.swing.JScrollPane();
        panel_resultados = new javax.swing.JEditorPane();

        jDialog1.setTitle("Progreso...");
        jDialog1.setBounds(new java.awt.Rectangle(0, 0, 263, 100));
        jDialog1.setResizable(false);

        jLabel1.setText("Progreso:");

        jProgressBar1.setStringPainted(true);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                .addContainerGap())
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Análisis gráfico de ítems");
        setAutoscrolls(true);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        panel_resultados.setEditable(false);
        panel_resultados.setContentType("text/html");
        jScrollPane3.setViewportView(panel_resultados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JEditorPane panel_resultados;
    // End of variables declaration//GEN-END:variables

    private void creaGraficas() {
        
        for(int l=0; l<this.modelosExamenes.size(); l++) {
            String res;
            int in;
            int cur;        
            
            tablaFinalFrec = new ArrayList<>();
            graficasFrec = new ArrayList<>();

            tablaFinalPor = new ArrayList<>();
            graficasPor = new ArrayList<>();

            System.out.println("Items = " + this.modelosExamenes.get(l).getNombresItems().size());

            //Para todos los ítmes
            for (int i = 0; i < this.modelosExamenes.get(l).getNombresItems().size(); i++) {
                tablaCuartiles = new int[4][this.modelosExamenes.get(l).getOpcionesRespuesta().size()];

                //Recorremos todos los alumnos y leemos su respuesta
                for (Alumno a : this.modelosExamenes.get(l).getAlumnosOrdenada()) {
                    res = a.getRespuesta((i+this.modelosExamenes.get(l).getIndice_inicio_items()));
                    in = 0;

                    //Y comparamos con todas las opciones de respuesta posibles
                    for (String s : this.modelosExamenes.get(l).getOpcionesRespuesta()) {

                        //Si la respuesta del alumno es igual a la opcion de respuesta
                        if (res.equalsIgnoreCase(s)) {
                            cur = a.getCuartil();

                            //Se incrementa en uno el valor corespondiente
                            switch (cur) {
                                case 1:
                                    tablaCuartiles[0][in]++;
                                    break;

                                case 2:
                                    tablaCuartiles[1][in]++;
                                    break;

                                case 3:
                                    tablaCuartiles[2][in]++;
                                    break;

                                case 4:
                                    tablaCuartiles[3][in]++;
                                    break;

                            }

                            break;
                        }

                        in++;
                    }

                }            

                tablaFinalFrec.add(tablaCuartiles);
                chart = new MyLineChart(this.modelosExamenes.get(l).getNombresItems().get(i), this.modelosExamenes.get(l).getOpcionesRespuesta(), tablaCuartiles, this.modelosExamenes.get(l).getClavesRespuesta().get(i));
                graficasFrec.add(chart.getGrafica());                
                
                tablaPor = new float[4][this.modelosExamenes.get(l).getOpcionesRespuesta().size()];

                for (int j = 0; j < 4; j++) {
                    for (int k = 0; k < tablaCuartiles[j].length; k++) {
                        tablaPor[j][k] = (tablaCuartiles[j][k] * 100) / ((float) this.modelosExamenes.get(l).getAlumnosOrdenada().size());
                    }

                }

                tablaFinalPor.add(tablaPor);
                chart = new MyLineChart(this.modelosExamenes.get(l).getNombresItems().get(i), this.modelosExamenes.get(l).getOpcionesRespuesta(), tablaPor, this.modelosExamenes.get(l).getClavesRespuesta().get(i));
                graficasPor.add(chart.getGrafica());
            }
            
            this.modelosExamenes.get(l).setGraficasFrec(graficasFrec);
            this.modelosExamenes.get(l).setGraficasPor(graficasPor);
        }
        
    }    

    private void pintarResultados() {
        String out = "";
        
        for(int k=0; k<this.modelosExamenes.size(); k++) {            
                        
            out = out +
                    "<table align=\"center\" width=\"550px\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\">"
                    + "<caption style=\"text-align:center; font-weight:bold;\"> " + this.modelosExamenes.get(k).getNombreModelo() + "</caption>";
            
            for(int i=0; i<this.modelosExamenes.get(k).getGraficasFrec().size(); i++) {                                
                out = out + "<tr>"
                        +  "<td style=\"text-align:center; border:0;\">&nbsp;</td>";            

                out = out + "</tr>";            
                
                out = out + "<tr>";
                out = out + "<td style=\"text-align:center; border:0;\">";
                
                String nombreArchivo = "\"file:temp/" + this.modelosExamenes.get(k).getNombreModelo() + "/" + (this.modelosExamenes.get(k).getGraficasFrec().get(i).getTitle().getText()) + ".PNG\"";                                
                
                out = out + "<img src=" + nombreArchivo + " width=\"500\" height=\"300\" border=\"0\">";
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
    
    private void guardarImagenes() {
        File dir = new File("temp");                
        
        if(dir.exists()) {
            borrarDirectorio(dir);                                   
        }
        
        this.jDialog1.setLocationRelativeTo(null);
        this.jDialog1.setVisible(true);
        
        
        if (dir.mkdirs()) {
            for(int i=0; i<this.modelosExamenes.size(); i++) {
                
                this.jLabel1.setText("Modelo " + (i+1) + " de " + this.modelosExamenes.size() + ":");
                Rectangle progressLabel = this.jProgressBar1.getBounds();
                progressLabel.x = 0;
                progressLabel.y = 0;
                this.jLabel1.paintImmediately(progressLabel);
                
                this.jProgressBar1.setMinimum(0);
                this.jProgressBar1.setMaximum(this.modelosExamenes.get(i).getGraficasFrec().size());
                
                File dirModelo = new File("temp\\" + this.modelosExamenes.get(i).getNombreModelo());                                                               
                
                if (dirModelo.mkdirs()) {
                    
                    for(int j=0; j<this.modelosExamenes.get(i).getGraficasFrec().size(); j++) {                                                 
                        
                        try {
                            ChartUtilities.saveChartAsPNG(
                                    new java.io.File("temp\\" + this.modelosExamenes.get(i).getNombreModelo() + "\\" + (this.modelosExamenes.get(i).getGraficasFrec().get(j).getTitle().getText()) + ".PNG"),
                                    this.modelosExamenes.get(i).getGraficasFrec().get(j),
                                    500,
                                    300);                                                        
                            
                        } catch (java.io.IOException exc) {
                            JOptionPane.showMessageDialog(this, "Error al guardar las imagenes.", "Error", JOptionPane.ERROR_MESSAGE);                            

                        }
                        
                        this.jProgressBar1.setValue(j);
                        System.out.println(j);
                        Rectangle progressRect = this.jProgressBar1.getBounds();
                        progressRect.x = 0;
                        progressRect.y = 0;
                        this.jProgressBar1.paintImmediately(progressRect);
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

    public JEditorPane getPanel_resultados() {
        return panel_resultados;
    }

    void mostrar() {
        this.toFront();
        this.show();
    }
    
}
