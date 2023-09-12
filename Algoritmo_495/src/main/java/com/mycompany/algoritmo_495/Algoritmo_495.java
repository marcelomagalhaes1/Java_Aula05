/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo_495;
    import javax.swing.JOptionPane;

/**
 *
 * @author Marcelo
 */
public class Algoritmo_495 {

    public static void main(String[] args) {
        
         Valores ord = new Valores();
        int L, c, t, tl;

        for (L = 0; L < 5; L++) {
            ord.nome[L][0] = JOptionPane.showInputDialog("Digite nome");
        }

        ord.ordena(ord.nome, 5);
        System.out.println("NOMES ORDENADOS");

        for (L = 0; L < 5; L++) {
            System.out.println((L + 1) + "-" + ord.nome[L][0]);
        }
    }
}
