/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buscaminas;

import java.util.Random;

/**
 *
 * @author Estudiantes
 */
public class Sembrador {
    
    
    void sembrarCorazon(Celda lasCeldas[][], int cantidad ){
        //for each(reocrriendo solo fila si fuera unidimensional el arreglo)
        for(Celda[] laFila:lasCeldas){
            //de fila rescata celda
            for(Celda laCelda:laFila){
                //rescata la  celda de la fila para que ponga un corazon
                Corazon unCorazon=new Corazon();
                
                Random r= new Random();
                int cualquierMina=r.nextInt(10)+1; 
                laCelda.setMiCorazon(unCorazon);
            }
        }
            
            
        
        
    }

  