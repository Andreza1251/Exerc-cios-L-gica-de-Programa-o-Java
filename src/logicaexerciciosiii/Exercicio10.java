/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaexerciciosiii;


import java.util.Scanner;


public class LogicaExerciciosIII {

//Resolução do exercício 10
   
  public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
       
        
      
      float valorCompra;
      float valorPrestacao;
      
      
        System.out.println("Digite o valor da compra");
        valorCompra = leitor.nextFloat();
        
        valorPrestacao = valorCompra/5;
      
        
        System.out.println("O valor de cada prestação da compra é " + valorPrestacao);
       
       
       
       
  }
    
}
