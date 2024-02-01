public class EsercizioAND_3 {
    public static void main(String[] args) {
        //Scrivi un programma Java che verifichi se un certo bit è impostato a 1 in un numero.

        int n = 123;
        int bitDaControllare = 1;

        boolean bitSettatoAuno = (n & (1 << bitDaControllare)) != 0;
        System.out.println("Il bit alla posizione " + bitDaControllare + " è impostato a 1? " + bitSettatoAuno);
    }
}
