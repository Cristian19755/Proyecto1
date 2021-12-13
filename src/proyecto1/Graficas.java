
package proyecto1;
import org.jfree.JCommon;
import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.*;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class Graficas {
    
    public Graficas(){
        
    }
    
    public JFreeChart GraficarPie(Cliente[] cliente){
        DefaultPieDataset pie_value = new DefaultPieDataset();
        double contador_M = 0;
        double contador_F = 0;
        double contador = 0;
        double F;
        double M;
        
        for (int i = 0; i < cliente.length; i++) {
            if(cliente[i] != null){
                
                if(cliente[i].getGenero().equals("F")){
                    contador_F++;
                    System.out.println(contador_F);
                }else{
                    contador_M++;
                }
                contador++;
            }
        }
        
        F = contador_F/contador;
        M = contador_M/contador;
        
        pie_value.setValue("Femenino",F*100);
        pie_value.setValue("Masculino", M*100);
        
        return ChartFactory.createPieChart("Genero de Clientes", pie_value,true,true,false);
    }
    
    
    
    
}