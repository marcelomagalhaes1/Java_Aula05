/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo_485;
    import javax.swing.JOptionPane;

/**
 *
 * @author Marcelo
 */
public class Algoritmo_485 {

    public static void main(String[] args) {
        int L,c;
       
       multivetor mv = new multivetor();
       
       for(L = 0; L < 6; L++){
           
        mv.num[L]=Integer.parseInt(JOptionPane.showInputDialog("Digite numero "+(L+1)+ ":"));
       
       }
        for(L = 0; L < 6; L++){
             mv.num1[L]=(JOptionPane.showInputDialog("Digite caractere "+(L+1)+ ":"));
             
        }
          mv.multivetor(mv.num, mv.num1, 6);
    
    }
}
