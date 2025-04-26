package Extras;

import java.util.HashMap;

public class ExemploHashMap {
    public static void main(String[] args) {
        
        // HashMap

        HashMap<String, String> linguagens =  new HashMap<>();

        // Cadastros
        linguagens.put("Java", "Linguagem multiplataforma");
        linguagens.put("HTML", "Linguagem de marcação");
        linguagens.put("CSS", "Linguagem Estilo");

        // Remover

        linguagens.remove("CSS");


        // Exibir
        System.out.println(linguagens.get("HTML"));




    }
}
