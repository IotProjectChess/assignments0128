package chapter07.practice;

public class RedHouse extends House {
	
	RedHouse(){
		this.room = 3;
		this.livingRoom = 2;
		this.toilet = 2;

	}

	@Override
	public void food() {
		System.out.println("������������ ġŲ");
	}

	@Override
	public void tax() {
		System.out.println("������ �������� 20000");
	}
}
