/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaexerciciosiii;


import java.util.Scanner;


public class LogicaExerciciosIII {

//Resolução do exercício 8
   
  public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
       
        
      
      float cotacaoDolar;
      float quantidadeDolares;
      
        System.out.println("Digite qual é a cotação do dólar em relação ao real atualmente");
        cotacaoDolar = leitor.nextFloat();
        
        
        System.out.println("Qual valor você possui em dólares?");
       quantidadeDolares = leitor.nextFloat();
       
       
        System.out.println("O valor que você possui em dólares em reais é R$" + (quantidadeDolares*cotacaoDolar));
       
       
  }
    
}
