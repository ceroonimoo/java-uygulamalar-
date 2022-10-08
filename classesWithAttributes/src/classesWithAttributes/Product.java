package classesWithAttributes;

public class Product {
	public Product() {
		System.out.println("yapıcı blok çalıştı");
	}
	private int id;
	 String name;
	 String description;
	 double price;
	 int stockAmount;
	 String renk;
	 String kod;
	 
	//getter
	public int getId() {
		return id;
	}
	//setter
	public void setId(int id) {
		this.id=id;
		}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public String getKod() {
		return this.name.substring(0,1) +id;
	}
	public void setKod(String kod) {
		this.kod = kod;
	}}
	/*public String get_name() { yukarısı _id şeklinde isimlendirilecek
		return _name;
	}
	public void set_name(String name) {
		this._name = _name;
	}
	public String get_description() {
		return _description;
	}
	public void set_description(String description) {
		this._description = _description;
	}
	public double get_price() {
		return _price;
	}
	public void set_price(double price) {
		this._price = _price;
	}
	public int get_stockAmount() {
		return _stockAmount;
	}
	public void set_stockAmount(int stockAmount) {
		this._stockAmount = _stockAmount;
	}
	public String get_renk() {
		return _renk;
	}
	public void set_renk(String renk) {
		this._renk = _renk;
	}
	public String get_kod() {
		return _kod;
	}
	public void set_kod(String kod) {
		this._kod = _kod;
	}

	
}*/
