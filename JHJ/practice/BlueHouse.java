package chapter07.practice;

public class BlueHouse extends House{

	BlueHouse(){
		this.room = 3;
		this.livingRoom = 1;
		this.toilet = 1;
	}
	

	@Override
	public void food() {
		System.out.println("�Ķ��������� ����Ÿ");
	}

	@Override
	public void tax() {
		System.out.println("�Ķ��� �������� 15000");
	}
}
