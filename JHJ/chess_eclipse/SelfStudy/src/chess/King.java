package chess;

public class King extends Pin {
	King(){}
	King(int x, int y){
		super(x, y);
	}
	
	@Override
	void canmove() {
		// TODO Auto-generated method stub
		System.out.println("킹의 이동가능한 곳은 : ");
//한칸이동

		if((getX()+1 < 0) || (getY() < 0) || (getX()+1 > 7) || (getY() > 7)) {}
		else {
			if(Chess.board[getX()+1][getY()]/10 == 0) {
				System.out.println("board["+(getX()+1)+"]["+(getY())+"]");
			}
			else{
				if(Chess.board[getX()+1][getY()+1]/10 == 2) {
					System.out.println("board["+(getX()+1)+"]["+(getY())+"] --상대편말을먹을수있음");
				}
			}
		}
		
		if((getX() < 0) || (getY()+1 < 0) || (getX() > 7) || (getY()+1 > 7)) {}
		else {
			if(Chess.board[getX()][getY()+1]/10 == 0) {
				System.out.println("board["+(getX())+"]["+(getY()+1)+"]");
			}
			else{
				if(Chess.board[getX()][getY()+1]/10 == 2) {
					System.out.println("board["+(getX())+"]["+(getY()+1)+"] --상대편말을먹을수있음");
				}
			}
		}
		
		if((getX()-1 < 0) || (getY() < 0) || (getX()-1 > 7) || (getY() > 7)) {}
		else {
			if(Chess.board[getX()-1][getY()]/10 == 0) {
				System.out.println("board["+(getX()-1)+"]["+(getY())+"]");
			}
			else{
				if(Chess.board[getX()-1][getY()]/10 == 2) {
					System.out.println("board["+(getX()-1)+"]["+(getY())+"] --상대편말을먹을수있음");
				}
			}
		}
		
		if((getX() < 0) || (getY()-1 < 0) || (getX() > 7) || (getY()-1 > 7)) {}
		else {
			if(Chess.board[getX()][getY()-1]/10 == 0) {
				System.out.println("board["+(getX())+"]["+(getY()-1)+"]");
			}
			else{
				if(Chess.board[getX()][getY()-1]/10 == 2) {
					System.out.println("board["+(getX())+"]["+(getY()-1)+"] --상대편말을먹을수있음");
				}
			}
		}
		}
}
