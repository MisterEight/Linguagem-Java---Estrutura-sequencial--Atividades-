import javax.swing.JOptionPane;

public class Questao06 {
    public static void main(String[] args) {
        float salario_antigo = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite seu salário:"));

        Double salario_novo = salario_antigo * 1.15;

        System.out.printf("O salário antigo é: %.2f", salario_antigo);
        System.out.printf("\nO salário novo é: %.2f", salario_novo);
    }
}
