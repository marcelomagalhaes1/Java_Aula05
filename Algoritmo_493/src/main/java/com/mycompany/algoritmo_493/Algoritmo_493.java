/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo_493;
    import javax.swing.JOptionPane;

/**
 *
 * @author Marcelo
 */
public class Algoritmo_493 {

    public static void main(String[] args) {
        
        int L,c,aux;
        
        Valores ord = new Valores();
        
        for (L=0; L<10; L++){
            
            ord.num[L]=Integer.parseInt( JOptionPane.showInputDialog("Digite numero "+(L+1)+ ": "));
        }
        c= ord.verificaordem(ord.num,10);
        
        if (c == 1) {
            System.out.println("\nORDENACAO CRESCENTE");
        } 
        
        else if (c == 2) {
            System.out.println("\nORDENACAO DECRESCENTE");
        }
        
        else {
            System.out.println("\nNAO ESTA ORDENADO");
        }
    }
}
