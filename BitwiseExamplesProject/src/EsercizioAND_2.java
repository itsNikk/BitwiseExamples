public class EsercizioAND_2 {
    public static void main(String[] args) {
        /*
        Scrivi un programma Java che controlla se un numero intero è pari o dispari, usando solo bitwise AND.
        * */

        int n = 15;
        int lastBit = n & 1;

        if (lastBit == 1) {
            System.out.println(n + " è dispari");
        } else {
            System.out.println(n + " + pari");
        }


    }
}
