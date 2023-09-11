package com.multi.programmers;

import java.util.*;

public class °ø¹è¼ö {
	public int solution(int number, int n, int m) {
        int answer = 0;
        if(number % n ==0 && number % m==0){
            answer=1;
        }
        return answer;
    }
}
