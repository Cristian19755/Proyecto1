
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
    
    public JFreeChart GraficarPie(Carro[] Carro){
        DefaultPieDataset pie_value = new DefaultPieDataset();
        double contador_1 = 0;
        double contador_2 = 0;
        double contador_3 = 0;
        double contador_4 = 0;
        double contador_5 = 0;
        double contador_6 = 0;
        double contador_7 = 0;
        double contador_8 = 0;
        double contador_9 = 0;
        double contador_10 = 0;
        double contador_11 = 0;
        double contador_12 = 0;
        double contador_13 = 0;
        double contador_14 = 0;
        double contador_15 = 0;
        double contador_16 = 0;
        double contador_17 = 0;
        double contador_18 = 0;
        double contador_19 = 0;
        double contador_20 = 0;
        double contador_21 = 0;
        double contador_22 = 0;
        double contador_23 = 0;
        double contador_24 = 0;
        double contador_25 = 0;
        double contador_26 = 0;
        double contador_27 = 0;
        double contador_28 = 0;
        double contador_29 = 0;
        double contador_30 = 0;
        double contador_31 = 0;
        double contador_32 = 0;
        double contador_33 = 0;
        double contador_34 = 0;
        double contador_35 = 0;
        double contador_36 = 0;
        double contador_37 = 0;
        double contador_38 = 0;
        double contador_39 = 0;
        double contador_40 = 0;
        double contador_41 = 0;
        double contador_42 = 0;
        double contador_43 = 0;
        double contador_44 = 0;
        double contador_45 = 0;
        double contador_46 = 0;
        double contador_47 = 0;
        double contador_48 = 0;
        double contador_49 = 0;
        double contador_50 = 0;
        double contador = 0;
        double F;
        double M;
        
        for (int i = 0; i < Carro.length; i++) {
            if(Carro[i] != null){
                
                if(Carro[i].getFabricante().equals(Carro[1].getFabricante())){
                    contador_1++;
                    System.out.println(contador_1);
                }else if(Carro[i].getFabricante().equals(Carro[2].getFabricante())){
                    contador_2++;
                    System.out.println(contador_2);
                }else if(Carro[i].getFabricante().equals(Carro[3].getFabricante())){
                    contador_3++;
                    System.out.println(contador_3);
                }else if(Carro[i].getFabricante().equals(Carro[4].getFabricante())){
                    contador_4++;
                    System.out.println(contador_4);
                }else if(Carro[i].getFabricante().equals(Carro[5].getFabricante())){
                    contador_5++;
                    System.out.println(contador_5);
                }else if(Carro[i].getFabricante().equals(Carro[6].getFabricante())){
                    contador_6++;
                    System.out.println(contador_6);
                }else if(Carro[i].getFabricante().equals(Carro[7].getFabricante())){
                    contador_7++;
                    System.out.println(contador_7);
                }else if(Carro[i].getFabricante().equals(Carro[8].getFabricante())){
                    contador_8++;
                    System.out.println(contador_8);
                }else if(Carro[i].getFabricante().equals(Carro[9].getFabricante())){
                    contador_9++;
                    System.out.println(contador_9);
                }else if(Carro[i].getFabricante().equals(Carro[10].getFabricante())){
                    contador_10++;
                    System.out.println(contador_10);
                }else if(Carro[i].getFabricante().equals(Carro[11].getFabricante())){
                    contador_11++;
                    System.out.println(contador_11);
                }else if(Carro[i].getFabricante().equals(Carro[12].getFabricante())){
                    contador_12++;
                    System.out.println(contador_12);
                }else if(Carro[i].getFabricante().equals(Carro[13].getFabricante())){
                    contador_13++;
                    System.out.println(contador_13);
                }else if(Carro[i].getFabricante().equals(Carro[14].getFabricante())){
                    contador_14++;
                    System.out.println(contador_14);
                }else if(Carro[i].getFabricante().equals(Carro[15].getFabricante())){
                    contador_15++;
                    System.out.println(contador_15);
                }else if(Carro[i].getFabricante().equals(Carro[16].getFabricante())){
                    contador_16++;
                    System.out.println(contador_16);
                }else if(Carro[i].getFabricante().equals(Carro[17].getFabricante())){
                    contador_17++; 
                    System.out.println(contador_17);
                }else if(Carro[i].getFabricante().equals(Carro[18].getFabricante())){
                    contador_18++;
                    System.out.println(contador_18);
                }else if(Carro[i].getFabricante().equals(Carro[19].getFabricante())){
                    contador_19++;
                    System.out.println(contador_19);
                }else if(Carro[i].getFabricante().equals(Carro[20].getFabricante())){
                    contador_20++;
                    System.out.println(contador_20);
                }else if(Carro[i].getFabricante().equals(Carro[21].getFabricante())){
                    contador_21++;
                    System.out.println(contador_21);
                }else if(Carro[i].getFabricante().equals(Carro[22].getFabricante())){
                    contador_22++;
                    System.out.println(contador_22);
                }else if(Carro[i].getFabricante().equals(Carro[23].getFabricante())){
                    contador_23++;
                    System.out.println(contador_23);
                }else if(Carro[i].getFabricante().equals(Carro[24].getFabricante())){
                    contador_24++;
                    System.out.println(contador_24);
                }else if(Carro[i].getFabricante().equals(Carro[25].getFabricante())){
                    contador_25++;
                    System.out.println(contador_25);
                }else if(Carro[i].getFabricante().equals(Carro[26].getFabricante())){
                    contador_26++;
                    System.out.println(contador_26);
                }else if(Carro[i].getFabricante().equals(Carro[27].getFabricante())){
                    contador_27++;
                    System.out.println(contador_27);
                }else if(Carro[i].getFabricante().equals(Carro[28].getFabricante())){
                    contador_28++;
                    System.out.println(contador_28);
                }else if(Carro[i].getFabricante().equals(Carro[29].getFabricante())){
                    contador_29++;
                    System.out.println(contador_29);
                }else if(Carro[i].getFabricante().equals(Carro[30].getFabricante())){
                    contador_30++;
                    System.out.println(contador_30);
                }else if(Carro[i].getFabricante().equals(Carro[31].getFabricante())){
                    contador_31++;
                    System.out.println(contador_31);
                }else if(Carro[i].getFabricante().equals(Carro[32].getFabricante())){
                    contador_32++;
                    System.out.println(contador_32);
                }else if(Carro[i].getFabricante().equals(Carro[33].getFabricante())){
                    contador_33++;
                    System.out.println(contador_33);
                }else if(Carro[i].getFabricante().equals(Carro[34].getFabricante())){
                    contador_34++;
                    System.out.println(contador_34);
                }else if(Carro[i].getFabricante().equals(Carro[35].getFabricante())){
                    contador_35++;
                    System.out.println(contador_35);
                }else if(Carro[i].getFabricante().equals(Carro[36].getFabricante())){
                    contador_36++;
                    System.out.println(contador_36);
                }else if(Carro[i].getFabricante().equals(Carro[37].getFabricante())){
                    contador_37++;
                    System.out.println(contador_37);
                }else if(Carro[i].getFabricante().equals(Carro[38].getFabricante())){
                    contador_38++;
                    System.out.println(contador_38);
                }else if(Carro[i].getFabricante().equals(Carro[39].getFabricante())){
                    contador_39++;
                    System.out.println(contador_39);
                }else if(Carro[i].getFabricante().equals(Carro[40].getFabricante())){
                    contador_40++;
                    System.out.println(contador_40);
                }else if(Carro[i].getFabricante().equals(Carro[41].getFabricante())){
                    contador_41++;
                    System.out.println(contador_41);
                }else if(Carro[i].getFabricante().equals(Carro[42].getFabricante())){
                    contador_42++;
                    System.out.println(contador_42);
                }else if(Carro[i].getFabricante().equals(Carro[43].getFabricante())){
                    contador_43++;
                    System.out.println(contador_43);
                }else if(Carro[i].getFabricante().equals(Carro[44].getFabricante())){
                    contador_44++;
                    System.out.println(contador_44);
                }else if(Carro[i].getFabricante().equals(Carro[45].getFabricante())){
                    contador_45++;
                    System.out.println(contador_45);
                }else if(Carro[i].getFabricante().equals(Carro[46].getFabricante())){
                    contador_46++;
                    System.out.println(contador_46);
                }else if(Carro[i].getFabricante().equals(Carro[47].getFabricante())){
                    contador_47++;
                    System.out.println(contador_47);
                }else if(Carro[i].getFabricante().equals(Carro[48].getFabricante())){
                    contador_48++;
                    System.out.println(contador_48);
                }else if(Carro[i].getFabricante().equals(Carro[49].getFabricante())){
                    contador_49++;
                    System.out.println(contador_49);
                }else if(Carro[i].getFabricante().equals(Carro[50].getFabricante())){
                    contador_50++;
                    System.out.println(contador_50);
                }
                contador++;
            }
        }
        
        double c_1 = contador_1/contador;
        double c_2 = contador_2/contador;
        double c_3 = contador_3/contador;
        double c_4 = contador_4/contador;
        double c_5 = contador_5/contador;
        double c_6 = contador_6/contador;
        double c_7 = contador_7/contador;
        double c_8 = contador_8/contador;
        double c_9 = contador_9/contador;
        double c_10 = contador_10/contador;
        double c_11 = contador_11/contador;
        double c_12 = contador_12/contador;
        double c_13 = contador_13/contador;
        double c_14 = contador_14/contador;
        double c_15 = contador_15/contador;
        double c_16 = contador_16/contador;
        double c_17 = contador_17/contador;
        double c_18 = contador_18/contador;
        double c_19 = contador_19/contador;
        double c_20 = contador_20/contador;
        double c_21 = contador_21/contador;
        double c_22 = contador_22/contador;
        double c_23 = contador_23/contador;
        double c_24 = contador_24/contador;
        double c_25 = contador_25/contador;
        double c_26 = contador_26/contador;
        double c_27 = contador_27/contador;
        double c_28 = contador_28/contador;
        double c_29 = contador_29/contador;
        double c_30 = contador_30/contador;
        double c_31 = contador_31/contador;
        double c_32 = contador_32/contador;
        double c_33 = contador_33/contador;
        double c_34 = contador_34/contador;
        double c_35 = contador_35/contador;
        double c_36 = contador_36/contador;
        double c_37 = contador_37/contador;
        double c_38 = contador_38/contador;
        double c_39 = contador_39/contador;
        double c_40 = contador_40/contador;
        double c_41 = contador_41/contador;
        double c_42 = contador_42/contador;
        double c_43 = contador_43/contador;
        double c_44 = contador_44/contador;
        double c_45 = contador_45/contador;
        double c_46 = contador_46/contador;
        double c_47 = contador_47/contador;
        double c_48 = contador_48/contador;
        double c_49 = contador_49/contador;
        double c_50 = contador_50/contador;
        
        pie_value.setValue(Carro[1].getFabricante(),c_1*100);
        pie_value.setValue(Carro[2].getFabricante(), c_2*100);
        pie_value.setValue(Carro[3].getFabricante(),c_3*100);
        pie_value.setValue(Carro[4].getFabricante(), c_4*100);
        pie_value.setValue(Carro[5].getFabricante(),c_5*100);
        pie_value.setValue(Carro[6].getFabricante(), c_6*100);
        pie_value.setValue(Carro[7].getFabricante(),c_7*100);
        pie_value.setValue(Carro[8].getFabricante(), c_8*100);
        pie_value.setValue(Carro[9].getFabricante(),c_9*100);
        pie_value.setValue(Carro[10].getFabricante(), c_10*100);
        pie_value.setValue(Carro[11].getFabricante(),c_11*100);
        pie_value.setValue(Carro[12].getFabricante(), c_12*100);
        pie_value.setValue(Carro[13].getFabricante(),c_13*100);
        pie_value.setValue(Carro[14].getFabricante(), c_14*100);
        pie_value.setValue(Carro[15].getFabricante(),c_15*100);
        pie_value.setValue(Carro[16].getFabricante(), c_16*100);
        pie_value.setValue(Carro[17].getFabricante(),c_17*100);
        pie_value.setValue(Carro[18].getFabricante(), c_18*100);
        pie_value.setValue(Carro[19].getFabricante(),c_19*100);
        pie_value.setValue(Carro[20].getFabricante(), c_20*100);
        pie_value.setValue(Carro[21].getFabricante(),c_21*100);
        pie_value.setValue(Carro[22].getFabricante(), c_22*100);
        pie_value.setValue(Carro[23].getFabricante(),c_23*100);
        pie_value.setValue(Carro[24].getFabricante(), c_24*100);
        pie_value.setValue(Carro[25].getFabricante(),c_25*100);
        pie_value.setValue(Carro[26].getFabricante(), c_26*100);
        pie_value.setValue(Carro[27].getFabricante(),c_27*100);
        pie_value.setValue(Carro[28].getFabricante(), c_28*100);
        pie_value.setValue(Carro[29].getFabricante(),c_29*100);
        pie_value.setValue(Carro[30].getFabricante(), c_30*100);
        pie_value.setValue(Carro[31].getFabricante(),c_31*100);
        pie_value.setValue(Carro[32].getFabricante(), c_32*100);
        pie_value.setValue(Carro[33].getFabricante(),c_33*100);
        pie_value.setValue(Carro[34].getFabricante(), c_34*100);
        pie_value.setValue(Carro[35].getFabricante(),c_35*100);
        pie_value.setValue(Carro[36].getFabricante(), c_36*100);
        pie_value.setValue(Carro[37].getFabricante(),c_37*100);
        pie_value.setValue(Carro[38].getFabricante(), c_38*100);
        pie_value.setValue(Carro[39].getFabricante(),c_39*100);
        pie_value.setValue(Carro[40].getFabricante(), c_40*100);
        pie_value.setValue(Carro[41].getFabricante(),c_41*100);
        pie_value.setValue(Carro[42].getFabricante(), c_42*100);
        pie_value.setValue(Carro[43].getFabricante(),c_43*100);
        pie_value.setValue(Carro[44].getFabricante(), c_44*100);
        pie_value.setValue(Carro[45].getFabricante(),c_45*100);
        pie_value.setValue(Carro[46].getFabricante(), c_46*100);
        pie_value.setValue(Carro[47].getFabricante(),c_47*100);
        pie_value.setValue(Carro[48].getFabricante(), c_48*100);
        pie_value.setValue(Carro[49].getFabricante(),c_49*100);
        pie_value.setValue(Carro[50].getFabricante(), c_50*100);
        
        return ChartFactory.createPieChart("Fabricantes", pie_value,true,true,false);
    }
    
    
    
    
}