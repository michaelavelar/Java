package Extras;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
    public static void main(String[] args) {
        
        Queue<String> nomes = new LinkedList<>();


        // Cadastro

        nomes.offer("Michael");
        nomes.offer("Gabriela");
        nomes.offer("Thor");

        
        // Excluir
        nomes.poll();
        
        
        // Exibir        
        System.out.println(nomes);
    }
}
