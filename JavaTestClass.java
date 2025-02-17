import java.util.Scanner;

public class JavaTestClass {
    public static void main(String[] arguments) {
        try (Scanner sc = new Scanner(System.in)) { // Try-with-resources para fechar o Scanner automaticamente
            System.out.print("Digite a quantidade de números a serem somados: ");
            int count = sc.nextInt(); // Número de entradas
            
            int number, sum = 0;
            System.out.println("Digite os números:");
            
            for (int i = 0; i < count; i++) {
                number = sc.nextInt();
                sum += number; // Soma os números digitados
            }

            System.out.println("A soma de todos os números é: " + sum);
        } // O Scanner será fechado automaticamente
    }
}
