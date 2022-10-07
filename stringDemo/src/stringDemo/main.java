package stringDemo;

public class main {

	public static void main(String[] args) {
		String mesaj="Bugün hava çok güzel.";
		System.out.println(mesaj);
		
		System.out.println("eleman sayısı=" +mesaj.length());
		System.out.println("5. eleman=" +mesaj.charAt(4));
		System.out.println(mesaj.concat("yaşasın!"));
		System.out.println(mesaj.startsWith("b"));
		System.out.println(mesaj.endsWith("."));
		char[] karakterler=new char[25];
		mesaj.getChars(0, 5, karakterler, 0); //0. elemandan 5. elemana kadar harfleri alıyor, karakterlere atıyor
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("a")); //a harfinin ilk bulundugu yeri veriyor
		System.out.println(mesaj.lastIndexOf("a")); //a harfinin son bulundugu yeri veriyor
		
		String yeniMesaj=mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,5)); //2. harften baslayarak 5. harfe kadar olan yeri yazdırır
		
		for(String kelime:mesaj.split(" ")) { //boşluga gelene kadar her harfi kelimeye atar,kelimeleri alt alta yazdırır
		System.out.println(kelime);}
		
		System.out.println(mesaj.toLowerCase()); //hepsini kucuk harfe cevirir
		System.out.println(mesaj.toUpperCase()); //buyuk harfe cevirir
		
		String mesaj2="  bugün hava çok güzel.  ";
		System.out.println(mesaj2.trim()); //bastaki ve sondaki boslukları kaldırır 
	}

}
