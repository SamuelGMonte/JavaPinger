package pacote;
import java.net.*;

public class GetLatency {
	public GetLatency() {		
		PingTest ping = new PingTest();
		InetAddress inetAddress = ping.getInetAddress();
		
		try {
			long finishTime;
			long startTime = System.currentTimeMillis();
		
			if (inetAddress.isReachable(2000)) {
				finishTime = System.currentTimeMillis();
				long result = finishTime - startTime;
				System.out.println("a latencia e: " + result + "ms");
			}
			if (ping.getInetAddress().equals(InetAddress.getByName("127.0.0.1"))) {
				System.out.println("Selecione um endereco de IP");
			}	
		} catch (Exception e) {
			System.out.println("erro");
		}

	}
}
