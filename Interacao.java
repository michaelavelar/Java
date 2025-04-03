import java.util.Scanner;

public class Interacao {
  public static void main(String[] args) {
    // Criar um objeto da classe scanner

    Scanner obj = new Scanner(System.in);

    // obter nome

    System.out.println("Qual é o seu nome?");
    String nome = obj.nextLine();

    // obter idade
    System.out.println("Qual é a sua idade?");
    int idade = obj.nextInt();

    // finalizar interacao
    obj.close();

    // Concatenacao
    System.out.println("Ola " + nome + " voce tem " + idade + " anos.");

  }
}
