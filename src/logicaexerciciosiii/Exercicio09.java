/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaexerciciosiii;


import java.util.Scanner;


public class LogicaExerciciosIII {

//Resolução do exercício 9
   
  public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
       
        
      
      float valorDepositado;
      float jurosFixos = 0.07f;
      float valorComJuros;
      
        System.out.println("Digite qual é o valor que será depositado");
        valorDepositado = leitor.nextFloat();
        
        valorComJuros = valorDepositado * jurosFixos;
        
        
        System.out.println("O valor final no mês com o rendimento de 0,07% a.m. é de R$" + (valorDepositado +  valorComJuros));
       
       
       
       
  }
    
}
