package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		String yeniMesaj = mesaj.substring(0, 2); // substring fonksiyonu bir değer return ediyor.
		String mesaj2 = sehirVer();
		System.out.println(yeniMesaj);
		System.out.println(mesaj2);
		int sayi = topla(5, 7);
		int toplam = topla2(2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println(sayi);
		System.out.println(toplam);

	}

	public static void ekle() {
		System.out.println("Eklendi.");
	}

	public static void sil() {
		System.out.println("Silindi.");

	}

	public static void guncelle() {
		System.out.println("Güncellendi.");

	}

	public static int topla(int sayi1, int sayi2) { // fonksiyon int bir değer döndürür.
		return sayi1 + sayi2;

	}

	public static int topla2(int... sayilar) {
		int sum = 0;
		for (int sayi : sayilar) { // sayilardaki her bir sayi için
			sum += sayi;

		}
		return sum;
	}

	public static String sehirVer() {
		return "Ankara";
	}
}
