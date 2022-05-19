/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaexerciciosiii;


import java.util.Scanner;
import java.text.DecimalFormat;

public class LogicaExerciciosIII {

//Resolução do exercício 11
   
  public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
         DecimalFormat formatador = new DecimalFormat("0.00");
       
        
      
      float precoCusto;
      float valorDeVenda;
      float percentual;
      
      
        System.out.println("Digite o valor do preço de custo do produto");
        precoCusto = leitor.nextFloat();
      
        
        System.out.println("Informe o percentual que será acrescentado ao preço de custo");
        percentual = leitor.nextFloat();
        
        
       valorDeVenda =  precoCusto * percentual;
       
       System.out.println("O preço de venda do produto será " + formatador.format(valorDeVenda));
       
       
       
  }
    
}
