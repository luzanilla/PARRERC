/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.awt.BasicStroke;
import java.awt.Color;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Erick
 */
public class MyLineChart {
    final JFreeChart chart;

    /**
     * Creates a new demo.
     *
     * @param title the frame title.
     */
    public MyLineChart(String title, List<String> opciones, int[][] datos, String correcta) {
        //super(title);
        final CategoryDataset dataset = createDataset(opciones, datos, correcta);
        chart = createChart(title, dataset, "Frecuencia de examinados", false);
    }

    public MyLineChart(String title, List<String> opciones, float[][] datos, String correcta) {
        //super(title);
        final CategoryDataset dataset = createDataset(opciones, datos, correcta);
        chart = createChart(title, dataset, "Porcentaje de examinados", true);
    }
    
    public JFreeChart getGrafica() {
        return this.chart;
    }

    /**
     * Creates a sample dataset.
     *
     * @return The dataset.
     */
    private CategoryDataset createDataset(List<String> opciones, int[][] datos, String correcta) {
// row keys...
        List<String> series = opciones;
        
// column keys...
        final String type1 = "1";
        final String type2 = "2";
        final String type3 = "3";
        final String type4 = "4";
        
// create the dataset...
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for(int i=0; i<series.size(); i++) {
            if(correcta.equalsIgnoreCase(series.get(i))) {
                dataset.addValue(datos[0][i], series.get(i)+"*", type1);
                dataset.addValue(datos[1][i], series.get(i)+"*", type2);
                dataset.addValue(datos[2][i], series.get(i)+"*", type3);
                dataset.addValue(datos[3][i], series.get(i)+"*", type4);
            } else {
                dataset.addValue(datos[0][i], series.get(i), type1);
                dataset.addValue(datos[1][i], series.get(i), type2);
                dataset.addValue(datos[2][i], series.get(i), type3);
                dataset.addValue(datos[3][i], series.get(i), type4);
            }
        }
        
        return dataset;
    }

    /**
     * Creates a sample dataset.
     *
     * @return The dataset.
     */
    private CategoryDataset createDataset(List<String> opciones, float[][] datos, String correcta) {
// row keys...
        List<String> series = opciones;

// column keys...
        final String type1 = "1";
        final String type2 = "2";
        final String type3 = "3";
        final String type4 = "4";

// create the dataset...
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for(int i=0; i<series.size(); i++) {
            if(correcta.equalsIgnoreCase(series.get(i))) {
                dataset.addValue(datos[0][i], series.get(i)+"*", type1);
                dataset.addValue(datos[1][i], series.get(i)+"*", type2);
                dataset.addValue(datos[2][i], series.get(i)+"*", type3);
                dataset.addValue(datos[3][i], series.get(i)+"*", type4);
            } else {
                dataset.addValue(datos[0][i], series.get(i), type1);
                dataset.addValue(datos[1][i], series.get(i), type2);
                dataset.addValue(datos[2][i], series.get(i), type3);
                dataset.addValue(datos[3][i], series.get(i), type4);
            }
        }

        return dataset;
    }

    /**
     * Creates a sample chart.
     *
     * @param dataset a dataset.
     *
     * @return The chart.
     */
    private JFreeChart createChart(String title, final CategoryDataset dataset, String tituloY, boolean auto) {
// create the chart...
        final JFreeChart chart = ChartFactory.createLineChart(
                title, // chart title
                "Grupos de habilidad (Calificación)", // domain axis label
                tituloY, // range axis label
                dataset, // data
                PlotOrientation.VERTICAL, // orientation
                true, // include legend
                true, // tooltips
                true // urls
                );
// NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...
//final StandardLegend legend = (StandardLegend) chart.getLegend();
//legend.setDisplaySeriesShapes(true);
//legend.setShapeScaleX(1.5);
//legend.setShapeScaleY(1.5);
//legend.setDisplaySeriesLines(true);
        chart.setBackgroundPaint(Color.white);

        final CategoryPlot plot = (CategoryPlot) chart.getPlot();

        plot.setBackgroundPaint(new Color(240, 240, 240));
        plot.setRangeGridlinePaint(Color.darkGray);
        plot.setRangeGridlinesVisible(true);
        plot.setDomainGridlinePaint(Color.darkGray);
        plot.setDomainGridlinesVisible(true);

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
        

        //System.out.println(cAxis.getMaximumCategoryLabelLines()+" Erick "+cAxis.getUpperMargin());
        

        //rangeAxis.setAutoRange(true);
        //rangeAxis.setAutoRangeMinimumSize(1);
// customise the renderer...
        final LineAndShapeRenderer renderer = (LineAndShapeRenderer) plot.getRenderer();        
//renderer.setDrawShapes(true);
        renderer.setSeriesStroke(
                0, new BasicStroke(
                3.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND,
                1.0f, new float[]{8.0f, 6.0f}, 0.0f));
        renderer.setSeriesStroke(
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

        plot.setRenderer(renderer);
// OPTIONAL CUSTOMISATION COMPLETED.

        /*try {
            ChartUtilities.saveChartAsJPEG(
                    new java.io.File("C:/"+title+".JPEG"), chart, 800, 300);
        } catch (java.io.IOException exc) {
            System.err.println("Error writing image to file");

        }*/

        return chart;

    }   
}
