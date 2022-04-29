/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaexerciciosiii;


import java.util.Scanner;

public class LogicaExerciciosIII {

//Resolução do exercício 1
   
  public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int primeiroNumero;
        int segundoNumero;
        
        System.out.println("Digite os números a serem calculados");
        primeiroNumero = leitor.nextInt();
        segundoNumero = leitor.nextInt();
        
        System.out.println(primeiroNumero + segundoNumero);
        
    }
    
}
