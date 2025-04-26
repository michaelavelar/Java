package Extras;

import java.util.Stack;

public class ExemploStack {

    public static void main(String[] args) {

        Stack<String> paginas =  new Stack<>();

        // Cadastros

        paginas.push("1");
        paginas.push("2");
        paginas.push("3");

        // remocao vai ser sempre o ultimo registro

        paginas.pop();

        // peek registro que vai ser removido( como se fosse uma consulta)

        paginas.peek();
        System.out.println(paginas.peek());

        //Exibir

        System.out.println(paginas);


        
    }
    
}
