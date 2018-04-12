import java.util.Scanner;

public class Goldbach {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		boolean[] primes = new boolean[num+1];
		for (int i = 2; i < primes.length; i++) {
			primes[i] = true;
		}
		
		for (int i = 2; i < (int)Math.sqrt(num); i++) {
			if (primes[i] == true) {
				for (int j = (int) Math.pow(i, 2); j < primes.length; j+=i) {
					primes[j] = false;
				}
			}
		}
		
		for (int i = 0; i < primes.length; i++) {
			if (primes[i] == true) {
				System.out.println(i);
			}
		}
	}

}
