public class LargestPowerOf2 {

    public static void main(String[] args) {
        /*
         * Scrivi un programma Java che trovi
         * il numero più grande che sia minore o uguale a un dato numero e che sia una potenza di 2,
         * utilizzando l'operatore bitwise AND.
         */


        int num = 257; // Esempio, potrebbe essere uno Scanner

        int largestPowerOf2 = 1;
        while ((largestPowerOf2 << 1) <= num) largestPowerOf2 <<= 1;

        System.out.println("Il numero più grande minore o uguale a " + num + " e potenza di 2 è: " + largestPowerOf2);
    }
}
