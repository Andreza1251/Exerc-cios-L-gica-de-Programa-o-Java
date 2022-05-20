/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaexerciciosiii;


import java.util.Scanner;


public class LogicaExerciciosIII {

//Resolução do exercício 16
   
  public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
         
       
       String nome;
       float nota1;
       float nota2;
       float nota3;
       float mediaAluno;
       
       
       System.out.println("Digite qual é o seu nome");
       nome = leitor.nextLine();
       
       System.out.println("Digite a sua primeira nota");
       nota1 = leitor.nextFloat();
       
       System.out.println("Digite a sua segunda nota");
       nota2 = leitor.nextFloat();
       
       System.out.println("Digite a sua terceira nota");
       nota3 = leitor.nextFloat();
       
       mediaAluno = (nota1 + nota2 + nota3) / 3;
      
       if(mediaAluno >= 7){
           System.out.println(nome + " você está Aprovado(a)");
       }else if(mediaAluno <= 5){
           System.out.println(nome + " você está Reprovado(a)");
       }else if(mediaAluno >= 5.1f && mediaAluno <= 6.9f){
           System.out.println(nome + " você está de Recuperação");
       }
       
  }
    
}
