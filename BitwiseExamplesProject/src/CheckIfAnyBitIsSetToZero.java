public class CheckIfAnyBitIsSetToZero {
    public static void main(String[] args) {
        int numero = 42; // Può essere uno scanner ovviamente


        if ((numero | 0) != 0) {
            System.out.println("Almeno un bit è impostato a 1 nel numero " + numero);
        } else {
            System.out.println("Nessun bit è impostato a 1 nel numero " + numero);
        }
    }
}
