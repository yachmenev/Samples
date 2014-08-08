package examples;

import java.util.Random;

public class MyRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		 
        for (int i = 0; i < 10; i++) {
            System.out.println(
                String.format(
                    "%b\t %d\t %d\t %d\t %.10f\t %.10f",
                    rand.nextBoolean(),
                    rand.nextInt(),
                    rand.nextInt(20),
                    rand.nextLong(),
                    rand.nextFloat(),
                    rand.nextDouble()
                )
            );
        }
 
        System.out.println("\nFixed seed");
        for (int i = 0; i < 10; i++) {
                        if (i % 3 == 0) {
                                rand.setSeed(1L);
                        }
            System.out.println(
                String.format(
                    "%b\t %d\t %d\t %d\t %.10f\t %.10f",
                    rand.nextBoolean(),
                    rand.nextInt(),
                    rand.nextInt(20),
                    rand.nextLong(),
                    rand.nextFloat(),
                    rand.nextDouble()
                )
            );
        }
    }

}
