package com.multi.programmers;

import java.util.*;

public class 홀짝에따라다른값반환하기 {
	 public int solution(int n) {
	        int answer = 0;
	        if(n%2==0){
	            for(int i=0; i<=n;i+=2){
	                answer+= i*i;
	            }
	        }else {
	            for(int i=1; i<=n ; i+=2){
	                answer+=i;
	            }
	        }
	        return answer;
	    }
}
