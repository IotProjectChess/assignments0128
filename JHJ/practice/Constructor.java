package chapter07.practice;

public class Constructor {
	public static void main(String[] args) {
		House r = new RedHouse();
		House g = new GreenHouse();
		House b = new BlueHouse();
		GreenHouse g2 = new GreenHouse();
		
		r.food();
		g.food();
		b.food();
		
		r.tax();
		g.tax();
		b.tax();

		System.out.println("Red	방, 거실, 화장실의 개수 : "+r.room+" "+r.livingRoom+" "+r.toilet);
		System.out.println("Green	방, 거실, 화장실의 개수 : "+g.room+" "+g.livingRoom+" "+g.toilet);
		System.out.println("Blue	방, 거실, 화장실의 개수 : "+b.room+" "+b.livingRoom+" "+b.toilet);
		
		g2.movie("1987");
	}
}
