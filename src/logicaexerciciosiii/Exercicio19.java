/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaexerciciosiii;


import java.util.Scanner;


public class LogicaExerciciosIII {

//Resolução do exercício 19
   
  public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
         
       
     
      String nome;
      String sexo;
      int i;
      int mulher = 0;
      int homem = 0;
      
       for(i = 0; i<56; i++){
            System.out.println("Digite qual é o seu nome");
       nome = leitor.nextLine();
       
           System.out.println("Digite qual é o seu sexo: M se for masculino e F se for feminino");
       sexo = leitor.nextLine();
       
       switch(sexo){
           case "F":
           case "f":System.out.println(nome + " você é mulher.");mulher = mulher + 1;break;
           case "M":
           case "m":System.out.println(nome + " você é homem.");homem = homem + 1;break;
           default: System.out.println("Essa resposta não é válida");
           
       }
       
       
       }
       System.out.println("Há " + mulher + " mulheres e " + homem + " homens");
      }
     
  }
    


