package chess;

public class Knight extends Pin {
	Knight(){}
	Knight(int x, int y){
		super(x, y);
	}

	@Override
	void canmove() {
		// TODO Auto-generated method stub
//말을 뛰어넘어다님
//상하좌우중 한칸전진후 대각선한컨
		int x;
		int y;
		
		x = getX() + 2;
		y = getY() + 1;
		
		if((x < 0) || (y < 0) || (x > 7) || (y > 7)) {}
		else {
			if(Chess.board[x][y]/10 == 0) {
				System.out.println("board["+x+"]["+y+"]");
			}
			else {
				//적과 아군이 있을때
				
				
				
			}
			
//			
//			if(Chess.board[getX()+i][getY()+i]/10 == 0) {
//				System.out.println("board["+(getX()+i)+"]["+(getY()+i)+"]");
//			}
//			else{
//				if(Chess.board[getX()+i][getY()+i]/10 == 2) {
//					System.out.println("board["+(getX()+i)+"]["+(getY()+i)+"] --상대편말을먹을수있음");
//				}
//				flag[0] = false;
//			}
//			
//			
			
			
		}
	}
}
