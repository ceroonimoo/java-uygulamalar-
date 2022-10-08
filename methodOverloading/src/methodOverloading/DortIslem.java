package methodOverloading;

public class DortIslem {

	public int topla(int sayi1, int sayi2) {
		return sayi1+sayi2;
	}
	public int topla(int sayi1, int sayi2,int sayi3) {
		return sayi1+sayi2+sayi3; //method overloading: aynı methoddan 2 tane olmasına rağmen karışmıyorlar
	}
}
