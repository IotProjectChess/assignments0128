package chapter07.practice;

public class GreenHouse extends House{
	
	GreenHouse(){
		this.room = 4;
		this.livingRoom = 2;
		this.toilet = 2;
	}

	@Override
	public void food() {
		System.out.println("초록집음식은 샐러드");
	}

	@Override
	public void tax() {
		System.out.println("초록집 공과금은 30000");
	}

	public void movie(String title) {
		System.out.println("초록방영화제목은 "+title);
	}
}
