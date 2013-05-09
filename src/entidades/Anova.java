/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import org.apache.commons.math3.stat.inference.TestUtils;

/**
 *
 * @author UEE
 */
public class Anova {
    private ArrayList<double []> lista=new ArrayList<double []>();

    /*
     * En teoria es posible realizar un analisis Anova solo
     * con dos series de datos, aunque el modo correcto es con
     * un analisis de regresión.
     */
    public Anova(double [] dataSet1, double [] dataSet2){
        lista.add(dataSet1);
        lista.add(dataSet2);
    }
    
    /*
     * Inicia vacío
     */
    public Anova(){
        
    }

    /*
     * Agregar una Serie de datos, al agregan la 3ra serie
     * realmente se efectuará un analisis anova
     */
    public void addDataSet(double [] dataSet){
        lista.add(dataSet);
    }

    /*
     * Obtener Valor de F
     */
    public double getFValue() throws IllegalArgumentException{
        double f_result = TestUtils.oneWayAnovaFValue(lista);
        return f_result;
    }

    /*
     * Obtener Valor de P
     */
    public double getPValue() throws IllegalArgumentException{
        double p_result = TestUtils.oneWayAnovaPValue(lista);
        return p_result;
    }

    /*
     * Obtener evaluación del analisis ANOVA
     * True=Hipotesis nula rechazada
     * False=Hipotesis nula aceptada
     *
     * el valor de la significancia (Alpha) es
     * recomendado en un 0.05 o 0.01
     */
    public boolean getResult() throws IllegalArgumentException{
        double significance = .05;
        return TestUtils.oneWayAnovaTest(lista, significance);
    } 
}
