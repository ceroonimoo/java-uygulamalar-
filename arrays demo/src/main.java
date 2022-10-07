
public class main {

	public static void main(String[] args) {
		//1. yol
		String ogrenci1="ali";
		String ogrenci2="ayse";
		String ogrenci3="ahmet";
		String ogrenci4="fatma";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
System.out.println("---------------");
		//2. yol
		String[] ogrenciler=new String[4];
		ogrenciler[0]="ali";
		ogrenciler[1]="ayse";
		ogrenciler[2]="ahmet";
		ogrenciler[3]="fatma";
		
		for(int i=0;i<ogrenciler.length;i++)
		{
			System.out.println(ogrenciler[i]);
		}
		
System.out.println("----------------");
		//3.yol
		for(String ogrenci:ogrenciler) 
		{
			System.out.println(ogrenci);
		}
	}

}
