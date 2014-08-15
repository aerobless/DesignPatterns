package ch.theowinter.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeExample {
	interface PrototypeCapable{
		PrototypeCapable clone();
	}
	
	static class Test implements PrototypeCapable {
		public PrototypeCapable clone() {
			return new Test();
		}
		
		public String showId(){
			return "first test";
		}
	}
	
	static class Test2 implements PrototypeCapable {
		public PrototypeCapable clone() {
			return new Test2();
		}
		
		public String showId(){
			return "second test";
		}
	}
	
	static class Test3 implements PrototypeCapable {
		public PrototypeCapable clone() {
			return new Test3();
		}
		
		public String showId(){
			return "third test";
		}
	}
	
	static class Factory {
		private static Map<String, PrototypeCapable> prototypes = new HashMap<String, PrototypeCapable>();
	    static {
	    	prototypes.put("Test", new Test() );
	    	prototypes.put("Test2", new Test2() );
	    	prototypes.put("Test3", new Test3() );
	    }
	    
	    public static PrototypeCapable makeObject(String s){
	    	return (PrototypeCapable)prototypes.get(s).clone();
	    }
	}
	
	public static void main(String[] args){
		Test test = (Test)Factory.makeObject("Test");
		System.out.println(test.showId());
	}
}