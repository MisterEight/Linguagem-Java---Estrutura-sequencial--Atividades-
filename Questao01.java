import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        float valor1, valor2, valor3, valor4, valor5;
        float media;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        valor1 = scanner.nextFloat();

        System.out.println("Digite o segundo valor: ");
        valor2 = scanner.nextFloat();

        System.out.println("Digite o terceiro valor: ");
        valor3 = scanner.nextFloat();

        System.out.println("Digite o quarto valor: ");
        valor4 = scanner.nextFloat();

        System.out.println("Digite o quinto valor: ");
        valor5 = scanner.nextFloat();

        media = (valor1+valor2+valor3+valor4+valor5) / 5;

        System.out.printf("\nValor 1: %.2f", valor1);
        System.out.printf("\nValor 2: %.2f", valor2);
        System.out.printf("\nValor 3: %.2f", valor3);
        System.out.printf("\nValor 4: %.2f", valor4);
        System.out.printf("\nValor 5: %.2f", valor5);
        System.out.printf("\nMédia Aritmética: %.2f", media);
    }
}
