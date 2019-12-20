/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 17/12/2019
 */
import java.util.Scanner;

public class Loops {

    Scanner input = new Scanner(System.in);



    private String brugere[] = {"Anders", "Birgit", "Carsten", "Dennis", "Esben"};

    public String[] getBrugere() {
        return brugere;
    }

    public static void main(String[] args) {
        Loops l = new Loops();
        l.printBrugereArr();
        System.out.println("*******");
        l.printBrugereReverseArr();
        System.out.println("*******");
        l.waitingFor0();
    }

    /**
     * Viser en liste med brugere i konsollen
     */
    public void printBrugereArr() {
        System.out.println("brugere i korrekt order: ");
        //Udskriver brugere i korrekt række følge, til i = brugere.length
        for (int i = 0; i < brugere.length; i++) {

            System.out.println(brugere[i]);

        }
    }

    /**
     * Viser en liste med brugere i konsollen i omvendt rækkefølge
     */
    public void printBrugereReverseArr() {

        System.out.println("Navne i modsat order: ");
        //Udskriver brugere i omvendt række følge, til bruger.length = i
        for (int i = brugere.length -1; i>=0; i--) {
            System.out.println(brugere[i]);

        }

    }
    /** Hvis bruger indtaster tal som ikke er = 0, køres loop igen. */
    public void waitingFor0() {
        System.out.println("Venter på 0! Skriv et tal... ");
        int waitingFor = input.nextInt();
        int exitLoop = 0;

        while (waitingFor != exitLoop)
        {
            waitingFor0();

        }  /** Hvis bruger indtaster 0 bryder loopet*/
        if (waitingFor == exitLoop) {
            System.out.println("Du har taste 0. Så er det slut!"); System.exit(0);
        }

    }
}
