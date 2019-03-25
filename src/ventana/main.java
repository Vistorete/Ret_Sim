/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

/**
 *
 * @author esteban
 */
public class main {

    static AFP mainAFP;
    public static int edadJ;
    public static int edadT;
    static int SueldoA;
    static int FondosA;
    static int Final;
    static int CP;
    static double Deseado;
    static int APV;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Slide1 S1=new Slide1();
        S1.setTitle("Slide1");
        S1.setVisible(true);
        
    }
   
    public static void isMain(){
        System.out.println(mainAFP.Info());
    }
    
    public static Double Fondo_Futuro(){
        double n;
        n=edadJ-edadT;
        double VF1;
        double VF2;
        VF1=(SueldoA*0.1*12)*(Math.pow(1+mainAFP.getRenta(), n)-1)/(mainAFP.getRenta());
        VF2=FondosA*(Math.pow(1+mainAFP.getRenta(), n));
        return VF1+VF2;
    }
    public static Double APV(){
        double result;
        double n;
        n=edadJ-edadT;
        
        if (Deseado*CP - Fondo_Futuro()<0){
            return ((Deseado*CP) - Fondo_Futuro());
        }
        result=mainAFP.getRenta()*((Deseado*CP)-Fondo_Futuro())/(12*(Math.pow(1+mainAFP.getRenta(), n)-1));
        return result;
    }

}
