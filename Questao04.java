import javax.swing.JOptionPane;

public class Questao04 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome:");

        String idadeString = JOptionPane.showInputDialog(null, "Digite seu ano de nascimento:");
        int idade = 2024 - Integer.parseInt(idadeString) ;

        System.out.printf("Você se chama %s e possui %d anos de idade!", nome, idade);

    }
}
