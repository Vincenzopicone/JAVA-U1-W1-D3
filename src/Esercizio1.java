public class Esercizio1 {

    public static void stringaPariDispari(String p) {
        boolean caratteri = p.length() % 2 == 0;
        if (caratteri) {
            System.out.println("Vero");
        } else { System.out.println("Falso");}
    };

    public static void annoBisestile(int anno) {
        boolean bisestile = anno % 4 == 0 || anno % 100 == 0 && anno % 400 == 0;
        if (bisestile) {
            System.out.println("Vero");
        } else { System.out.println("Falso");}
    }
}
