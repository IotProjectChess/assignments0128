public class BlueHouse extends House {
	// �Ķ��� : ������
	// �Ķ���s : ��3, �Ž�, ȭ���1
	// �Ķ��� : 15000
	
	//�丮�� ���
	private String cook = "lobster";
	// �� ����
	private int room = 3;
	// �Ž� ����
	private int livingRoom = 1;
	// ȭ��� ����
	private int toilet = 1;
	
	private int PublicImposts = 15000;
	
	// �⺻ ������
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
