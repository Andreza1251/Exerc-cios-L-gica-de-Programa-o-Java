/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaexerciciosiii;


import java.util.Scanner;


public class LogicaExerciciosIII {

//Resolução do exercício 20
   
  public static void main(String[] args) {
      
      
        Scanner leitor = new Scanner(System.in);
         
       
     int anoFabricacao = 0;
     float valorVeiculo = 0.0f;
     float porcentagemDesconto = 0.0f;
     float valorDesconto = 0.0f;
     float valorPagar = 0.0f;
     int valorCarrosSemiNovos = 0;
     int totalCarros = 0;
     //criando a variável do tipo booleana para saber se o usuário vai querer continuar ou não
     char desejaRepetir = 's';
     
     // usar a estrutura while prque não sabe quantas vezes o usuáro vai querer repetir
     while(desejaRepetir == 's' || desejaRepetir == 'S' ){
         //entrada de dados
         System.out.println("Digite o ano de fabricação do veículo");
         anoFabricacao = leitor.nextInt();
         
           System.out.println("Digite o valor do veículo");
           valorVeiculo = leitor.nextFloat();
           
           if(anoFabricacao <= 2000){
               porcentagemDesconto = 0.12f; 
           }else{
               porcentagemDesconto = 0.07f;
               valorCarrosSemiNovos ++;
           }
        
          totalCarros++;
          
          valorDesconto = valorVeiculo * porcentagemDesconto;
          valorPagar = valorVeiculo - valorDesconto;
          
          System.out.println("O valor do desconto foi de: " + valorDesconto);
           System.out.println("O valor que deve ser pago é: " + valorPagar);
           
            System.out.println("Desejar realizar mais cadastros? S - Sim / N - Não ");
            desejaRepetir = leitor.next().charAt(0);
           
           
     }
     
       System.out.println("Total de carros semi novos: " +  valorCarrosSemiNovos);
        System.out.println("Total de carros: " + totalCarros);
       
      }
     
  }
    


