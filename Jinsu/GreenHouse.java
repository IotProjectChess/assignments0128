package Chapter07.practice;

public class GreenHouse extends House{
	GreenHouse(int room, int livingRoom, int toilet){
		setting(room,livingRoom,toilet);
	}
	public void cook(){ System.out.println("������"); }
	public void movie() { System.out.println("��ȭ���� : 1987");}
	public void taxes() { System.out.println("�ʷ��� ������ ��� : 30000��");}

}
