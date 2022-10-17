package abstractDemo;

public class CustomerManager {
	BaseDatabaseManager databaseManager;
	
	public void getCustomers() {
		databaseManager.getData(); //hem oracle hem sql secebilmemiz icin 
	}
}
