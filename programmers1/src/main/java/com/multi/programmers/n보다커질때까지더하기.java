package com.multi.programmers;

import java.util.*;

public class n����Ŀ�����������ϱ� {
	 public int solution(int[] numbers, int n) {
	        int answer = 0;
	        int sum=0;
	        for(int i=0; i<numbers.length;i++){
	            sum+=numbers[i];
	            if(sum>n){
	                break;
	            }
	        }
	        answer=sum;
	        return answer;
	    }
}
