/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaexerciciosiii;


import java.util.Scanner;


public class LogicaExerciciosIII {


//Resolução do exercício 26
   
  public static void main(String[] args) {
      
      
        Scanner leitor = new Scanner(System.in);
         
   
    int numero;
    
     
        
            
            
           
                System.out.println("Digite um número de 1 a 5");
                numero = leitor.nextInt();
                
                switch(numero){
                    case 1 : System.out.println("um");break;
                    case 2 : System.out.println("dois");break;
                    case 3 : System.out.println("três");break;
                    case 4 : System.out.println("quatro");break;
                    case 5 : System.out.println("cinco");break;
                    default: System.out.println("número inválido");
                
                }
                
                
            

      }
     
  }
    


