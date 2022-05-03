/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaexerciciosiii;


import java.util.Scanner;

public class LogicaExerciciosIII {

//Resolução do exercício 2
   
  public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int primeiroNumero;
        int segundoNumero;
        
        System.out.println("Digite os números a serem calculados");
        primeiroNumero = leitor.nextInt();
        segundoNumero = leitor.nextInt();
        
        //aqui está mostrando a soma dos dois números lidos
        System.out.println("Essa é a soma dos números " + (primeiroNumero + segundoNumero));
        
        //aqui está mostrando a subtração dos dois números lidos
         System.out.println("Essa é a subtração dos números " + (primeiroNumero - segundoNumero));
         
         //aqui está mostrando a multiplicação dos dois números lidos
          System.out.println("Essa é a multiplicação dos números " + (primeiroNumero * segundoNumero));
          
          //aqui está mostrando a divisão dos dois números lidos
           System.out.println("Essa é a divisão dos números " + (primeiroNumero / segundoNumero));
        
        
    }
    
}
