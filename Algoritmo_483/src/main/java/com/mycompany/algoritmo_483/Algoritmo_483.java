/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo_483;
    import javax.swing.JOptionPane;
/**
 *
 * @author Marcelo
 */
public class Algoritmo_483 {

    public static void main(String[] args) {
        
        int L, c, aux;
        Valores pi = new Valores();
        
        for(L = 0; L < 4; L++){
          pi.num[L]= Integer.parseInt( JOptionPane.showInputDialog("Digite 1 numero "+ (L+1)+":"));
      }
        
      for(L = 0; L < 4; L++){
          pi.num1[L]= Integer.parseInt( JOptionPane.showInputDialog("Digite 2 numero "+ (L+1)+":"));
      }
      
          c= pi.produtointerno(pi.num,pi.num1,4);
          System.out.println("Vetor A \t Vetor B");
          
          for(L = 0; L < 4; L++){
              System.out.println(pi.num[L]+"\t\t"+pi.num1[L]);
          }
          System.out.println("Produto interno"+c);
    }
}
