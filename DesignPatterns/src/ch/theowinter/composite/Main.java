package ch.theowinter.composite;

public class Main {

	public static void main(String[] args) {
		SectionChief sec = new SectionChief("Hans Muster", 788522266);
		sec.add(new AtomEmployee("XYZ. Alien", 8327423));
		sec.add(new AtomEmployee("BBB. Alien", 83273));
		sec.add(new AtomEmployee("LOOL. Alien", 345342));
		
		SectionChief sec2 = new SectionChief("Dumbo Gandalf", 788522266);
		sec2.add(new AtomEmployee("Hello. World", 345342));
		sec.add(sec2);
		sec.print("");
	}

}
