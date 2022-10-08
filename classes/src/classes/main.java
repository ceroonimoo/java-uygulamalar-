package classes;

public class main {

	public static void main(String[] args) {
		CustomerManager customerManager=new CustomerManager();
		CustomerManager customerManager2=new CustomerManager();
		customerManager=customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		int sayı1=10;
		int sayı2=20;
		sayı2=sayı1;
		sayı1=30;
		System.out.println(sayı2);
	}

}
