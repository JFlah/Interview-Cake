/**
 * Created by Jack on 11/19/2015.
 */

/*
 * Given an arrayOfInts, find the highestProduct you can
 * get from three of the integers.
 * The input arrayOfInts will always have at least three integers.
 */

public class _3HighestProductFrom3Ints {
    public static void main(String[] args) {
        int[] arrayOfInts = new int[]{1,2,1,4,3};
        System.out.println(highestProductOf3(arrayOfInts));
    }

    public static int highestProductOf3(int[] ints) {
        int one = ints[0];
        int two = ints[1];
        int three = ints[2];
        int highestProd = one*two*three;
        if (ints.length == 3)
            return highestProd;

        for (int i = 1; i < ints.length-2; i++) {
            int minFirstTwo = Math.min(ints[i], ints[i+1]);
            int minAll = Math.min(minFirstTwo, ints[i+2]);

            int newGuy = ints[i+2];

            if (newGuy > minAll)



            int newProd = one*two*three;
            highestProd = Math.max(highestProd, newProd);
        }
        return highestProd;
    }
}
