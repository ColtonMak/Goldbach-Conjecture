import java.util.Scanner;

public class Goldbach {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		
		boolean[] primeChecker = new boolean[input+1];
		for (int i = 2; i < primeChecker.length; i++) {
			primeChecker[i] = true;
		}
		
		for (int i = 2; i < (int)Math.sqrt(input); i++) {
			if (primeChecker[i] == true) {
				for (int j = (int) Math.pow(i, 2); j < primeChecker.length; j+=i) {
					primeChecker[j] = false;
				}
			}
		}
		
		int primeCount = 0;
		for (int i = 0; i < primeChecker.length; i++) {
			if (primeChecker[i] == true) {
				primeCount++;
			}
		}
		
		int[] primes = new int[primeCount];
		int j = 0;
		for (int i = 0; i < primeChecker.length; i++) {
			if (primeChecker[i] == true) {
				primes[j] = i;
				j++;
			}
		}
		for (int i = 0; i < primes.length; i++) {
			int num = input - primes[i];
			for (int k = 0; k <= primes.length / 2; k++) {
				if (num == primes[k]) {
					System.out.println(input + " = " + primes[k] + " + " + primes[i]);
				}
			}
		}
	}

}
