public class Concatenacao {
  public static void main(String[] args) {
    // Variaveis
    String nome = "Michael";
    int idade = 32;

    System.out.println("Olá " + nome + " voce tem " + idade + " anos.");
    System.out.println(String.format("Ola %s voce tem %s anos.", nome, idade));
    ;
  }
}
