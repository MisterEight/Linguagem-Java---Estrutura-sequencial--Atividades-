import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        double circunferencia, area;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a circunferência: ");
        circunferencia = scanner.nextFloat();
        
        area = Math.PI * (circunferencia * 2);

        System.out.printf("A área desse círculo é: %.2f",area);
    }
}
