package oop1;

public class main {

	public static void main(String[] args) {
		Product product1=new Product();
		product1.name="Delonghi Kahve Makinesi";
		product1.unitPrice=7500;
		product1.discount=7;
		product1.imageUrl="bilmemne.jpg";
		product1.unitsInStock=3;
		
		Product product2=new Product();
		product2.name="Smeg Kahve Makinesi";
		product2.unitPrice=6500;
		product2.discount=8;
		product2.imageUrl="bilmemne2.jpg";
		product2.unitsInStock=2;
		
		Product product3=new Product();
		product3.name="Kitchen Aid Kahve Makinesi";
		product3.unitPrice=4500;
		product3.discount=9;
		product3.imageUrl="bilmemne3.jpg";
		product3.unitsInStock=4;
		
		Product[] products= {product1,product2,product3};
		for(Product product:products) {
			System.out.println(product.name);
		}

	}
}
