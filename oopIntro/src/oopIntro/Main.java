package oopIntro;

public class Main {

	public static void main(String[] args) {
		Product product1=new Product(1,"Lenovo V14",15000,"16 GB ram",10,13500);
		
		Product product2=new Product();
		product2.id=2;
		product2.name="lenovo V14";
		product2.unitPrice=16000;
		product2.detail="32 GB ram";
		product2.discount=10;
		product2.unitPriceAfterDiscount=14400;	
		
		Product product3=new Product();
		product3.id=3;
		product3.name="Hp 5";
		product3.unitPrice=10000;
		product3.detail="8 GB ram";
		product3.discount=10;
		
	}

}
