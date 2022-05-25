/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaexerciciosiii;


import java.util.Scanner;


public class LogicaExerciciosIII {


//Resolução do exercício 27
   
  public static void main(String[] args) {
      
      
        Scanner leitor = new Scanner(System.in);
         
   
   float valorVeiculo = 0.01f;
   float desconto = 0.00f;
   float valorPago = 0.01f;
   int combustível;
   float i = 0.01f;
    
     
   while(valorVeiculo != 0.00f){ 
   System.out.println("Digite o valor do veículo");
   valorVeiculo = leitor.nextFloat();
   
   if(valorVeiculo != 0.00f){
       
          System.out.println("Digite tipo de combustível do veículo: 1 - álcool / 2 - gasolina / 3 - diesel");
   combustível = leitor.nextInt();
   
   if(combustível == 1){
   desconto = valorVeiculo * 0.25f;
    valorPago = valorVeiculo - desconto;
   }else if(combustível == 2){
    desconto = valorVeiculo * 0.21f;
    valorPago = valorVeiculo - desconto;
   }else if(combustível == 3){
    desconto = valorVeiculo * 0.14f;
    valorPago = valorVeiculo - desconto;
   }else{
   System.out.println("Opção não válida");
   }
   
    System.out.println("O valor do desconto é " + desconto + " e o valor a ser pago pelo veículo é " + valorPago);
    
   }
      
   }
  }
   
   
            
                            
            

      }
     
  
    


