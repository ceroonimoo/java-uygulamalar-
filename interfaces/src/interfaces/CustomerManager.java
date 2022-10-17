package interfaces;

public class CustomerManager {
	ICustomerDal customerDal; //1. yontem
	
	public CustomerManager(ICustomerDal customerDal) {//2. yontem
		this.customerDal=customerDal;
	}
	
	public void add() {
		customerDal.Add();
	}
}
