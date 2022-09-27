package stringsDemo;

public class Main {

	public static void main(String[] args) {

		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);

		String yeniMesaj = mesaj.replace(' ', '-');

		System.out.println(yeniMesaj);

		System.out.println(mesaj.substring(2)); // 2.indexten itibaren al.

		System.out.println(mesaj.substring(2, 4)); // 2 den 4 e kadar al, 4 dahil değil
		 
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		System.out.println(mesaj.trim());

//
//		System.out.println("Eleman sayısı: " + mesaj.length());
//		System.out.println("5.Eleman:" + mesaj.charAt(4));
//		System.out.println(mesaj.concat(" Yaşasın!"));
//		System.out.println(mesaj.startsWith("B"));
//		System.out.println(mesaj.endsWith("l"));
//
//		char[] karakterler = new char[5];
//		mesaj.getChars(6, 10, karakterler, 0);
//		System.out.println(karakterler);
//
//		System.out.println(mesaj.indexOf('a'));
//		System.out.println(mesaj.indexOf("av"));
//
//		System.out.println(mesaj.lastIndexOf('a'));

	}

}
