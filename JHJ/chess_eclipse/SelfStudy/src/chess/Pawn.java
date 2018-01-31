package chess;

public class Pawn extends Pin {
	Pawn(){}
	Pawn(int x, int y){
		super(x, y);
	}

	@Override
	void canmove() {
		// TODO Auto-generated method stub
		
	}
	//앞으로 한칸
	//대각선의말만먹을수 있다
	//처음에는 두칸이동가능
}
