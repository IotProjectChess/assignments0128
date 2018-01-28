package Chapter07.practice;

public class GreenHouse extends House{
	GreenHouse(int room, int livingRoom, int toilet){
		setting(room,livingRoom,toilet);
	}
	public void cook(){ System.out.println("샐러드"); }
	public void movie() { System.out.println("영화감상 : 1987");}
	public void taxes() { System.out.println("초록집 공과금 출력 : 30000원");}

}
