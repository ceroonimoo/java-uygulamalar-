package Kodlama.io.core.logging;

public class DatabaseLogger implements ILogger
{
	
	@Override
	public void log(String data) {
		System.out.println("logged to the database: "+data);
	}

}