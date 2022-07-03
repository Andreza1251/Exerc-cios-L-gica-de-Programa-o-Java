/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaexerciciosiii;


import java.util.Scanner;
//import javax.swing.JOptionPane;



public class LogicaExerciciosIII {


//Resolução do exercício 33
   
  public static void main(String[] args) {
      
      
        Scanner leitor = new Scanner(System.in);
        float nivel1 = 12.00f;
        float nivel2 = 17.00f;
        float nivel3 = 25.00f;
        int nivelProfessor;
        int hora;
        
        
        System.out.println("Digite qual é o seu nível: 1, 2 ou 3");
        nivelProfessor  = leitor.nextInt();
  
      System.out.println("Digite a quantidade de horas de aulas dadas");
         hora = leitor.nextInt();
       
      
       if( nivelProfessor == 1){
        System.out.println("Professor, seu pagamento será " + (hora * nivel1) + " por hora/aula dadas." );
       }else if( nivelProfessor == 2){
        System.out.println("Professor, seu pagamento será " + (hora * nivel2) + " por hora/aula dadas." );
       }else if(nivelProfessor == 3){
        System.out.println("Professor, seu pagamento será " + (hora * nivel3) + " por hora/aula dadas." );
       }
    
  }
   
 
  }
  

   
  
  
     
  
  
  
   
   
            
                            
            

    
     
  
    


