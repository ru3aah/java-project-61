package hexlet.code.games;

import java.util.Random;

public class PrimeGame {

    public static void greetMsg() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        System.out.println(" ");
    }

    //generate random positive int
    public static int getRnd() {
        Random random = new Random();
        return random.nextInt(1, 1000);
    }

    //define a correct answer
    public static String corAns(int rnd) {
        int tmp = 0;
        for (int j = 2; j <= rnd/2;  j++) {
            tmp = rnd % j;
            if (tmp == 0) {return "no";}
        }
        return "yes";
    }

}
