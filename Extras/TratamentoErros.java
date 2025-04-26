package Extras;

import java.util.Scanner;

public class TratamentoErros {
     public static void main(String[] args) {

    Scanner obj = new Scanner(System.in);

    //try catch

    try {

        System.out.println("Informe um numero inteiro");

        int numero = obj.nextInt();
    
            System.out.println("O numero informado é: " + numero);
        
    }catch(Exception e) {
        System.out.println("Tipo invalido" + e);
    }finally{

        obj.close();
    }
    }
}
