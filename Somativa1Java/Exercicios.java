package Somativa1Java;

import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);
   
    public void exercicio1() {

System.out.println("Digite o valor 1");
Double valor1 = sc.nextDouble();
System.out.println("Digite o valor 2");
Double valor2 = sc.nextDouble();
System.out.println("Escolha sua operação aritimética");
System.out.println("1 = Adição");
System.out.println("2 = Subtração");
System.out.println("3 = Multiplicação");
System.out.println("4 = Divisão");
int escolha = sc.nextInt();
double resultado = 0;
switch(escolha){
    case 1: resultado = valor1 + valor2;
    break;
    case 2: resultado = valor1 - valor2;
    break;
    case 3: resultado = valor1 * valor2;
    break;
    case 4: resultado = valor1/valor2;
    break;

    default: System.out.println("Operação invalida");
}
System.out.println("O resultado é " +resultado);



        
    }

    public void exercicio2() {
        System.out.println("Digite o número da sua matricula");
        int matricula = sc.nextInt();
        int resultado = matricula % 4;
        if(resultado == 0 ){
            System.out.println("Você está no time do Cris");

        }else if(resultado  == 1){
            System.out.println("Você está no time do Greg");
        }else if(resultado  == 2){
            System.out.println("Você está no time do Caruso");
        }else if (resultado  == 3){
            System.out.println("Você está no time do Jerome");
        }else{System.out.println("Digite apenas números");
    }


        //Morangos – R$ 3,50 o kilo;
//Maças – R$2,30 o kilo;
//Bananas – R$ 1,80 o kilo;
    }
    public void exercicio3() {
        System.out.println("Quantos kilos de morango você quer?");

        double morango = sc.nextDouble();
        System.out.println("Quantos kilos de banana você quer?"); 
        double banana = sc.nextDouble();
        System.out.println("Quantos quilos de maçâ você quer?");
        double macas = sc.nextDouble();
        double custo = banana*1.80 + morango*3.50 + macas*2.30;
        double kilo = macas+banana+morango;

    double desconto = 0;
    double custoFinal = custo;
        if(custo>=30 || kilo>=15){
            desconto = custo* 0.1;
            custoFinal= custo+desconto;
            System.out.println("O valor a ser pago foi de R$"+custoFinal);
        }else{
            System.out.println("O valor a ser pago é de R$"+custoFinal);
        }

        
        
        
    }


}
