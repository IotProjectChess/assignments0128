package chess;

public class King extends Pin {
	King(){}
	King(int x, int y){
		super(x, y);
	}

	@Override
	void canmove() {
		System.out.println("킹의 이동가능한 곳은 : ");

		kingmove(1,0);
		kingmove(1,1);
		kingmove(1,-1);
		kingmove(0,1);
		kingmove(0,-1);
		kingmove(-1,1);
		kingmove(-1,0);
		kingmove(-1,-1);

	}


	private void kingmove(int xm, int ym) {
		
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
