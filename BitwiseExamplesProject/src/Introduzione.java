public class Introduzione {
    public static void main(String[] args) {
        // BITWISE
        // 8bit per rappresentare i numeri
        // tutti i risultati vanno in variabili

        int v1 = 10;
        int v2 = 0b00110010;
        // Integer.toBinaryString(v)
        /*
         * Mettere tra parentesi tonde un valore intero (diretto o varaibile)
         * Risultato => stringa binaria corrsipondente al valore immesso
         * */
        System.out.println(Integer.toBinaryString(v1));
        System.out.println(Integer.toBinaryString(50));
        System.out.println("-50> " + Integer.toBinaryString(-50));
        // TILDE = ALT+126 (del tastierino numerico)
        System.out.println("-50> " + ~50);
        System.out.println(v2);


        // &
        int valore = 123;
        int valore2 = 7;
        System.out.println("valore=" + valore);
        System.out.println("valore in binario:> " + Integer.toBinaryString(valore));
        System.out.println("valore2=" + valore2);
        System.out.println("valore2 in binario:> " + Integer.toBinaryString(valore2));

        // Mascheramento / masking
        System.out.println("valore & valore= " + (valore & valore));
        System.out.println("valore & 0= " + (valore & 0));
        System.out.println("valore & valore2= " + (valore & valore2));

        System.out.println("valore & 1= " + (valore & 1));

        System.out.println("valore & 0b00010000= " + (valore & 0b00010000));
        System.out.println("valore & 0b00000100= " + (valore & 0b00000100));

    }
}