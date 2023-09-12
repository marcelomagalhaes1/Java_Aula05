/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo_494;
    import javax.swing.JOptionPane;

/**
 *
 * @author Marcelo
 */
public class Algoritmo_494 {

    public static void main(String[] args) {
        
         int L, c, t, tl;
        Valores tr = new Valores();
        
        for(L = 0; L < 3; L++){
            
            tr.nome[L]=JOptionPane.showInputDialog("Digite o nome");
            tr.ender[L]=JOptionPane.showInputDialog("Digite o endereco");
            tr.prof[L]=JOptionPane.showInputDialog("Digite a profissao");
        }
          for(L = 0; L < 2; L++){
              
              for(c=(L + 1);c < 3; c++){
                  if (tr.nome[L].compareTo(tr.nome[c]) > 0){
                      
                      Valores.troca(tr.nome[L],tr.nome[c]);
                      tr.troca(tr.ender[L],tr.ender[c]);
                      tr.troca(tr.prof[L], tr.prof[c]);
                      
                  }
              }
          }
           for(L = 0; L < 3; L++){
               System.out.println(tr.nome[L]+"\t"+tr.ender[L]+"\t"+tr.prof[L]);
           }
    }
}
