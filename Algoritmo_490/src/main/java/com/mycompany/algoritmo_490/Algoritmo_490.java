/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo_490;
    import javax.swing.JOptionPane;

/**
 *
 * @author Marcelo
 */
public class Algoritmo_490 {

    public static void main(String[] args) {
        
         int L;
      Valores res = new Valores();
      
         for(L = 0; L < 10; L++){
             
          res.nome[L]=  JOptionPane.showInputDialog("Digite palavras em letras minusculas "+(L+1)+ ":");
             
       res.restantes(res.nome,res.nome[L].length(), "c");
        }
         for(L = 0; L < 10; L++){
             System.out.println((L+1)+ "-"+res.nome[L]);
         }
    }
}
