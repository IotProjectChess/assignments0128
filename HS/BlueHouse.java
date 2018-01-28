public class BlueHouse extends House {
	// 파란집 : 랍스터
	// 파란집s : 방3, 거실, 화장실1
	// 파란집 : 15000
	
	//요리명 출력
	private String cook = "lobster";
	// 방 개수
	private int room = 3;
	// 거실 개수
	private int livingRoom = 1;
	// 화장실 개수
	private int toilet = 1;
	
	private int PublicImposts = 15000;
	
	// 기본 생성자
	BlueHouse(){
	}
	
	public void setRoom(int room) {
		this.room = room;
	}
	public int getRoom() {
		return room;
	}
	public void setlivingRoom(int livingroom) {
		this.livingRoom = livingroom;
	}
	public int getlivingRoom() {
		return livingRoom;
	}	
	public void setToilet(int toilet) {
		this.toilet = toilet;
	}
	public int getToilet() {
		return toilet;
	}
	public void setPublicImposts(int PublicImposts) {
		this.PublicImposts = PublicImposts;
	}
	public int getPublicImposts() {
		return PublicImposts;
	}
	
}
