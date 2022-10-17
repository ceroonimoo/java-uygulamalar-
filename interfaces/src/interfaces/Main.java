package interfaces;

public class Main {

	public static void main(String[] args) {
		//ICustomerDal customerDal=new ICustomerDal(); interfaceler de abstractlar gibi newlenemez
		ICustomerDal customerDal=new OracleCustomerDal(); //bu şekilde newlenebilir
		CustomerManager customerManager=new CustomerManager(new OracleCustomerDal()); //parantezin içi 1. yontemde boş, polimorphismin interfacelerle uygulanması
		//customerManager.customerDal=new OracleCustomerDal(); 1. yontem
		customerManager.add();
	}

}
