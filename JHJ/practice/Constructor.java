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

		System.out.println("Red	��, �Ž�, ȭ����� ���� : "+r.room+" "+r.livingRoom+" "+r.toilet);
		System.out.println("Green	��, �Ž�, ȭ����� ���� : "+g.room+" "+g.livingRoom+" "+g.toilet);
		System.out.println("Blue	��, �Ž�, ȭ����� ���� : "+b.room+" "+b.livingRoom+" "+b.toilet);
		
		g2.movie("1987");
	}
}
