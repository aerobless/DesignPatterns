package ch.theowinter.chainOfResponsibility;

import java.util.Random;

//BROKEN - DOESN'T WORK

class Handler {
	private static Random random = new Random();
	private static int next = 1;
	private int id = next++;
	private Handler nextHandler;
	
	public void add(Handler nextHandler){
		if(nextHandler == null){
			this.nextHandler = nextHandler;
		} else {
			this.nextHandler.add(nextHandler);
		}
	}
	
	public void wrap_around(Handler root){
		if(nextHandler == null){
			nextHandler = root;
		} else {
			nextHandler.wrap_around(root);
		}
	}
	
	public void handle(int num){
		if(random.nextInt(4) != 0){
			System.out.println(id + "-busy ");
			nextHandler.handle(num);
		} else {
			System.out.println(id + "-handled"+num);
		}
	}
}

public class ChainOfResponsibility {

	public static void main(String[] args) {

		Handler chain_root = new Handler();
		chain_root.add(new Handler());
		chain_root.add(new Handler());
		chain_root.add(new Handler());
		chain_root.add(new Handler());
		chain_root.wrap_around(chain_root);
		for(int i = 1; i<10; i++){
			chain_root.handle(i);
		}
	}
}
