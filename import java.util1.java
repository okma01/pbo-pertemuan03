import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        double bilangan1 = scanner.nextDouble();

        System.out.print("Masukkan bilangan kedua: ");
        double bilangan2 = scanner.nextDouble();

        System.out.print("Pilih operasi matematika (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double hasil = 0;

        if (operator == '+') {
            hasil = bilangan1 + bilangan2;
        } else if (operator == '-') {
            hasil = bilangan1 - bilangan2;
        } else if (operator == '*') {
            hasil = bilangan1 * bilangan2;
        } else if (operator == '/') {
            if (bilangan2 != 0) {
                hasil = bilangan1 / bilangan2;
            } else {
                System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                System.exit(0);
            }
        } else {
            System.out.println("Error: Operator tidak valid.");
            System.exit(0);
        }
    }
}
