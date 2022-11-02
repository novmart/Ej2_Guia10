/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2_guia10;

import Entidades.Electros;
import Entidades.Lavadora;
import Entidades.Tele;
import java.util.ArrayList;

/**
 *
 * @author novel
 */
public class Ej2_guia10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Lavadora lv = new Lavadora();
//        Tele tv = new Tele();
//        lv.crearLavadora();
//        lv.precioFinal();
//        tv.crearTele();
//        tv.precioFinal();
//        
//        System.out.println(lv);
//        System.out.println(tv.getConsumo());

   ArrayList<Electros> elec = new ArrayList(); 
  
   Electros l1 = new Entidades.Lavadora(45, 1000.0, 30, "Rojo", 'A');
   Electros t1 = new Entidades.Tele(45, true , 1000.0, 50 ,"Negro", 'D');
           
 Electros l2 = new Entidades.Lavadora(45, 1100.0, 50, "Rojo", 'D');
   Electros t2 = new Entidades.Tele(46, false , 1200.0, 60 ,"Negro", 'D');
        
   elec.add(l1);
   elec.add(t1); 
   elec.add(l2); 
   elec.add(t2); 
   
        for (Electros electros : elec) {
            electros.precioFinal();

        }
     
        double acuL = 0; 
        double acuT = 0; 
        double acu = 0; 
        
        for (Electros electros : elec) {
            if(electros instanceof Lavadora){
                acuL += ((Lavadora) electros).getPrecio(); 
            }else{
                acuT += electros.getPrecio(); 
            }
            acu+=electros.getPrecio(); 
        }
 
        System.out.println("El valor de los televisore es " + acuT);
        System.out.println("El valor de las lavadoras es " + acuL);
        System.out.println("El valor de los electrodomesticos es " + acu);

        
    }

}
