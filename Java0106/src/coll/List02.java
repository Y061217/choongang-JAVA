package coll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//List 속에 Map 넣기
public class List02 {
	public static void main(String[] args) {
		List<Map<String, Object>> board = new ArrayList<Map<String, Object>>();
		//실제 데이터를 저장해봅시다.
		Map<String, Object> ele = new HashMap<String, Object>();
		//data
		ele.put("no", 5);
		ele.put("title", "총을 대충 쏘는 걸 뭐라할까요?");
		ele.put("writer", "설렁탕");
		ele.put("date", "2023-01-06");
		board.add(ele);
		
		int v = 1;
		v = 2;
		
		String v1  = new String("D");
		v1  = new String("c");
		
		ele = new HashMap<>();
		ele.put("no", 6);
		ele.put("title", "제목입니다 6");
		ele.put("writer", "monogatary");
		ele.put("date", "2023-01-06");
		board.add(ele);
		
		ele = new HashMap<>();
		ele.put("no", 7);
		ele.put("title", "제목입니다 7");
		ele.put("writer", "tale");
		ele.put("date", "2023-01-06");
		board.add(ele);
		
		ele = new HashMap<>();
		ele.put("no", 8);
		ele.put("title", "제목입니다 8");
		ele.put("writer", "story");
		ele.put("date", "2023-01-06");
		board.add(ele);
		
		ele = new HashMap<>();
		ele.put("no", 9);
		ele.put("title", "제목입니다 9");
		ele.put("writer", "history");
		ele.put("date", "2023-01-06");
		board.add(ele);
		
		
		for (int i = 0; i < board.size(); i++) {
			System.out.print(board.get(i).get("no")+"\t");
			System.out.print(board.get(i).get("title")+"\t");
			System.out.print(board.get(i).get("writer")+"\t");
			System.out.print(board.get(i).get("date")+"\n");
			
		}
		
	}
}
