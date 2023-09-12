/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmo_490;

/**
 *
 * @author Marcelo
 */
public class Valores {
    
    String nome[] =new String[10];
    
 public static int restantes(String vet[], int tam, String x){
     
     int i,cont;
     cont=0;
     
     for(i = 0; i < tam; i++){
         
          if (vet[i] != null) {
            vet[i] = vet[i].replace(x, "*");
                cont++;
         }
        
     }
      return (cont);
    }
}
