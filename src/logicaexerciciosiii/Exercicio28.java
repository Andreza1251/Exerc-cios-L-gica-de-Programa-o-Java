/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaexerciciosiii;


import java.util.Scanner;
//import javax.swing.JOptionPane;

public class LogicaExerciciosIII {


//Resolução do exercício 28
   
  public static void main(String[] args) {
      
      
        Scanner leitor = new Scanner(System.in);
         
  
       float salarioMinimo, novoSalario, reajuste, reajusteTotal, calc, salario;
       float folha = 0;
       float novaFolha = 0;
       String nome;
       int x;
       
       
       System.out.println("Digite o valor atual do salário mínimo: ");
       salarioMinimo = leitor.nextFloat();
       
       for(x = 0; x < 584; x++){
         System.out.println("Digite seu nome: ");
        nome = leitor.next();
          System.out.println("Digite seu salário: ");
        salario = leitor.nextFloat();
        
           calc = salarioMinimo * 3;
           
          if(salario < calc){
           reajuste = 0.50f; // Reajuste de 50%
              reajusteTotal = reajuste + (reajuste * salario); // Valor total de reajuste
            folha = folha + salario; // Folha de pagamento antiga  
            novoSalario = salario + (reajuste * salario);  // Salário reajustado
                novaFolha = novaFolha + novoSalario; // Nova folha de pagamento

                
         System.out.println(">>> Nome: " + nome);
        System.out.println(">>> Reajuste = 50%: " + reajuste*salario);
        System.out.println(">>> Novo salário: " + novoSalario);
        
          }else if( calc == salarioMinimo * 10){
             if(salario <= calc){
           reajuste = 0.20f; // Reajuste de 20%
            reajusteTotal = reajuste + (reajuste * salario); // Valor total de reajuste
            folha = folha + salario; // Folha de pagamento antiga
            novoSalario = salario + (reajuste * salario); // Salário reajustado
              novaFolha = novaFolha + novoSalario; // Nova folha de pagamento
              
                 System.out.println(">>> Nome: " + nome);
             System.out.println(">>> Reajuste = 20%: " + reajuste*salario);
             System.out.println(">>> Novo salário: " + novoSalario);
          }else if( calc == salarioMinimo * 20){
                reajuste = 0.15f; // Reajuste de 15%
                reajusteTotal = reajuste + (reajuste * salario); // Valor total de reajuste
                  folha = folha + salario; // Folha de pagamento antiga
                novoSalario = salario + (reajuste * salario); // Salário reajustado
                 novaFolha = novaFolha + novoSalario; // Nova folha de pagamento
          
                 
                     System.out.println(">>> Nome: " + nome);
                System.out.println(">>> Reajuste = 15%: " + reajuste*salario);
                System.out.println(">>> Novo salário: " + novoSalario);
          }else{
            reajuste = 0.10f; // Reajuste de 10%
            reajusteTotal = reajuste + (reajuste * salario); // Valor total de reajuste
            folha = folha + salario; // Folha de pagamento antiga
                novoSalario = salario + (reajuste * salario); // Salário reajustado
                novaFolha = novaFolha + novoSalario; // Nova folha de pagamento
                
                
              System.out.println(">>> Nome: " + nome);
              System.out.println(">>> Reajuste = 10%: " + reajuste*salario);
              System.out.println(">>> Novo salário: " + novoSalario);     
          }
          }   
       }
       
       
       System.out.println("");
       System.out.println("A empresa aumentou a folha de pagamento em:" + (novaFolha - folha) + " reais");
        
        
  }
   
 
  }
  

   
  
  
     
  
  
  
   
   
            
                            
            

    
     
  
    


