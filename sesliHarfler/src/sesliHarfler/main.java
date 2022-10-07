package sesliHarfler;

public class main {

	public static void main(String[] args) {
		char harf='e'; 
		switch(harf) {
		case 'a':
		case 'ı':
		case 'o':
		case 'u': System.out.println("kalın sesli harftir");
				break;
				default: System.out.println("ince sesli harftir");
		}
	}

}
