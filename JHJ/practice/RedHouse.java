package chapter07.practice;

public class RedHouse extends House {
	
	RedHouse(){
		this.room = 3;
		this.livingRoom = 2;
		this.toilet = 2;

	}

	@Override
	public void food() {
		System.out.println("빨간집음식은 치킨");
	}

	@Override
	public void tax() {
		System.out.println("빨간집 공과금은 20000");
	}
}
