package ch.theowinter.flyweight;

class Things {
	private static int num = 0;
	private int row, col;
	
	public Things(int maxPerRow){
		row = num / maxPerRow;
		col = num % maxPerRow;
		num++;
	}
	
	void report() {
		System.out.print(" "+row+col);
	}
}

public class FlyweightExample {
	public static final int ROWS = 10, COLS = 100;

	public static void main(String[] args) {
		Things[][] matrix = new Things[ROWS][COLS];
		for (int i=0; i<ROWS; i++){
			for(int j=0; j< COLS; j++){
				matrix[i][j] = new Things(COLS);
			}
		}
		for (int i=0; i<ROWS; i++){
			for(int j=0; j< COLS; j++){
				matrix[i][j].report();
			}
			System.out.println();
		}
	}
}
