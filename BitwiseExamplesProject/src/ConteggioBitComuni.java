import java.util.Scanner;

public class ConteggioBitComuni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il primo numero: ");
        int num1 = scanner.nextInt(); // 7= 0b00000111

        System.out.print("Inserisci il secondo numero: ");
        int num2 = scanner.nextInt(); // 0b00000001

        int result = num1 & num2;

        System.out.println("Il numero di bit comuni è: " + Integer.bitCount(result));
    }
}
