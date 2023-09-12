/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmo_481;

/**
 *
 * @author Marcelo
 */
public class Valores {
    public static int converte(int nnum, int nbase){
    int nb = 0;
        int r;
        int b = 0;
        
        while (nnum >= nbase) {
            r = nnum % nbase;
            nb = nb + (int) (Math.pow(10, b) * r);
            nnum = nnum / nbase;
            b++;
        }
        
        nb = nb + (int) (Math.pow(10, b) * nnum);
        
        return nb;
    }
}
