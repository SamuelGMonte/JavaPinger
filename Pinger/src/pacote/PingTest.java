package pacote;

import java.util.*;
import java.net.*;

public class PingTest{

	private String pingResult;
	String ipAddress;
	InetAddress inetAddress;
	Scanner input;
	String host;
	public PingTest(){
		System.out.println("Insira um endereco de ip para comecar: ");
		try {		
			input = new Scanner(System.in);
			host = input.nextLine();
			ipAddress = InetAddress.getByName(host).getHostName();
			try {
				inetAddress = InetAddress.getByName(ipAddress);
				if (inetAddress.equals(InetAddress.getByName("127.0.0.1")) || inetAddress == null) {
					pingResult = "Selecione um endereco de IP";
					   System.err.println("Endereco vazio, fechando programa");
					   System.exit(0);
				}	
				else {				
					
					if (inetAddress.isReachable(2000)) {
						
						pingResult = "Ping concluido com sucesso no ip: " + inetAddress.getHostAddress();
						System.exit(0);
					} 
					else {
						
						pingResult = "Ping falhou no ip: " + inetAddress.getHostAddress();
						System.exit(0);
						}	
					}
				} catch (UnknownHostException e) {
					
					pingResult = "Host nao disponivel";
					System.exit(0);
				}
					if (host.matches("\\d+")) {
					Thread.sleep(null);	
						pingResult = "endereco ip invalido";
						System.exit(0);
					}
			}
			catch (Exception ex){
				pingResult = "erro";
			}
			System.out.println(pingResult);

			
	}

	
	public InetAddress getInetAddress() {
		return inetAddress;
	}
	
}
