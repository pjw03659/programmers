package com.multi.programmers_Level1;

import java.util.*;

public class ³»Àû {
	 public int solution(int[] a, int[] b) {
	        int answer = 0;
	        for(int i=0; i<a.length; i++){
	            answer+= a[i]*b[i];
	        }
	        return answer;
	    }
}
