/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmo_493;

/**
 *
 * @author Marcelo
 */
public class Valores {
    
    int num[]=new int[10];
    
    public static int busca(int vet[],int tam){
        
        int i, x, L;
        for(i = 0; i < tam - 1; i++){
            
            if(vet[i] < vet[i+1]){
                x = 0;
                return(x);
         }  
        }
        x = 1;
          return(x);
    }
    
     public static int busca1(int vet[],int tam){
         
         int i, x, L;
        for(i = 0; i < tam - 1; i++){
            
            if(vet[i] > vet[i+1]){
                x = 0;
                return(x);
        }
        }
            x = 1;
            return(x);
     }
    
      public static int verificaordem(int vetor[],int t){
          
          int r, res, L;
          
          r = busca(vetor,t);
          
          if(r == 1){
              res = 2;
              return(res);
          }
          else {
              r=busca1(vetor,t);
           
              if(r == 1){
                  res = 1;
                  return(res);  
              }
              else {
                  res = 0;
                  return(res);
              }
          }
      }
}
