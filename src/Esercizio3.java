public class Esercizio3 {

    public static void dividiStringhe () {
        System.out.println("Inserisci la tua stringa");
        String s = Main.scanner.next();
        while (!s.equals(":q")) {
            String [] parole = s.split("");
            for (int i = 0; i < parole.length; i++) {
                System.out.println(parole[i] + ",");
            }

        };
    }
}
