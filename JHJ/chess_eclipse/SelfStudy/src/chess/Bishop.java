package chess;

public class Bishop extends Pin{

	boolean[] flag = {true,true,true,true};

	Bishop(){}
	Bishop(int x, int y){
		super(x, y);
	}
	@Override
	public void canmove() {
		System.out.println("비숍이 이동가능한 곳은 : ");

		//이동가능한 칸 1~6
		for(int i=1; i<=7; i++) {
			bishopmove(i,i,0);
			bishopmove(i,-i,1);
			bishopmove(-i,i,2);
			bishopmove(-i,-i,3);
		}

	}


	private void bishopmove(int mx, int my, int f) {
		
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