package chess;

public class Bishop extends Pin{
	Bishop(){}
	Bishop(int x, int y){
		super(x, y);
	}
	@Override
	public void canmove() {
		// TODO Auto-generated method stub
		System.out.println("비숍의 이동가능한 곳은 : ");
		//대각선
		//검은칸비숍은 검은칸의 비숍만 굥격가능

		// 이동하는 칸수제한
		boolean[] flag = {true,true,true,true};

		//이동가능한 칸 1~6
		for(int i=1; i<=6; i++) {

			//4시방향
			if(flag[0]==true) {
				if((getX()+i < 0) || (getY()+i < 0) || (getX()+i > 7) || (getY()+i > 7)) {
					flag[0] = false;
				}
				else {
					if(Chess.board[getX()+i][getY()+i]/10 == 0) {
						System.out.println("board["+(getX()+i)+"]["+(getY()+i)+"]");
					}
					else{
						if(Chess.board[getX()+i][getY()+i]/10 == 2) {
							System.out.println("board["+(getX()+i)+"]["+(getY()+i)+"] --상대편말을먹을수있음");
						}
						flag[0] = false;
					}
				}
			}

			//8시방향
			if(flag[1]==true) {
				if((getX()+i < 0) || (getY()-i < 0) || (getX()+i > 7) || (getY()-i > 7)) {
					flag[1] = false;
				}
				else {
					if(Chess.board[getX()+i][getY()-i]/10 == 0) {
						System.out.println("board["+(getX()+i)+"]["+(getY()-i)+"]");
					}
					else{
						if(Chess.board[getX()+i][getY()-i]/10 == 2) {
							System.out.println("board["+(getX()+i)+"]["+(getY()-i)+"] --상대편말을먹을수있음");
						}
						flag[1] = false;
					}
				}
			}

			//10시방향
			if(flag[2]==true) {
				if((getX()-i < 0) || (getY()+i < 0) || (getX()-i > 7) || (getY()+i > 7)) {
					flag[2] = false;
				}
				else {
					if(Chess.board[getX()-i][getY()+i]/10 == 0) {
						System.out.println("board["+(getX()-i)+"]["+(getY()+i)+"]");
					}
					else{
						if(Chess.board[getX()-i][getY()+i]/10 == 2) {
							System.out.println("board["+(getX()-i)+"]["+(getY()+i)+"] --상대편말을먹을수있음");
						}
						flag[2] = false;
					}
				}
			}

			//2시방향
			if(flag[3]==true) {
				if((getX()-i < 0) || (getY()-i < 0) || (getX()-i > 7) || (getY()-i > 7)) {
					flag[3] = false;
				}
				else {
					if(Chess.board[getX()-i][getY()-i]/10 == 0) {
						System.out.println("board["+(getX()-i)+"]["+(getY()-i)+"]");
					}
					else{
						if(Chess.board[getX()-i][getY()-i]/10 == 2) {
							System.out.println("board["+(getX()-i)+"]["+(getY()-i)+"] --상대편말을먹을수있음");
						}
						flag[3] = false;

					}
				}
			}
		}
		
	}
}