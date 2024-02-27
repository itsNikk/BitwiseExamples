import java.util.Scanner;

public class VerificaBitwise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero intero: ");
        int numero = scanner.nextInt();

        verificaEStampaBit(numero);

        scanner.close();
    }

    private static void verificaEStampaBit(int numero) {
        // Utilizziamo un ciclo per scorrere ogni bit del numero
        for (int i = 31; i >= 0; i--) {
            // Utilizziamo l'operatore bitwise AND con 1 per verificare il bit corrente
            int bit = (numero >> i) & 1;

            System.out.println("Bit " + i + ": " + bit);
        }
    }
}
