/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaexerciciosiii;


import java.util.Scanner;


public class LogicaExerciciosIII {

//Resolução do exercício 13
   
  public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
         
       
        int numero;
      
      
        System.out.println("Digite qual é o número que deseja saber se é maior do que 10");
         numero = leitor.nextInt();
      
        
      if(numero > 10){
       System.out.println("O número " + numero + " é maior do que 10.");
      
      }
  }
    
}
