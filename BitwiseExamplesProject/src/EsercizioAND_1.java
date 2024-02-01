import java.util.Scanner;

public class EsercizioAND_1 {
    public static void main(String[] args) {
        /*
         * Scrivi un programma che accetti due numeri interi in input e utilizzi l'operatore bitwise
         * AND per contare il numero di bit comuni (cioè quelli dove entrambi i bit sono impostati a uno) tra i due numeri.
         * */

        //Integer.bitCount(valore)

        Scanner s = new Scanner(System.in);
        System.out.print("Inserisci primo numero:> ");
        int a = s.nextInt();
        System.out.print("Inserisci secondo numero:> ");
        int b = s.nextInt();

        int risultato = a & b;
        System.out.println("I bit comuni tra " + Integer.toBinaryString(a) + " e " + Integer.toBinaryString(b) + " sono:> " + Integer.bitCount(risultato));
    }
}
