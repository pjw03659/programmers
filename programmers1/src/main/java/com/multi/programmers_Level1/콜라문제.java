package com.multi.programmers_Level1;

import java.util.*;

public class �ݶ��� {
	public int solution(int a, int b, int n) {
        int answer = 0;
        while(n>=a){
            answer+=n/a*b;
            n= n/a*b + n%a;
        }
        return answer;
    }
}
