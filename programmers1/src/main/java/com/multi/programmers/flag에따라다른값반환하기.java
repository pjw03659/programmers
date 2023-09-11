package com.multi.programmers;

import java.util.*;

public class flag에따라다른값반환하기 {
	public int solution(int a, int b, boolean flag) {
        int answer = 0;
        if(flag==true){
            answer = a+b;
        }else {
            answer = a-b;
        }
        return answer;
    }
}
