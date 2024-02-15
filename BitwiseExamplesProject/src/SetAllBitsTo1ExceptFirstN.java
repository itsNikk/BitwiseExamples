public class SetAllBitsTo1ExceptFirstN {
    public static void main(String[] args) {
        int numero = 42;
        int n = 4;

        //Evitiamo di sforare i 32bit
        if (n < 0 || n > 32) {
            System.out.println("Il valore di n deve essere compreso tra 0 e 32.");
            return;
        }

        // Crea una maschera con i primi n bit da dx impostati a 1
        int maschera = (1 << n) - 1;

        // Inverte la maschera per ottenere tutti i bit tranne i primi n impostati a 1
        maschera = ~maschera;

        int risultato = numero | maschera;

        System.out.println("Numero originale: " + Integer.toBinaryString(numero));
        System.out.println("Maschera: " + Integer.toBinaryString(maschera));
        System.out.println("Risultato: " + Integer.toBinaryString(risultato));
    }
}
