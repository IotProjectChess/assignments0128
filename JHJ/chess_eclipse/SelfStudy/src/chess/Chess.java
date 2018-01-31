package chess;

import java.util.Scanner;

public class Chess {
	
	public enum My{
		non(0), mking(11), mqueen(12), mrook(13), mbishop(14), mknight(15), mpawn(16),
			 yking(21), yqueen(22), yrook(23), ybishop(24), yknight(25), ypawn(26);
		private int value;

		private My(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}
	}
	

	static int[][] board = {
			// 0은 말이 없음
			//11~21은 내말
			//21~26은 상대의 말
			{My.yrook.getValue(),My.yknight.getValue(),My.ybishop.getValue(),My.yking.getValue(),My.yqueen.getValue(),My.ybishop.getValue(),My.yknight.getValue(),My.yrook.getValue()},
			{My.ypawn.getValue(),My.ypawn.getValue(),My.ypawn.getValue(),My.ypawn.getValue(),My.ypawn.getValue(),My.ypawn.getValue(),My.ypawn.getValue(),My.ypawn.getValue()},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{My.mpawn.getValue(),My.mpawn.getValue(),My.mpawn.getValue(),My.mpawn.getValue(),My.mpawn.getValue(),My.mpawn.getValue(),My.mpawn.getValue(),My.mpawn.getValue()},
			{My.mrook.getValue(),My.mknight.getValue(),My.mbishop.getValue(),My.mking.getValue(),My.mqueen.getValue(),My.mbishop.getValue(),My.mknight.getValue(),My.mrook.getValue()}};

	public static void main(String[] args) {
		check_board();

		Scanner sc = new Scanner(System.in);
		
		// input은 이동시킬말의 죄표를 입력받는변수
		// output은 선택할말이 이동할 좌표를 입력받는변수
		int input, output;

		
		while(true) {
					
			System.out.println("이동시킬말의 위치를 선택하시오. 3,5의 말을이동시키고 싶을경우, 35입력");
			input = sc.nextInt();
			
			if((input/10 >7)
					||(input%10 >7)
					||(board[input/10][input%10] == My.non.ordinal())
					||(board[input/10][input%10]>20)	//이 한줄만 지우면 상대말도 움직일수있음
					) {
				System.out.println("다시 선택하시요(체스판 밖 or 말이 없는곳 or 상대편말 을 선택함)");
				continue;
			}
			
			
			//선택위치의 말이 무엇인지확인, 확인후에 움직일수 있는 위치 확인
			
			//0131 : 비숍과 왕만 위치확인가능
			for(int i=11; i<=16; i++) {
				if(board[input/10][input%10] == i) {
					if(i == 11) {Pin k = new King(input/10,input%10);k.canmove();}
					else if(i == 12) {Pin k = new Queen(input/10,input%10);k.canmove();}
					else if(i == 13) {Pin k = new Rook(input/10,input%10);k.canmove();}
					else if(i == 14) {Pin k = new Bishop(input/10,input%10);k.canmove();}
					else if(i == 15) {Pin k = new Knight(input/10,input%10);k.canmove();}
					else if(i == 16) {Pin k = new Pawn(input/10,input%10);k.canmove();}
					
				}
			}
					
			
			// 이동가능한공간중 한곳 선택
			System.out.println("이동할위치를 선택하시오");
			output = sc.nextInt();
			board[output/10][output%10] = board[input/10][input%10];
			board[input/10][input%10] = My.non.ordinal();
			check_board();
			
		}


	}




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//좌표에 있는 말의 종류를 확인
	static String getChess(int x, int y) {
		if(board[x][y] != 0 ) {
			
			return "";
		}
		else return My.non.name();
	}
	
	static void check_board() {
		for(int i=0; i<board.length; i++) {
			System.out.print(i+"|");
			for(int j =0; j< board[i].length; j++) {
				System.out.print(board[i][j]+"\t");
			}
			System.out.println();
		}System.out.println("___________________________________________________________\n"+"  0\t1\t2\t3\t4\t5\t6\t7");
	}
}