/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaexerciciosiii;


import java.util.Scanner;
//import javax.swing.JOptionPane;

public class LogicaExerciciosIII {


//Resolução do exercício 30
   
  public static void main(String[] args) {
      
      
        Scanner leitor = new Scanner(System.in);
        int numero1; 
        int numero2;
        int numero3;
  
      System.out.println("Digite o primeiro número");
         numero1 = leitor.nextInt();
       
       System.out.println("Digite o segundo número");
         numero2 = leitor.nextInt();
         
       System.out.println("Digite o terceiro número");
         numero3 = leitor.nextInt();   
  
        if(numero1 >= numero2 && numero2 >= numero3){
         System.out.println("Ordem crescente dos números " + numero1 + " " + numero2 + " " + numero3);
        }else if(numero1 >= numero3 && numero3 >= numero2){
          System.out.println("Ordem crescente dos números " + numero1 + " " + numero3 + " " + numero2);
        }else if(numero2 >= numero1 && numero1 >= numero3){
          System.out.println("Ordem crescente dos números " + numero2 + " " + numero1 + " " + numero3);
        }else if(numero2 >= numero3 && numero3 >= numero1){
          System.out.println("Ordem crescente dos números " + numero2 + " " + numero3 + " " + numero1);       
        }else if(numero3 >= numero1 && numero1 >= numero2){
           System.out.println("Ordem crescente dos números " + numero3 + " " + numero1 + " " + numero2);
        }else if(numero3 >= numero2 && numero2 >= numero1){
           System.out.println("Ordem crescente dos números " + numero3 + " " + numero2 + " " + numero1);
        }
        
  }
   
 
  }
  

   
  
  
     
  
  
  
   
   
            
                            
            

    
     
  
    


