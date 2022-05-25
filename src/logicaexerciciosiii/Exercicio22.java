/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaexerciciosiii;


import java.util.Scanner;


public class LogicaExerciciosIII {

//esse exercício ainda não tenho certeza se tudo está correto
//Resolução do exercício 22
   
  public static void main(String[] args) {
      
      
        Scanner leitor = new Scanner(System.in);
         
    float precoCusto;
    float precoVenda;
    //float mediaPrecoCusto;
    //float mediaPrecoVenda;
    int i;
  
     
            
            for(i = 0; i < 40; i ++){
                System.out.println("Digite o preço de custo do produto");
                precoCusto = leitor.nextFloat();
                
                System.out.println("Digite o preço de venda do produto");
                precoVenda = leitor.nextFloat();
                
                
                if(precoCusto <  precoVenda){
                    System.out.println("Teve lucro");
                }else if(precoCusto >  precoVenda){
                     System.out.println("Teve prejuízo");
                }else if(precoCusto == precoVenda){
                     System.out.println("Teve empate");
                }
                
             
            

             
            }
            

      }
     
  }
    


