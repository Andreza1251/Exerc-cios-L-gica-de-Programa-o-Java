/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaexerciciosiii;


import java.util.Scanner;


public class LogicaExerciciosIII {

//Resolução do exercício 18
   
  public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
         
       
     
      int idade;
      int i;
       
      
       for(i = 0; i<75; i++){
            System.out.println("Digite qual é a sua idade");
       idade = leitor.nextInt();
       if(idade >= 18){
           System.out.println("Maior de idade");
       }else{
           System.out.println("Menor de idade");
               }
       }
      }
     
  }
    


