package Extras;

import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        
        // Array list

        ArrayList<String> nomes = new ArrayList<>();

        // Cadastrar nomes

        nomes.add("Michael");
        nomes.add("Gabriela");
        nomes.add("Thor");

        // Alterar Nomes
       // nomes.set(1, "Lorena");

        // Remover nome
        nomes.remove(2);

        // Remover todos
        //  nomes.clear();

        System.out.println("Registros: " + nomes.size() );  

        // Laços de repetição 

        for(String n : nomes ){
            System.out.println(n);

        }


    }
}
