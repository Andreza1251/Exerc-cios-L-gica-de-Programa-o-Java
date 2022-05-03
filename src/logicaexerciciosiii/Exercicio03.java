/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaexerciciosiii;


import java.util.Scanner;
import java.text.DecimalFormat;

public class LogicaExerciciosIII {

//Resolução do exercício 3
   
  public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("0.00");
        
       double distanciaTotal;
       double combustivelGasto;
       double totalCombustivel;
       
       
       System.out.println("Digite a distância total que o automóvel percorreu");
        distanciaTotal = leitor.nextDouble();
        
       System.out.println("Digite o total de combustível gasto pelo automóvel"); 
        combustivelGasto = leitor.nextDouble();
        
       totalCombustivel = distanciaTotal / combustivelGasto ;
      
        
      System.out.print("O consumo médio de combustível que o automóvel usou é " + formatador.format(totalCombustivel));
      
    }
    
}
