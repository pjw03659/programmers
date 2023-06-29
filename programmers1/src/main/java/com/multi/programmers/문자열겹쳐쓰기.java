package com.multi.programmers;

public class 문자열겹쳐쓰기 {
	 public String solution(String my_string, String overwrite_string, int s) {
	        String answer = "";
	        String str=my_string.substring(0,s);
	        String ostr=my_string.substring(s+overwrite_string.length());
	        answer = str+overwrite_string+ostr;
	        return answer;
	    }
}
