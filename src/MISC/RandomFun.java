package MISC;

import java.util.Random;

public class RandomFun {
    public static void main(String[] args) {
        Random rand = new Random();
        int upperbound = 25; //generate random values from 0-24
        int int_random = rand.nextInt(upperbound);
        double double_random=rand.nextDouble();
        float float_random=rand.nextFloat();

        System.out.println("Random integer value from 0 to " + (upperbound-1) + " : "+ int_random);
        System.out.println("Random float value between 0.0 and 1.0 : "+float_random);
        System.out.println("Random double value between 0.0 and 1.0 : "+double_random);

        int min = 50;
        int max = 100;
        //Generate random double value from 50 to 100
        System.out.println("Random value in double from "+min+" to "+max+ ":");
        double random_double = Math.random() * (max - min + 1) + min;
        System.out.println(random_double);

        //Generate random int value from 50 to 100
        System.out.println("Random value in int from "+min+" to "+max+ ":");
        int random_int = (int)(Math.random() * (max - min + 1) + min);
        System.out.println(random_int);
    }
}
