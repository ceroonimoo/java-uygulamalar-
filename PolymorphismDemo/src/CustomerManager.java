
public class CustomerManager {
	private BaseLogger logger;// database'e loglanmayacaksa
	
	public CustomerManager(BaseLogger logger) {//constructor oluşturulur->newlerken çalışıyor
		this.logger=logger;
	}
	public void Add() {
		System.out.println("müşteri eklendi");
		/*DatabaseLogger logger=new DatabaseLogger();
		logger.Log("Log nesajı");*/ //database'e loglama yapacaksak
		this.logger.Log("log mesajı");
	}
}
