/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmo_494;

/**
 *
 * @author Marcelo
 */
public class Valores {
    
    String nome[] = new String[3];
String prof[] = new String[3];
String ender[] = new String[3];


public static String troca(String n1, String n2){
    
        String aux;
        aux=n1;
        n1 = n2;
        n2 = aux;
        return aux;
    }
}
