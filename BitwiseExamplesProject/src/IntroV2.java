public class IntroV2 {
    public static void main(String[] args) {
        // BITWISE
        // 8bit dei numeri con un prefisoo => 0b
        // tutti i risultati verranno salvati in variabili intere

        //Stampare da intero a binario
        int n1 = 5;
        System.out.println("Valore intero:> " + n1);
        System.out.println(n1 + " in binario: " + Integer.toBinaryString(n1));

        int n2 = 0b00000000;
        System.out.println(n2);

        // & AND BITWISE
        int a = 50; //   00110010
        int b = 7;  //   00000111
        // ----------
        //        010
        System.out.println("AND BITWISE &");
        System.out.println(a + " in binario +: " + Integer.toBinaryString(a));
        System.out.println(b + " in binario è: " + Integer.toBinaryString(b));

        System.out.println(a & b);
        int mascheraCoppie = 0b00110011;
        System.out.println("a & mascheraCoppie:> " + (a & mascheraCoppie));

        //   00110010
        //   00000001
        System.out.println(a & 1);
        //   00110010
        //   00000001

        // Left shift = moltiplicare un numero per una certa potenza di due
        // <<
        System.out.println();
        System.out.println("LEFT SHIFT <<");
        System.out.println(a + "* 2: " + (a << 1));
        for (int i = 0; i < 3; i++) {
            System.out.println(a + " * " + (i + 1) + ": " + (a << (i + 1)));
        }


        // Right Shift  = dividere per una certa potenza di 2
        // >>
        System.out.println();
        System.out.println("RIGHT SHIFT >>");
        System.out.println("a >> 1: " + (a >> 1));
        int gigaValore = 340;
        for (int i = 0; i < 5; i++) {
            System.out.println("gigavalore >> " + " " + i + ": " + (gigaValore >> (i + 1)));
        }
    }
}
