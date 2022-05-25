/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaexerciciosiii;


import java.util.Scanner;


public class LogicaExerciciosIII {


//Resolução do exercício 23
   
  public static void main(String[] args) {
      
      
        Scanner leitor = new Scanner(System.in);
         
   
    int numero;
    int i = 1;
     
        
            
            
            while(i == 1){
                System.out.println("Digite qual é o número");
                numero = leitor.nextInt();
                
                
                if((numero > 80) || (numero < 25) || (numero == 40)){
                    System.out.println("O número digitado está nos requisitos.");
                }else{
                    System.out.println("O número digitado não está nos requisitos.");
                }
                
                System.out.println("Deseja continuar digitando números? 1 para Sim / 2 para Não");
                i = leitor.nextInt();
            }
         
            

      }
     
  }
    


