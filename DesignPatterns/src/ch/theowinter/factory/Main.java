package ch.theowinter.factory;

public class Main {

	public static void main(String[] args){
		SoftwareShop msShop = new MicrosoftOfficeFactory();
		Software word = msShop.getApp("Wordprocessing");
		word.start();
		
		System.out.println("--------------------------------");
		
		SoftwareShop appleShop = new AppleOfficeFactory();
		Software pages = appleShop.getApp("Wordprocessing");
		pages.start();
	}
}
