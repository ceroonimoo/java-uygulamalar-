package Kodlama.io.core.logging;

public class FileLogger implements ILogger {

	@Override
	public void log(String data) {
		System.out.println("logged to the file: "+data);
	}

}
