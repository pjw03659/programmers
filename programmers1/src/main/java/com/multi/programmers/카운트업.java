package com.multi.programmers;

public class ī��Ʈ�� {
	public int[] solution(int start_num, int end_num) {
        int number=end_num-start_num;
        int[] answer = new int[number+1];
        for(int i=0; i<=number;i++){
            answer[i]=start_num+i;
        }
        return answer;
    }
}
