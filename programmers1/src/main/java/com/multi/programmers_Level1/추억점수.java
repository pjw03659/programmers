package com.multi.programmers_Level1;

import java.util.*;

public class 추억점수 {
	 public int[] solution(String[] name, int[] yearning, String[][] photo) {
	        int[] answer = new int[photo.length];
	        
	        HashMap<String, Integer> point = new HashMap<>();
	        
	        for(int i=0; i<name.length;i++){
	            point.put(name[i],yearning[i]);
	        }
	        
	        for(int i=0; i<photo.length;i++){
	            int score=0;
	            for(int j=0; j<photo[i].length;j++){
	                String name1 = photo[i][j];
	                if (point.containsKey(name1)) {
	                     score += point.get(name1);
	                 }   
	            }
	            answer[i]=score;
	        }
	        return answer;
	    }
}
