/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaexerciciosiii;


import java.util.Scanner;


public class LogicaExerciciosIII {

//Resolução do exercício 4
   
  public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
     
        
       String nomeVendedor;
       float salarioFixo;
       float totalVendas;
       float comissao;
       float salarioComComissao;
       
       System.out.println("Digite seu nome");
       nomeVendedor = leitor.nextLine();
       
       System.out.println("Digite seu salário fixo");
       salarioFixo = leitor.nextFloat();
       
       System.out.println("Digite seu total de vendas do mês em reais");
       totalVendas = leitor.nextFloat();
       
      //calculando qunto de comissão vai ganhar em cima das vendas 
       comissao =  totalVendas * 0.15f;
       
       //somando o valr do salário fixo mais o valor da comissão para saber o valor total do salário no final do mês
       salarioComComissao =  salarioFixo + comissao;
       
       System.out.println("Seu nome é " + nomeVendedor + ", seu salário fixo é " +  salarioFixo + " e seu salário no fim do mês é " + salarioComComissao);
       
  }
    
}
