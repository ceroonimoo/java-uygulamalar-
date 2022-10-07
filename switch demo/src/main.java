
public class main {

	public static void main(String[] args) {
		char grade='A';
		
		switch(grade) {
		case 'A':	System.out.println("mükemmel:gectiniz");
		break;
		case 'B': //b veya c alırsa iyi:gectiniz cıktısı verecek
		case 'C':	System.out.println("iyi:gectiniz");
		break;
		case 'D':	System.out.println("fena değil:gectiniz");
		break;
		case 'F':	System.out.println("maalesef kaldınız");
		break;
		default: System.out.println("gecersiz not girdiniz");
		}

	}

}
