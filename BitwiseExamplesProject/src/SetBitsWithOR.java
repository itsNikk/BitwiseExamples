public class SetBitsWithOR {
    public static void main(String[] args) {
        int numero = 42;
        //Si può sostituire con il numero desiderato
        int n = 4;

        //Solo un semplice controllo per evitare di sforare.
        if (n < 0 || n > 32) {
            System.out.println("Il valore di n deve essere compreso tra 0 e 32.");
            return;
        }

        //Calcola la maschera per impostare a 1 tutti i bit tranne i primi n bit
        int maschera = (1 << n) - 1;

        int risultato = numero | maschera;

        System.out.println("Numero di partenza: "+ Integer.toBinaryString(numero));
        System.out.println("Maschera: " + Integer.toBinaryString(maschera));
        System.out.println("Risultato: " + Integer.toBinaryString(risultato));
    }
}