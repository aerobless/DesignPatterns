package ch.theowinter.command;

interface Personnel {

	public void setPrintCommand(IPrintCommand printCommand);
	public void executePrintCommand(String printDocument);
}

class Secretary implements Personnel{
	private IPrintCommand printcommand;

	@Override
	public void executePrintCommand(String printDocument) {
		printcommand.execute(printDocument);
		
	}

	@Override
	public void setPrintCommand(IPrintCommand aPrintCommand) {
		printcommand = aPrintCommand;
	}
}

class Bossman implements Personnel{
	private IPrintCommand printcommand;

	@Override
	public void executePrintCommand(String printDocument) {
		printcommand.execute(printDocument);
		
	}
	@Override
	public void setPrintCommand(IPrintCommand aPrintCommand) {
		printcommand = aPrintCommand;
	}
}

class Programmer implements Personnel{
	private IPrintCommand printcommand;

	@Override
	public void executePrintCommand(String printDocument) {
		printcommand.execute(printDocument);
		
	}
	@Override
	public void setPrintCommand(IPrintCommand aPrintCommand) {
		printcommand = aPrintCommand;
	}
}