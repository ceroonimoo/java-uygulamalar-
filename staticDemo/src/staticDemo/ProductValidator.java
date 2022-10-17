package staticDemo;

public class ProductValidator {//ana class static olamaz
	static {
		System.out.println("static yapıcı blok çalıştı");
	}
	public ProductValidator(){
		System.out.println("yapıcı blok çalıştı");
	}
	public static boolean isValid(Product product) { //public static boolean olursa direkt metod class ismiyle çagırılır
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	public void birŞey() {
		
	}
	public static class baskaBirClass { //inner class
		public static void sil() {
			
		}
	}
}
