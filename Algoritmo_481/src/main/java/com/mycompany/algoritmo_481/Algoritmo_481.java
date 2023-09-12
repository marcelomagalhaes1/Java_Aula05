/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo_481;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcelo
 */
public class Algoritmo_481 {

    public static void main(String[] args) {
        
        int num, base, c;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite algum numero maior ou igual a 0"));
        
        while(num < 0){
            num = Integer.parseInt(JOptionPane.showInputDialog("Numero negativo. Digite algum numero maior ou igual que 0"));
        }
        
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base em deseja representa-lo (2-10)"));
        
        while(base<2||base>10){
            base = Integer.parseInt(JOptionPane.showInputDialog("Não sei converter. Digite a base em deseja representa-lo (2-10)"));
        }
        
        c = Valores.converte(num, base);
        System.out.println("Número em decimal: " +num+ "\nNúmero na base " +base+":" +c);
    }
}
