/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaexerciciosiii;


import java.util.Scanner;
//import javax.swing.JOptionPane;



public class LogicaExerciciosIII {


//Resolução do exercício 32
   
  public static void main(String[] args) {
      
      
        Scanner leitor = new Scanner(System.in);
        int valor1;
        int valor2;
        int valor3;
        
        System.out.println("Digite o valor 1");
         valor1 = leitor.nextInt();
  
      System.out.println("Digite o valor 2");
         valor2 = leitor.nextInt();
       
       System.out.println("Digite o valor 3");
         valor3 = leitor.nextInt();
         
       if(valor1 == valor2 && valor2 == valor3){
       System.out.println("Triângulo Equilátero");
       }else if((valor1 == valor2 && valor2 != valor3) ||(valor1 == valor3 && valor3 != valor2) || (valor2 == valor3 && valor3 != valor1)){
       System.out.println("Triângulo Isósceles");
       }else if(valor1 != valor2 && valor1 != valor3 && valor2 != valor3){
       System.out.println("Triângulo Escaleno");
       }
  
    
  }
   
 
  }
  

   
  
  
     
  
  
  
   
   
            
                            
            

    
     
  
    


