package ch.theowinter.facade;

public class Main {
	Secretary anne = new Secretary();
	
	public void main(String[] args){
		anne.writeLetterForClient("hello dear client...");
	}
}
