import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        float valor, desconto, valor_final;
        String nome_produto;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        nome_produto = scanner.nextLine();

        System.out.println("Digite o valor do produto: ");
        valor = scanner.nextFloat();

        System.out.println("Digite o valor do desconto em decimal. Ex: 0,10: ");
        desconto = scanner.nextFloat();

        valor_final = valor + (valor * desconto);

        System.out.println("O nome do produto é: " + nome_produto);
        System.out.println("Antigo valor: " + valor);
        System.out.printf("Novo valor: %.3f",valor_final);

    }
}
