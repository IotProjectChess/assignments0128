package net.iot.somaproject;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class NewActivity extends AppCompatActivity {
    TextView system_Message;
    MyGridAdapter_Pieces piece;
    MyGridAdapter_block block;
    MyGridAdapter board;

    GridView gv_chessboard;
    GridView gv_cheesPieces;
    GridView gv_blankBlock;


    Utiles utile = new Utiles();
    ImageView[] save_imageView = new ImageView[10];
    int save_position;

    final static int MATCH = LinearLayout.LayoutParams.MATCH_PARENT;
    final static int W_PAWN = R.drawable.w_pawn;
    final static int W_KINGHT = R.drawable.w_knight;
    final static int W_BISHOP = R.drawable.w_bishop;
    final static int W_QUEEN = R.drawable.w_queen;
    final static int W_KING = R.drawable.w_king;
    final static int W_CASTLE = R.drawable.w_castle;
    final static int B_PAWN = R.drawable.b_pawn;
    final static int B_KINGHT = R.drawable.b_knight;
    final static int B_BISHOP = R.drawable.b_bishop;
    final static int B_QUEEN = R.drawable.b_queen;
    final static int B_KING = R.drawable.b_king;
    final static int B_CASTLE = R.drawable.b_castle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window win = getWindow();
        win.setContentView(R.layout.activity_new);
        system_Message = (TextView) findViewById(R.id.sys_message);
        setLayout(win);
    }


    public void setLayout(Window win){
        //전개자로 xml 파일을 가져옴
        LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //LinearLayout 파라미터를 세팅
        LinearLayout layout_pieces = (LinearLayout)inflater.inflate(R.layout.gridview_piece,null);
        LinearLayout layout_block = (LinearLayout)inflater.inflate(R.layout.gridview_blank,null);

        LinearLayout.LayoutParams paramlinear = new LinearLayout.LayoutParams(MATCH,MATCH);
        // 2번째 레이아웃으로 체스말 추가(위에 겹치기)
        win.addContentView(layout_pieces,paramlinear);
        // 3번째 레이아웃으로 비어있는 블록 추가(위에 겹치기)
        win.addContentView(layout_block,paramlinear);


        //체스판 gridView 호출
        gv_chessboard = (GridView) findViewById(R.id.gridView1);
        board = new MyGridAdapter(this);

        //체스말 gridView 호출
        gv_cheesPieces = (GridView) findViewById(R.id.gv_piece);
        piece = new MyGridAdapter_Pieces(this);

        //체크블록 gridView 호출
        gv_blankBlock = (GridView) findViewById(R.id.gv_blank);
        block = new MyGridAdapter_block(this);

        gv_chessboard.setAdapter(board);
        gv_cheesPieces.setAdapter(piece);
        gv_blankBlock.setAdapter(block);

        gv_blankBlock.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                system_Message.setText("클릭위치 : " + position + ", ID : " + piece.getItemId(position));
                int[] xy = utile.positionToArray(position);
                int x = xy[0]; int y = xy[1]; //좌표값
/*
                removePreClick(); //이전에 했던 클릭 삭제
                if(save_position == position) save_position = 99; //기존에 클릭한 위치와 같다면 firstClick을 수행하지 않음. 때문에 다음 클릭땐 무조건 실행하게됨.
                else firstClick(position, id,x,y);
           */

                //1. 선택된(빨강) 블록 표시하기 & 선택된(빨강) 블록 지우기
                visibleSelectedBlock(x,y);
                invisibleSelectedBlock(x,y);
                //2. 움직임가능한(노랑) 블록 표시하기 & 움직임가능한(노랑) 블록 지우기
                visibleisMovingBlock(x,y);
                invisibleisMovingBlock(x,y);
                //3. 말 지우기 & 말 표시하기
                visiblePiece(W_BISHOP,x,y);
                invisiblePiece(x,y);

            }
        });
    }
    public void visibleSelectedBlock(int x, int y){
        block.imageView_blankBlock[x][y].setImageResource(R.drawable.block_selected);
    }
    public void invisibleSelectedBlock(int x, int y){
        block.imageView_blankBlock[x][y].setImageResource(R.drawable.block_blank);
    }
    public void visibleisMovingBlock(int x, int y){
        block.imageView_blankBlock[x][y].setImageResource(R.drawable.block_ismovie);
    }
    public void invisibleisMovingBlock(int x, int y){
        block.imageView_blankBlock[x][y].setImageResource(R.drawable.block_blank);
    }
    public void visiblePiece(int pieces, int x, int y){
        piece.imageView_Pieces[x][y].setImageResource(pieces);
    }
    public void invisiblePiece(int x, int y){
        piece.imageView_Pieces[x][y].setImageResource(R.drawable.block_blank);
    }
    public void removePreClick(){
        for(int i=0; i<save_imageView.length; i++)
        {
            if(save_imageView[i] != null){
                save_imageView[i].setImageResource(R.drawable.block_blank);
            }
        }
    }
    public void firstClick(int position, long id,int x, int y){
        int count = 0;
        // 클릭한 위치에 배정된 말의 id값이 빈공간이면 그 위치의 블록을 선택
        if(piece.getItemId(position) == R.drawable.block_blank) {
            block.imageView_blankBlock[x][y].setImageResource(R.drawable.block_selected);
            save_imageView[count++] = block.imageView_blankBlock[x][y];
            save_position = position;
        }
        else{
            block.imageView_blankBlock[x][y].setImageResource(R.drawable.block_selected);
            save_imageView[count++] = block.imageView_blankBlock[x][y];
            save_position = position;
            switch((int)piece.getItemId(position)){
                case R.drawable.b_castle:case R.drawable.w_castle: MovingCheck("castle"); break;
                case R.drawable.b_knight:case R.drawable.w_knight: MovingCheck("knight"); break;
            }
        }
    }
    public void MovingCheck(String piece){

    }
    public void onBackButtonClicked(View v) {
        Toast.makeText(getApplicationContext(), "돌아가기 버튼을 누름", Toast.LENGTH_LONG).show();
        finish();
    }

}
