package chess;

public class Queen extends Pin {
	
	boolean[] flag= {true,true,true,true,true,true,true,true};

	Queen(){}
	Queen(int x, int y){
		super(x, y);
	}

	@Override
	void canmove() {
		System.out.println("퀸이 이동가능한 곳은 : ");

		for(int i=1; i<=7; i++) {
			queenmove(i,i, 0);
			queenmove(i,-i, 1);
			queenmove(i,0, 2);
			queenmove(0,i, 3);
			queenmove(0,-i, 4);
			queenmove(-i,i, 5);
			queenmove(-i,-i, 6);
			queenmove(-i,0, 7);


		}
	}
	private void queenmove(int xm, int ym, int f) {

		int x = getX() + xm;
		int y = getY() + ym;

		//3시방향
		if(flag[f]==true) {
			if((x < 0) || (y < 0) || (x > 7) || (y > 7)) {
				flag[f] = false;
			}
			else {
				if(Chess.board[x][y]/10 == 0) {
					System.out.println("board["+x+"]["+y+"]");
				}
				else{
					if(Chess.board[x][y]/10 == 2) {
						System.out.println("board["+x+"]["+y+"] --상대편말을먹을수있음");
					}
					flag[f] = false;
				}
			}
		}
	}
	
}