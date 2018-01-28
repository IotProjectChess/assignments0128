public class Constructor extends House{
	public static void main(String[] args) {
		//설계자 이 사람이 다 실행함.
		
		// 방 개수
		int room;
		// 거실 개수
		int livingRoom;
		// 화장실 개수
		int toilet;
		
		
		
		BlueHouse BH = new BlueHouse();
		System.out.println(BH.getCook());
		System.out.println(BH.getPublicImposts());
	}
}
