/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaexerciciosiii;


import java.util.Scanner;


public class LogicaExerciciosIII {

//Resolução do exercício 12
   
  public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
         
       
        
      
      float custoDeFabrica;
      float custoDeFabricaImpostos;
      float percentualDistribuidor = 0.28f;
      float custoDeFabricaDistribuidor;
      float impostosAplicados = 0.45f;
      float valorCarroNovo;
      
      
        System.out.println("Digite qual foi o custo de fábrica do carro");
         custoDeFabrica = leitor.nextFloat();
      
         //calculando o percentual de impostos sobre o custo de fabricação
        custoDeFabricaImpostos = custoDeFabrica * impostosAplicados;
        
        //calculando o valor do custo de fábrica mais os impostos
        custoDeFabrica = custoDeFabrica + custoDeFabricaImpostos;
        
        //calculando o valor do percentual do distribuidor sobre o custo de fábrica
        custoDeFabricaDistribuidor = custoDeFabrica * percentualDistribuidor ;
        
        //calculando o valor do custo de fábrica que já estava com os impostos aplicados mais o percentual do distribuidor para descobrir o valor de venda do carro
        valorCarroNovo = custoDeFabrica + custoDeFabricaDistribuidor;
        
        
        System.out.println("O custo do carro será " + valorCarroNovo);
        
      
  }
    
}
