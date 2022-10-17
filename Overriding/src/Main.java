
public class Main {

	public static void main(String[] args) {
		/*OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
		System.out.println(ogretmenKrediManager.Hesapla(1000));*/ //extends sayesinde oluyor
	
		BaseKrediManager[] krediManagers=new BaseKrediManager[] {new OgretmenKrediManager(),new TarımKrediManager(),new OgrenciKrediManager()};
		for(BaseKrediManager krediManager:krediManagers) {
			System.out.println(krediManager.Hesapla(1000)); //bunu hem OgretmenKrediManager hem de TarımKrediManager için hesaplayacak->polymorphism
		}
	
	}

}
