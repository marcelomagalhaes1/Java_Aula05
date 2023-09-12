/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo_487;
    import javax.swing.JOptionPane;

/**
 *
 * @author Marcelo
 */
public class Algoritmo_487 {

    public static void main(String[] args) {
        int L, n;
       Valores iv = new Valores();
       
       for(L = 0; L < 10; L++){
        iv.num[L]=Integer.parseInt( JOptionPane.showInputDialog("Digite numero "+ (L+1)+": "));
       }
        int inverte = Valores.inverte(iv.num,10);
       
        System.out.println("VETOR");
        for(L = 0; L < 10; L++){
            System.out.println((L+1)+ "- " + iv.num[L]);
        }
    }
}
