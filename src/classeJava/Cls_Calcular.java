/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeJava;

/**
 *
 * @author geoguitar
 */
public class Cls_Calcular {
    
    private float valorCelular;
    
    public float calculoValor(String marca,boolean tV,boolean radio){
    
        switch (marca){
        
            case"Samsung":{
                if(radio && tV){
                    valorCelular = 900;
                }else if (radio){
                    valorCelular = 600;
                
                }
            }
            break;
            
             case"LG":{
                if(radio && tV){
                    valorCelular = 500;
                }else if(radio){
                    valorCelular = 400;
                }
            }
            break;
            
             case"Moto":{
                if(radio && tV){
                    valorCelular = 800;
                }else if(radio){
                    valorCelular = 500;
                }
            }
            break;
            
        }
                
         return valorCelular;
           
   }
}
