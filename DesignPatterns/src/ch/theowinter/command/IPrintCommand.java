package ch.theowinter.command;

interface IPrintCommand {
	
	public void execute(String document);

}

class BlackWhitePrintCommand implements IPrintCommand{
	private BlackWhitePrinter printer;
	
	public BlackWhitePrintCommand(BlackWhitePrinter printer){
		this.printer = printer;
	}
	
	@Override
	public void execute(String document) {
		printer.configure();
		printer.print(document);
	}
}

class ColorPrintCommand implements IPrintCommand{
	private ColorPrinter printer;
	
	ColorPrintCommand(ColorPrinter aPrinter) {
		super();
		printer = aPrinter;
	}

	@Override
	public void execute(String document) {
		printer.print(document);
	}
}

class PdfPrintCommand implements IPrintCommand{
	private PDFPrinter printer;
	
	private PdfPrintCommand(PDFPrinter aPrinter) {
		super();
		printer = aPrinter;
	}
	
	@Override
	public void execute(String document) {
		printer.save(document);
	}
}