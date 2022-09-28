package methods2;

public class main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);

		int sayi = topla(5, 7);
		System.out.println(sayi);
		int sayim = topla(55, 7);
		System.out.println(sayim);
		int toplam = topla2(2, 3, 8, 6, 10,20);
		System.out.println(toplam);
	}

	public static void ekle() {
		System.out.println("eklendi.");
	}

	public static void sil() {
		System.out.println("silindi.");
	}

	public static void güncelle() {
		System.out.println("güncellendi.");
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;
	}

	public static String sehirVer() {
		return "Balıkesir";
	}

}
