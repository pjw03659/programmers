package com.multi.programmers_Level1;

import java.util.*;

public class 자릿수더하기 {
	 public int solution(int n) {
	        int answer = 0;
	        String num =Integer.toString(n);
	        for(int i=0; i<num.length(); i++){
	            answer+= num.charAt(i)-'0';
	        }
	        return answer;
	    }
}
