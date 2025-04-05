package Exercicios;

import java.util.Scanner;

public class Exercicio01 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);

    // primeira nota
    System.out.println("Informe a primeira nota");
    double nota1 = obj.nextDouble();

    // segunda nota
    System.out.println("Informe a segunda nota");
    double nota2 = obj.nextDouble();

    obj.close();

    // relizar media

    double media = (nota1 + nota2) / 2;

    // situcao

    if(media >=7){
      System.out.println("Aprovado com media:2 " + media);
    }
    else{
      System.out.println("Reprovado com media: " + media);
    }


  }
}
