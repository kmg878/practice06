package prob6;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	public List<Board> getBoardList(){
		List<Board> list = new ArrayList<Board>();
		
		//add 3개 만들어야함 
		//DataBase 에서 데이터를 가져와서
		//Board객체를 만들고 list 저장 
		
		
		Board board1 = new Board();
		board1.setTitle("제목");
		board1.setContent("내용");
		list.add(board1);
		Board board2 = new Board();
		board2.setTitle("제목2");
		board2.setContent("내용2");
		list.add(board2);
		
	
		
		return list;
	}
}
