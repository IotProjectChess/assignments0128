package chess;

public class Knight extends Pin {
	Knight(){}
	Knight(int x, int y){
		super(x, y);
	}

	@Override
	void canmove() {
		System.out.println("나이트가 이동가능한 곳은 : ");
		knightmove(2,1);
		knightmove(2,-1);
		knightmove(-2,1);
		knightmove(-2,-1);
		knightmove(1,2);
		knightmove(1,-2);
		knightmove(-1,2);
		knightmove(-1,-2);
	}


	private void knightmove(int xm, int ym) {
		
		int x = getX() + xm;
		int y = getY() + ym;

		if((x < 0) || (y < 0) || (x > 7) || (y > 7)) {}
		else {
			if(Chess.board[x][y]/10 == 0) {
				System.out.println("board["+x+"]["+y+"]");
			}
			else if(Chess.board[x][y]/10 == 2) {
				System.out.println("board["+x+"]["+y+"] --상대편말을먹을수있음");
			}
		}
	}
}
