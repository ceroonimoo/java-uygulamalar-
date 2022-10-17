package abstractDemo;

public class Main {
	public static void main(String[] args) {
		CustomerManager customerManager=new CustomerManager();
		//customerManager.getCustomers(); hata verir çünkü BaseDatabaseManagerdan alıyor o da abstract
		customerManager.databaseManager=new OracleDatabaseManager(); //ya da sql veya mysql
		customerManager.getCustomers();
	}
}
