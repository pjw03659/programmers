package com.multi.programmers;

import java.util.*;

public class n번째정수까지 {
	public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        for(int i=0; i<n; i++){
            answer[i]=num_list[i];
        }
        return answer;
    }
}
