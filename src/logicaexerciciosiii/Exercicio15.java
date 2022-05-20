/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaexerciciosiii;


import java.util.Scanner;


public class LogicaExerciciosIII {

//Resolução do exercício 15
   
  public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
         
       
        int numero1;
     
      
      
        System.out.println("Digite qual é o número");
         numero1 = leitor.nextInt();
         

      
        
      if(numero1 > 100 && numero1 < 200){
       System.out.println("O número " + numero1 + " está no intervalo entre 100 e 200" );
      }else{
          System.out.println("O número " + numero1 + " não está no intervalo entre 100 e 200");
      }
  }
    
}
