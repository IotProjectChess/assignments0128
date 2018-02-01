package chess;

public class Rook extends Pin {

	boolean[] flag = {true,true,true,true};

	Rook(){}
	Rook(int x, int y){
		super(x, y);
	}

	@Override
	void canmove() {
		System.out.println("룩 이동가능한 곳은 : ");

		for(int i=1; i<=7; i++) {

			rookmove(i,0,0);
			rookmove(-i,0,1);
			rookmove(0,i,2);
			rookmove(0,-i,3);


		}
	}


	private void rookmove(int mx, int my, int f) {

		int x = getX() + mx;
		int y = getY() + my;

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