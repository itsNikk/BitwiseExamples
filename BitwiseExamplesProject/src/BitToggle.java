public class BitToggle {
    public static void main(String[] args) {
        int n = 42;
        int bitToToggle = 3;

        // bitToToggle - 1 perchè altrimenti si setterebbe il bit dopo quello richiesto
        int mask = (1 << (bitToToggle - 1));

        System.out.println("Numero input:" + Integer.toBinaryString(n));
        System.out.println("Maschera: " + Integer.toBinaryString(mask));
        System.out.println("Risultato: " + Integer.toBinaryString(n ^ mask));
    }
}
