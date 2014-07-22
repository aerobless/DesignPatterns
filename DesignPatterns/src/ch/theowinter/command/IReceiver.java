package ch.theowinter.command;

interface IReceiver {

}

class ColorPrinter implements IReceiver {
	public void print(String document){
		System.out.println(document);
	}
}

class PDFPrinter implements IReceiver {
	public void save(String document){
		System.out.println(document);
	}
}

class BlackWhitePrinter implements IReceiver {
	public void print(String document){
		System.out.println(document);
	}
	public void configure(){}
}