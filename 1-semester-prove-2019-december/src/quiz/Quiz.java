package quiz;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz implements Translateable {
    public static void main(String[] args) {





        Scanner input = new Scanner(System.in);

       Sporgsmaal sporgsmaal = new Sporgsmaal("Hvad måned er der jul i? :", 5, new String[]{"december", "november", "februar", "juni"}, 0);
       System.out.println(sporgsmaal.getSpoergsMaal());
       System.out.println("Svarmuligheder: " + Arrays.toString(sporgsmaal.getSvar()));


        }




    }

