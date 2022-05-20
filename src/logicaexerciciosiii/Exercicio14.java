/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaexerciciosiii;


import java.util.Scanner;


public class LogicaExerciciosIII {

//Resolução do exercício 14
   
  public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
         
       
        int numero1;
        int numero2;
      
      
        System.out.println("Digite qual é o primeiro número");
         numero1 = leitor.nextInt();
         
         System.out.println("Digite qual é o segundo número");
         numero2 = leitor.nextInt(); 
      
        
      if(numero1 > numero2){
       System.out.println("O primeiro número que é " + numero1 + " é maior que o segundo número que é " + numero2 );
      }else{
          System.out.println("O segundo número que é " + numero2 + " é maior que o primeiro número que é " + numero1);
      }
  }
    
}
