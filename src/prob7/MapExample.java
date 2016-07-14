package prob7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put( "blue", 85 );
		map.put( "red", 96 );
		map.put( "black", 92 );
		
		String name = null;   // 최고 점수를 받은 아이디 저장
		int maxScore = 0;     // 최고 점수
		int totalScore = 0;   // 점수 합계
		
		/* 코드를 작성하세요 */
		Set<String> set=map.keySet();
 		Iterator<String> it = set.iterator();
 		String key = null ;
 		int value=0;
 		int count=0;
 		while (it.hasNext()){
 			 key = it.next();
 			 value = map.get(key);
 			totalScore += value;
 			count++;
 			
 			if(maxScore <value){
 				maxScore=value;
 				name=key;
 			}
 			
 			
 			
 		}
 		System.out.println("최고점수는 :"+maxScore);
 		System.out.println("평균점수는 ?"+totalScore/count);
 		System.out.println("최고점수를 받은 아이디 : "+name);
 		
	}

}
