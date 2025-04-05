package Exercicios;

import java.util.Scanner;

public class Exercicio02 {
  public static void main(String[] args) {
    // criar objto scanner parsa obter informacao
    Scanner obj = new Scanner(System.in);

    // obter primeiro numero inteiro
    System.out.println("Informe o primeiro numero");
    int numero1 = obj.nextInt();

    // obter segundo numero inteiro
    System.out.println("Informe o segundo numero");
    int numero2 = obj.nextInt();

    // obter terceiro numero inteiro
    System.out.println("Informe o terceiro numero");
    int numero3 = obj.nextInt();

    // fecha o Scanner
    obj.close();

    
    // criar variavel menor numero

    int menorNumero = numero1;

    // condicional
    if (numero2 < menorNumero) {
      menorNumero = numero2;      
    }

    if (numero3 < menorNumero) {
      menorNumero = numero3;      
    }

    // exibir menor numero
    System.out.println("O menor numero é " + menorNumero);



  }
}
