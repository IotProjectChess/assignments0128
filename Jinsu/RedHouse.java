package Chapter07.practice;

public class RedHouse extends House {
	RedHouse(int room, int livingRoom, int toilet){
		setting(room,livingRoom,toilet);
	}
	public void cook() { System.out.println("치킨");}
	public void taxes() { System.out.println("빨간집 공과금 출력 : 20000원");}
}
