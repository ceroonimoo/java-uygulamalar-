package classesWithAttributes;

public class main {

	public static void main(String[] args) {
		Product product=new Product();
		product.setName("laptop");
		product.setId(1);
		product.setDescription("Asus laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product); 
		System.out.println(product.getKod());
	} 

}
