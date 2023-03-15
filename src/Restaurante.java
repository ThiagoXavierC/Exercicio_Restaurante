import jdk.nashorn.internal.scripts.JO;

import javax.swing.JOptionPane;

public class Restaurante {
    public static void main(String[] args) {
        int menu = Integer.parseInt(JOptionPane.showInputDialog(null, "O que você deseja: \n 1. Hamburguer \n 2. Pizza \n 3. Sair"));

        switch (menu) {
            case 1:
                Hamburguer hamb = new Hamburguer();
                hamb.nome = JOptionPane.showInputDialog(null, "Digite o nome do hamburguer: ", "Digite o nome do hamburguer: ", JOptionPane.QUESTION_MESSAGE );
                hamb.valor = Double.parseDouble(JOptionPane.showInputDialog(null, "O valor é:","O valor é: ", JOptionPane.QUESTION_MESSAGE));
                hamb.artesanal = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "É artesanal ?: ", "É artesanal ?: ", JOptionPane.QUESTION_MESSAGE ));

                JOptionPane.showMessageDialog(null, "O valor do pedido ficou: " + hamb.valorPizza(hamb.valor, hamb.artesanal));
                break;
            case 2:
                Pizza pizz = new Pizza();
                pizz.nome = JOptionPane.showInputDialog(null, "Digite o nome da Pizza: ", "Digite o nome da Pizza: ", JOptionPane.QUESTION_MESSAGE );
                pizz.valor = Double.parseDouble(JOptionPane.showInputDialog(null, "O valor é:","O valor é: ", JOptionPane.QUESTION_MESSAGE));
                pizz.borda = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "Possui borda ?: ", "Possui borda ?: ", JOptionPane.QUESTION_MESSAGE ));

                JOptionPane.showMessageDialog(null, "O valor do pedido ficou: " + pizz.valorPizza(pizz.valor, pizz.borda));
                break;
            case 3:
                System.out.println("Saindo...");
                break;
        }
    }
}
