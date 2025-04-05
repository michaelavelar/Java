package Exercicios;

import java.util.Scanner;

public class Exercicio03 {
  public static void main(String[] args) {
    
    // Scanner

    Scanner obj = new Scanner(System.in);

    // Obter valores
    System.out.println("Informe o primeiro numero");
    int numero1 = obj.nextInt();

    System.out.println("Informe o segundo numero");
    int numero2 =  obj.nextInt();  


    obj.close();

    if (numero1 == numero2) {
      System.out.println(numero1 + numero2);
    }
    else{
      System.out.println(numero1 * numero2);
    }


    // // com operador
    // int calculo = numero1 == numero2 ? numero1+numero2 : numero1*numero2;
  }



}
