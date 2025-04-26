package Extras;

import javax.swing.JOptionPane;

public class Modal {
    public static void main(String[] args) {
        
        // Mensagem
        // JOptionPane.showMessageDialog(null, "Hello World");

        // obter dados
        String nome = JOptionPane.showInputDialog("Informe seu nome");
        JOptionPane.showMessageDialog(null, "O nome informado é: " + nome);


    }
}
