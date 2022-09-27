package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 220;
		int sayi2 = 284;
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 1; i < sayi1; i++) {
			if (sayi1 % i == 0) {
				sum1 += i;
			}
		}

		for (int i = 1; i < sayi2; i++) {
			if (sayi2 % i == 0) {
				sum2 += i;
			}
		}

		if (sayi1 == sum2 && sayi2 == sum1) {
			System.out.println("Arkadaş sayılardır.");
		} else {
			System.out.println("Arkadaş sayılar değildir.");
		}

	}

}
