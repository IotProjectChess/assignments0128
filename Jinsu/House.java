package Chapter07.practice;

public abstract class House {
	private int room;
	private int livingRoom;
	private int toilet;
	
	House(){}
	
	public void setting(int room, int livingRoom, int toilet){
		this.room = room;
		this.livingRoom = livingRoom;
		this.toilet = toilet;
	}
	public abstract void taxes();
	public abstract void cook();
}
