package methods2;

public class main {

	public static void main(String[] args) {
		String mesaj="bugün hava çok güzel";
		String yeniMesaj=sehirVer();
		System.out.println(yeniMesaj);
		int sayı=topla(5,13);
		System.out.println(sayı);
		int toplam=topla2(1,5,5,1,6,9);
		System.out.println(toplam);
	}
	public static void ekle() {
		System.out.println("eklendi");
		
}
	public static void sil() {
		System.out.println("silindi");
	}
	public static void guncelle() {
		System.out.println("güncellendi");
	}
	public static String sehirVer() {
		return "Ankara";
				
	}
	public static int topla(int sayı1, int sayı2) {
		return sayı1+sayı2;
	}
	public static int topla2(int...sayılar) {
		int toplam=0;
		for(int sayı:sayılar) {
			toplam+=sayı;
		}return toplam; 
	}}

