public class OperadoresLogicos {
  public static void main(String[] args) {

    // VARIAVEIS
    String formaPagamento = "a vista";
    double valor = 200;

    System.out.println(formaPagamento == "a prazo" || valor >= 100);

  }
}

// TABELA VERDDE - E
// VERIFICACAO 01 - OPERADOR - VERIFICACAO 02 - SITUACAO
// TRUE - E - TRUE - TRUE
// TRUE - E - FALSE - FALSE
// FALSE - E - TRUE - FALSE
// FALSE - E - FALSE - FALSE

// TABELA VERDDE - OU
// VERIFICACAO 01 - OPERADOR - VERIFICACAO 02 - SITUACAO
// TRUE - OU - TRUE - TRUE
// TRUE - OU - FALSE - TRUE
// FALSE - OU - TRUE - TRUE
// FALSE - OU - FALSE - FALSE