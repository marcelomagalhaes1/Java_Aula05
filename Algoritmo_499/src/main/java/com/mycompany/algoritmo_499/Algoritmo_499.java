/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo_499;
    import javax.swing.JOptionPane;

/**
 *
 * @author Marcelo
 */
public class Algoritmo_499 {

    public static void main(String[] args) {
        
        int L, flag, op;
        flag = 0;
        int[] num = new int[5];
        
        for(L=0; L<5; L++){
            num[L] = 0;
        }
        
        do{
            System.out.println("\n\n\nMENU VETOR - FUNCAO\n");
            System.out.println("1 - Dados do VETOR");
            System.out.println("2 - Ordena VETOR");
            System.out.println("3 - Imprime VETOR");
            System.out.println("4 - Sai do programa\n");
            op = Integer.parseInt(JOptionPane.showInputDialog("OPCAO: "));
            
            switch (op){
            case 1: entrada(num, 5);
                    flag = 1;
                    break;
                    
            case 2: if(flag == 1){
                        ordena(num, 5);
                        System.out.println("Ordenado.");
                    }else{
                        System.out.println("Escolha primeiro opcao 1.");
                    }
                    break;
                    
            case 3: if(flag == 1){
                        imprime(num, 5);
                    }else{
                        System.out.println("Escolha primeiro opcao 1.");
                    }
                    break;
                
            case 4: System.out.println("Saindo do Algoritmo.");
                    break;
            
            default: System.out.println("Opcao invalida.");
                     break;
            }
        }
        while(op != 4);
    }
    
    public static void entrada(int vet[], int t){
        int L;
        
        System.out.println("Entrada do VETOR");
        for(L = 0; L < t ; L++){
            vet[L] = Integer.parseInt(JOptionPane.showInputDialog("Digite numero "+(L+1)+" : "));
        }
    }
    
    public static void imprime(int vet[], int t){
        int L;
        
        System.out.println("\nVETOR");
        for(L = 0; L < t; L++){
            System.out.println((L+1) +" - "+ vet[L]);
        }
    }
    
    public static void ordena(int vet[], int tam){
        int L1, c1, aux;
        
        for(L1 = 0; L1 < tam -1; L1++){
            for(c1 = L1+1; c1<tam; c1++){
                if(vet[L1] > vet[c1]){
                    aux = vet[L1];
                    vet[L1] = vet[c1];
                    vet[c1] = aux;
                }
            }
        }
    }
}
