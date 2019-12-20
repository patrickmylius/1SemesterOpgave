/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 13/12/2019
 */

public class Main {
// TODO Din kode her

public static void main(String[] args) {
  /** Opgave a, b, c*/

    hello("");
    hello("Andras!");
}

    public static String hello(String navn) {

    if (navn.isEmpty()) {
        System.out.println("Hello World!");// calls "Hello World!" if string navn is empty
    } else System.out.println("Hello " + navn);// calls "hello" + navn in method call


        return "";
    }


}
