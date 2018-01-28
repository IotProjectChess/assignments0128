package chapter07.practice;

public class BlueHouse extends House{

	BlueHouse(){
		this.room = 3;
		this.livingRoom = 1;
		this.toilet = 1;
	}
	

	@Override
	public void food() {
		System.out.println("파랑집음식은 랍스타");
	}

	@Override
	public void tax() {
		System.out.println("파란집 공과금은 15000");
	}
}
