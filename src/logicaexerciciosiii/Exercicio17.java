/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaexerciciosiii;


import java.util.Scanner;


public class LogicaExerciciosIII {

//Resolução do exercício 17
   
  public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
         
       
      int numeros;
      int i;
      int  numerosIntervalo = 0; 
       
      
       for(i = 0; i<80; i++){
            System.out.println("Digite qual é o número");
       numeros = leitor.nextInt();
       if(numeros >= 10 && numeros <= 150){
           numerosIntervalo =  numerosIntervalo + 1;
       }
      }
       System.out.println("Há "  + numerosIntervalo + " números no intervalo entre 10 e 150");
  }
    
}
