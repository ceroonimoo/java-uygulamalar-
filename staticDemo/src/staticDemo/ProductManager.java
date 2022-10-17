package staticDemo;

public class ProductManager {
	public void add(Product product) {
		//ProductValidator validator=new ProductValidator(); //bunu yazmayıp
		//if(validator.isValid(product)) { //buradaki ifin içine ProductValidator.isValid yazabilemk icin booleandan once static yazarız
		if(ProductValidator.isValid(product)) {
		System.out.println("eklendi");
		}
		else {
			System.out.println("ürün bilgileri geçersizdir");
		}
		ProductValidator productValidator=new ProductValidator();
		productValidator.birŞey();
	}
}
