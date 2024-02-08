import java.util.Scanner;

public class ControlloSeBitSettato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero intero: ");
        int num = scanner.nextInt();

        System.out.print("Inserisci la posizione del bit da verificare: ");
        int bitPosition = scanner.nextInt();

        System.out.println(num + ": " + Integer.toBinaryString(num));

        // Verifica se il bit alla posizione specificata è impostato a 1
        boolean isBitSet = (num & (1 << bitPosition)) != 0;

        System.out.println("Il bit alla posizione " + bitPosition + " è impostato a 1: " + isBitSet);
    }
}
