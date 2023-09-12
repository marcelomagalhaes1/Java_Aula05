/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo_497;
    import javax.swing.JOptionPane;

/**
 *
 * @author Marcelo
 */
public class Algoritmo_497 {

    public static void main(String[] args) {
            
        int L, c, n, aux;
        Valores bin = new Valores();

        for (L = 0; L < 10; L++) {
            bin.num[L] = Integer.parseInt(JOptionPane.showInputDialog("Digite numero " + (L + 1) + ":"));
        }

        n = Integer.parseInt(JOptionPane.showInputDialog("Digite numero de busca"));

        bin.ordena(bin.num, 10);
        c = bin.busca(bin.num, 10, n);

        System.out.println("\nVETOR");
        for (L = 0; L < 10; L++) {
            System.out.println((L + 1) + "-" + bin.num[L]);
        }
        
        c++;

        if (c!= 0) {
            System.out.println("posicao do vetor: " + c);
        }
        
        else {
            System.out.println("nao encontrado");
        }
    }
}
