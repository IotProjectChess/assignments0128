package Chapter07.practice;

public class BlueHouse extends House {

	BlueHouse(int room, int livingRoom, int toilet){
		setting(room,livingRoom,toilet);
	}
	public void cook(){ System.out.println("랍스터"); }
	public void taxes() { System.out.println("파란집 공과금 출력 : 15000원");}
}
