package chapter07.practice;

public class GreenHouse extends House{
	
	GreenHouse(){
		this.room = 4;
		this.livingRoom = 2;
		this.toilet = 2;
	}

	@Override
	public void food() {
		System.out.println("�ʷ��������� ������");
	}

	@Override
	public void tax() {
		System.out.println("�ʷ��� �������� 30000");
	}

	public void movie(String title) {
		System.out.println("�ʷϹ濵ȭ������ "+title);
	}
}
