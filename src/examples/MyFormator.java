package examples;

public class MyFormator {

	public static void main(String[] args) {
		float l = 0.123456787668768768678f;
		double pi = Math.PI;
		System.out.printf("PI is %.10f", pi);
		System.out.printf("\nYor value is %.3f", l);
	}

}
