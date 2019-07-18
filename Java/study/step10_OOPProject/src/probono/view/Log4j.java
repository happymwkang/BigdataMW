package probono.view;

public class Log4j {
	private static Log4j log = new Log4j();
	
	private Log4j() {}
	
	public static Log4j getInstance() {
		return log;
	}

}
