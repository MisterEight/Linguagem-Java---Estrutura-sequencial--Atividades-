import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        float horas, remuneracao, salario;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de horas: ");
        horas = scanner.nextFloat();

        System.out.println("Digite a sua remuneração por hora: ");
        remuneracao = scanner.nextFloat();

        salario = horas * remuneracao;

        System.out.printf("O seu salário é: %.2f", salario);
    }
}
