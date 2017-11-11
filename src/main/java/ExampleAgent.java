import java.lang.instrument.Instrumentation;

public class ExampleAgent {
	
	public static void premain(String args, Instrumentation inst) {
		System.out.println("Starting instrumentation...");
	}
}
