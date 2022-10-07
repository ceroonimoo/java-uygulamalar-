package mükemmelSayı;

public class main {

	public static void main(String[] args) {
		int number=5; //mükemmel sayı:bölenlerinin toplamı kendisine eşit olan sayıdır. örn:6
		int total=0;
		
		for(int i=1;i<number;i++) {
			if(number%i==0)
				total=total+i;
		}
		if(total==number)
			System.out.println("mükemmel sayıdır");
		else
			System.out.println("mükemmel sayı değildir");
	}

}
