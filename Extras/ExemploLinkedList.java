package Extras;
import java.util.LinkedList;

public class ExemploLinkedList {
    public static void main(String[] args) {

        //Array List: Leitura
        //Linked List: Cadastrar e remover (first e last)
        
        // LinkedList
        LinkedList<String> cores = new LinkedList<>();

        // Cadastros

        cores.add("Azul");
        cores.add("Amarelho");
        cores.add("Branco");

        // Alterar

        cores.set(1, "Preto");

        // Remover
        //cores.remove();


    }
}
