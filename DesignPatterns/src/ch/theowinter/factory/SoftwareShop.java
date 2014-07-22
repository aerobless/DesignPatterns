package ch.theowinter.factory;

public abstract class SoftwareShop {
	
	public Software getApp(String applicationName){
		
		Software software = createSoftware(applicationName);
		
		software.packing();
		software.labeling();
		
		return software;
	}
	
	protected abstract Software createSoftware(String applicationName);
}

class MicrosoftOfficeFactory extends SoftwareShop{

	@Override
	protected Software createSoftware(String aApplicationName) {
		Software software;
		if (aApplicationName.equals("Wordprocessing")){
			software = new Word();
		} else {
			software = new Excel();
		}
		return software;
	}
}

class AppleOfficeFactory extends SoftwareShop{

	@Override
	protected Software createSoftware(String aApplicationName) {
		Software software;
		if (aApplicationName.equals("Wordprocessing")){
			software = new Pages();
		} else {
			software = new Numbers();
		}
		return software;
	}
}