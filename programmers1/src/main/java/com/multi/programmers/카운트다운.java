package com.multi.programmers;

public class ī��Ʈ�ٿ� {
	 public int[] solution(int start, int end_num) {
	        int num_length=start-end_num+1;
	        int[] answer = new int[num_length];
	        for(int i=0;i<num_length;i++){
	            answer[i]=start;
	            start=start-1;
	        }
	        return answer;
	    }
}
