public class Introduzione {
    public static void main(String[] args) {
        //BITWISE sono operatori che eseguono operatzioni
        // sulle rappresentazioni binarie delle variabili

        int v1 = 10;
        int v2 = 0b00110010;
        //Integer.toBinaryString(v1) stampa la stringa binaria del valore intero passato tra ()
        System.out.println(v1 + " in binario è: " + Integer.toBinaryString(v1));
        System.out.println(v2);
        System.out.println(Integer.toBinaryString(50));

        // &
        int valore = 123;
        int valore2 = 7;
        System.out.println(valore + ":> " + Integer.toBinaryString(valore));
        System.out.println(valore2 + ":> " + Integer.toBinaryString(valore2));

        // ogni operatore bitwise restituisce un valore intero
        // valore = 1111011 &
        // valore = 1111011 =
        // ------------------
        //          1111011
        System.out.println("valore & valore =" + (valore & valore));
        System.out.println("valore & 0 =" + (valore & 0));
        // valore = 01111011 &
        // valore = 00000011 = (maschera)
        // ------------------
        //         000000011
        System.out.println("valore & 1 = " + (valore & 1));
        System.out.println("valore & 00000010 :> " + (valore & 0b00000010));
        System.out.println("valore & 00000011:> " + (valore & 0b00000011));

        // << = shift a sx (moltiplicazione per una potenza di due)
        // >> = shift a dx (divisione per una potenza di due)
        int v = 4; //0b00000100
        System.out.println("v << 1 = " + (v << 1));
        System.out.println("v << 2 = " + (v << 2));
        System.out.println("v << 4 = " + (v << 4));
        System.out.println();
        System.out.println("v >> 1 = " + (v >> 1));
    }
}