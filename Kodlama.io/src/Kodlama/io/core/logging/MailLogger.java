package Kodlama.io.core.logging;

public class MailLogger implements ILogger {

	@Override
	public void log(String data) {
		System.out.println("mail has been sent: "+data);
	}

}
