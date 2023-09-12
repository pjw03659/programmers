package com.multi.programmers;

public class 문자열의뒤n글자 {
	public String solution(String my_string, int n) {
        String answer = "";
        answer= my_string.substring(my_string.length()-n);
        return answer;
    }
}
