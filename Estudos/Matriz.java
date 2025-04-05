package Estudos;
public class Matriz {
  public static void main(String[] args) {
    
    // matriz
    String[][] clientes = {
        {"Michael", "Programador"},
        {"Gabriela", "Analista"},
        {"Thor", "Cachorro"}
    };

    // exibir
    System.out.println(clientes[1][0]);


    // exibir com laco para exibir todos valores
    for(int indice=0; indice<3; indice++){
      System.out.println("Nome: " + clientes[indice][0] );
      System.out.println("Profissao: " + clientes[indice][1] );

    }
  }
}
