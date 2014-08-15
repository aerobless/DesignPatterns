package ch.theowinter.proxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//1. Create a "wrapper" for a remote, or expensive, or sensitive target
//2. Encapsulate the complexity/overhead of the target in the wrapper
//3. The client deals with the wrapper
//4. The wrapper delegates to the target
//5. To support plug-compatibility of wrapper and target, create an interface

interface SocketInterface {
	String readLine();
	void writeLine(String str);
	void dispose();
}

public class ProxyExample {

	public static void main(String[] args) {
		SocketInterface socket = new SocketProxy("127.0.0.1", 8189, args[0].equals("first") ? true : false);
		
		String str = null;
		boolean skip = true;
		while(true){
			if(args[0].equals("second") && skip){
				skip = !skip;
			} else {
				str = socket.readLine();
				System.out.println("Receive - "+str);
				if(str.equals("quit")) break;
			}
			System.out.println("Send ----");
			socket.writeLine(str);
			if(str.equals("quit")) break;
		}
		socket.dispose();
	}
}

class SocketProxy implements SocketInterface {
	private Socket socket;
	private BufferedReader in;
	private PrintWriter out;
	
	public SocketProxy(String host, int port, boolean wait){
		try{
			if(wait){
				ServerSocket server = new ServerSocket(port);
				socket = server.accept();
			} else {
				socket = new Socket(host, port);
				in = new BufferedReader(new InputStreamReader(
						socket.getInputStream()));
				out = new PrintWriter(socket.getOutputStream(), true);
			}
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	
	@Override
	public String readLine() {
		String str = null;
		try {
			str = in.readLine();
		} catch (IOException e){
			e.printStackTrace();
		}
		return str;
	}

	@Override
	public void writeLine(String str) {
		out.println(str);
	}

	@Override
	public void dispose() {
		try{
			socket.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}