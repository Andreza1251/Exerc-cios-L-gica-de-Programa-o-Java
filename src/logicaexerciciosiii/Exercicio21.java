/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaexerciciosiii;


import java.util.Scanner;


public class LogicaExerciciosIII {

//Resolução do exercício 21
   
  public static void main(String[] args) {
      
      
        Scanner leitor = new Scanner(System.in);
         
       
    String nome;
    int idade;
    char sexo;
    char saude;
    int numeroMilitares = 0;
    //boolean quaseMilitar;
    char desejaContinuar = 's';
   
    
    while(desejaContinuar == 's' || desejaContinuar == 'S'){
      
        System.out.println("Digite qual é o seu nome");
        nome = leitor.next();
        
        System.out.println("Digite qual é sua idade");
        idade = leitor.nextInt();
        
        System.out.println("Digite quale seú sexo: F - feminino / M - masculino");
        sexo = leitor.next().charAt(0);
        
        System.out.println("Digite se você possui algum problema de saúde: S - Sim / N - Não");
         saude = leitor.next().charAt(0);
         
         
         if((idade >= 18) && (sexo == 'm' || sexo == 'M') && (saude == 'n' || saude == 'N')){
            System.out.println(nome + " você está apto para ser um militar"); 
            numeroMilitares++;
         }else{
             System.out.println(nome + " infelizmente você não está apto para ser militar");
         }
         
         System.out.println("Deseja continuar? S - sim / N - Não");
         desejaContinuar = leitor.next().charAt(0);
    }
    
        System.out.println("O número de pessoas aptas para cumprir o serviço militar obrigatório é " + numeroMilitares);
      }
     
  }
    


