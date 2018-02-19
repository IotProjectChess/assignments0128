package chess;

public class Pawn extends Pin {
	Pawn(){}
	Pawn(int x, int y){
		super(x, y);
	}

	@Override
	void canmove() {
		System.out.println("폰이 이동가능한 곳은 : ");

		if((getX()-1 < 0) || (getY() < 0) || (getX()-1 > 7) || (getY() > 7)) {}
		else {
			if((getX()==6)&&(Chess.board[getX()-2][getY()]/10 == 0))
				System.out.println("board["+(getX()-2)+"]["+(getY())+"]");
			if(Chess.board[getX()-1][getY()]/10 == 0) {
				System.out.println("board["+(getX()-1)+"]["+(getY())+"]");
			}
		}
		if((getX()-1 < 0) || (getY()-1 < 0) || (getX()-1 > 7) || (getY()-1 > 7)) {}
		else {
			if(Chess.board[getX()-1][getY()-1]/10 == 2) {
				System.out.println("board["+(getX()-1)+"]["+(getY()-1)+"] --상대편말을먹을수있음");
			}
		}
		if((getX()-1 < 0) || (getY()+1 < 0) || (getX()-1 > 7) || (getY()+1 > 7)) {}
		else {
			if(Chess.board[getX()-1][getY()+1]/10 == 2) {
				System.out.println("board["+(getX()-1)+"]["+(getY()+1)+"] --상대편말을먹을수있음");
			}
		}
	}

}
