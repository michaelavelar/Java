/*
 * 1 - Não pode conter caracteres especiais
 * 2 - Não podemos usar espaços
 * 3 - Não pode inciar com numeros
 * 4 - Não iniciar com letras maiusculas
 * 5 - Não utilizar palavras reservadas, 
 *     exemplos: public, class, void
 * 
 */


public class Variaveis {
  //toda variavel em java deve ser tipada
  public static void main(String[] args) {
    String nome = "Michael";
    char letra = 'M';
    int idade = 32;
    double altura = 1.79;
    boolean estuda = true;  
    
    System.out.println(nome);
    System.out.println(letra);
    System.out.println(idade);
    System.out.println(altura);
    System.out.println(estuda);
  }
}
