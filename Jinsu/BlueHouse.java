package Chapter07.practice;

public class BlueHouse extends House {

	BlueHouse(int room, int livingRoom, int toilet){
		setting(room,livingRoom,toilet);
	}
	public void cook(){ System.out.println("������"); }
	public void taxes() { System.out.println("�Ķ��� ������ ��� : 15000��");}
}
