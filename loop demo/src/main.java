
public class main {

	public static void main(String[] args) {
		//for dongusuyle çift sayılar
		for(int i=2;i<10;i+=2) {
			System.out.println(i);
		}
		System.out.println("for döngüsü bitti");
		
		//while dongusuyle cift sayılar
		int i=2;
		while(i<10) {
			System.out.println(i);
			i+=2;//bunu yazmazsak sonsuz döngüye girer
		}
		System.out.println("while döngüsü bitti");
		
		//do while döngüsüyle tek sayılar
		int j=1;
		do {
			System.out.println(j);
			j+=2;
		}while(j<10);
			System.out.println("do while döngüsü bitti");
	}

}
