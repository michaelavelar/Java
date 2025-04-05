public class EstruturaDeEscolha {

  public static void main(String[] args) {
    
    // Variavel
    String cidade = "São Paulo";

    // Estrutura de escolha
    switch(cidade){
      case "São Paulo":
      System.out.println("A maior cudade do país")
      break;

      case "Rio de Janeiro":
      System.out.println("Cidade Maravilhosa")
      break;

      default:
      System.out.println("Cidade não encontrada")
      break;
    }
  }
}