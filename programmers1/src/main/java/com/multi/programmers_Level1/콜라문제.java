package com.multi.programmers_Level1;

import java.util.*;

public class 콜라문제 {
	public int solution(int a, int b, int n) {
        int answer = 0;
        while(n>=a){
            answer+=n/a*b;
            n= n/a*b + n%a;
        }
        return answer;
    }
}
