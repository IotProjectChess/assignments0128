package Chapter07.practice;

public class Constructor {
	public static void main(String[] args) {
		BlueHouse blue = new BlueHouse(3,1,1);
		RedHouse red = new RedHouse(3,1,2);
		GreenHouse green = new GreenHouse(4, 1, 2);
		
		blue.cook();
		red.cook();
		green.cook();
		
		blue.taxes();
		red.taxes();
		green.taxes();
		
		green.movie();
		
	}
}
