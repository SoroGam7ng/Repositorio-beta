import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        if (num1 > 99999 || num1 < -99999 || num2 > 99999 || num2 < -99999) {
            System.out.println("Error: Los números deben estar entre -99999 y 99999.");
        } else {
            System.out.println("Suma: " + (num1 + num2));
            System.out.println("Resta: " + (num1 - num2));
            System.out.println("Multiplicación: " + (num1 * num2));
            System.out.println("Potencia: " + Math.pow(num1, num2));
        }

        sc.close();
    }
}