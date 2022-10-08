package methods;

public class main {
	
	public static void main(String[] args) {
		sayıBulmaca(); //method çağırmak

	}


	public static void sayıBulmaca() {
		int[] sayılar=new int[]{1,2,5,7,9,0};
		int aranacak=5;
		boolean varMı=false;
		for(int sayı:sayılar) {
			if(sayı==aranacak) {
				varMı=true;
			break;} 
		}
		if(varMı) {
		mesajVer(aranacak);
		}
		else {
			System.out.println("sayı mevcut değildir:" +aranacak);
		}

	}
	public static void mesajVer(int aranacak) {
		System.out.println("sayı mevcuttur:" +aranacak);
	}
}