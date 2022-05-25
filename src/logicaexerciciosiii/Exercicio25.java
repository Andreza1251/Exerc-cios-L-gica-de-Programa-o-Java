/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaexerciciosiii;


import java.util.Scanner;


public class LogicaExerciciosIII {


//Resolução do exercício 25
   
  public static void main(String[] args) {
      
      
        Scanner leitor = new Scanner(System.in);
         
   
    int primeiroNumero;
    int segundoNumero;
     
        
            
            
           
                System.out.println("Digite qual é o primeiro número");
                primeiroNumero = leitor.nextInt();
                
                 System.out.println("Digite qual é o segundo número");
                segundoNumero = leitor.nextInt();
                
           
                if(primeiroNumero == segundoNumero){
                System.out.println("O primeiro e o segundo número são iguais");
                }else if(primeiroNumero > segundoNumero){
                System.out.println("Os números são diferentes e o número " + primeiroNumero + " é maior do que o " + segundoNumero);
                }else{
                 System.out.println("Os números são diferentes e o número " + segundoNumero + " é maior do que o " + primeiroNumero);
                }
               
            

      }
     
  }
    


