package ch.theowinter.facade;

public class Secretary {
	Computer computer = new Computer();
	Printer printer = new Printer();
	
	public void writeLetterForClient(String text){
		computer.turnComputerOn();
		computer.openWord();
		computer.typeTextIntoWord(text);
		printer.printDocument();
		
		// .. etc. does all the work, user doesn't need to know about
		
		sendLetterToReceiver();
	}

	private void sendLetterToReceiver() {
		System.out.println("Letter successfully sent");
	}
	
}
