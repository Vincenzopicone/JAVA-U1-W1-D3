public class Esercizio4 {

    public static void contoAllaRovescia () {
        System.out.println("Fai partire il tuo conto all rovescia");
        int Number = Main.scanner.nextInt();
        for (int i = Number; i > 0; i-- ) {
            System.out.println(i);
        }
    }
}
