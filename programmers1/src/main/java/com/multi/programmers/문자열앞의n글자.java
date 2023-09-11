package com.multi.programmers;

import java.util.Scanner;

public class 문자열앞의n글자 {
	public String solution(String my_string, int n) {
        String answer = "";
        answer=my_string.substring(0,n);
        return answer;
    }
};
