/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 18/12/2019
 */

public class Person {

    // TODO Ret nedenstående datatyper
    /** Redigeret og nu brugbare variables */

    String navn = "Noob Noobeson";
    int alder = 18;
    String by = "Næstved";
    int postNummer = 4700;
    String vej = "Femøvej";
    String husnummer = "3B";
    String nationalitet = "Dansk";
    String[] fritidsInteresser =  {"Snitning", "LOL", "strikke"};
    String[] smartHomeDevices = {"Xbox 3", "Smartlamper", "Køleskab", "m.m"};
    double hojde = 1.56;
    char vaegt = 95, kg;
    double karaktergennemsnit = 5.33;
    byte[] eksamensKarakterer = { 7, 12, -3, 4, 2, 10 };
    String opdateretDato = "Sun Jan 08 00:00:00 CET 1978";


    /** type casting constructer, sætter nyt navn og by */
    public Person(String navn, String by) {
        this.navn = navn;
        this.by = by;
    }

    // TODO Vis eksempler på typecasting
    @Override

    /** toString metode, som returnere navn + by */
    public String toString() {

        return "Navn: " + navn + " By " + by;
    }

    public static void main(String[] args) {

        /** instantiering af konstrukter med nyt navn og by navn */
        Person person = new Person("Patrick Grønvold", "Køge");
        System.out.println(person);
    }

}
