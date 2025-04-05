public class EstruturaDeEscolha {

  public static void main(String[] args) {
    
    // Variavel
    String cidade = "São Paulo";

    // Switch Expressions
    String mensagem = switch(cidade){
      case "São Paulo" -> "Maior cidade do pais";
      case "Rio de Janeiro" -> "Cidade Maravilhosa";
      default -> "Cidade nao encontrada";
    };
    System.out.println(mensagem)



    // Estrutura de escolha
    // switch(cidade){
    //   case "São Paulo":
    //   System.out.println("A maior cudade do país")
    //   break;

    //   case "Rio de Janeiro":
    //   System.out.println("Cidade Maravilhosa")
    //   break;

    //   default:
    //   System.out.println("Cidade não encontrada")
    //   break;
    // }
  }
}