/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_1;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author WINDOWS 10
 */
public final class Grafica_Barras extends JFrame{
    String titulo;    

    public int [] bubbleSort(int arr[]) {
	int n = arr.length;
            for (int i = 0; i < n-1; i++)
                for (int j = 0; j < n-i-1; j++)
                    if (arr[j] > arr[j+1]){
			int temp = arr[j];
			arr[j] = arr[j+1];
			arr[j+1] = temp;
			}
        return arr;
    }
    
    public Grafica_Barras(String titulo) {
        super(titulo);
        this.titulo = titulo;
        setContentPane(crearPanel());
        this.repaint();
    }
    
    JPanel crearPanel(){
        JFreeChart grafica = crearChart(crearDataset());
        return new ChartPanel(grafica);
    }
    
    JFreeChart crearChart(CategoryDataset dataset){
        return ChartFactory.createBarChart(titulo, "", "Precios", dataset);
    }
    
    CategoryDataset crearDataset(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        int Top[] = bubbleSort(this.carro[].getPrecio());
        int top1 = Top[0];
        int top2 = Top[1];
        int top3 = Top[2];
        dataset.setValue(top1.getPrecio(), "Precio", top1.getFabricante() + " " + top1.getModelo() + " " + top1.getYear());
        dataset.setValue(top2.getPrecio(), "Precio", top2.getFabricante() + " " + top2.getModelo() + " " + top2.getYear());
        dataset.setValue(top3.getPrecio(), "Precio", top3.getFabricante() + " " + top3.getModelo() + " " + top3.getYear());
        return dataset;
    }
}
