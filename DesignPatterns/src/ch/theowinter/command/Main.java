package ch.theowinter.command;

public class Main {
	
	public void main(String[] args) {
		BlackWhitePrinter blackWhitePrinter = new BlackWhitePrinter();
		ColorPrinter colorPrinter = new ColorPrinter();
		PDFPrinter pdfPrinter = new PDFPrinter();
		
		Secretary secretary = new Secretary();
		Bossman boss = new Bossman();
		Programmer progger = new Programmer();
		secretary.executePrintCommand("yolo.");
		secretary.setPrintCommand(new ColorPrintCommand(colorPrinter));
		secretary.executePrintCommand("yolololo.");
	}
	
	
}
