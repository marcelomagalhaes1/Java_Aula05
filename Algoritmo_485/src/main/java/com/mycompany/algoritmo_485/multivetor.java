/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmo_485;

/**
 *
 * @author Marcelo
 */
public class multivetor {

    int num[]=new int[6];
    String num1[]=new String[6];
    
    public static void multivetor(int vet1[], String vet2[], int tam){
     
        int i,w;
        for(i = 0; i < tam; i++){
        
        System.out.println();
        
        for(w = 0; w < vet1[i]; w++){
            System.out.print(vet2[i]);
            }
        }
    } 
}
