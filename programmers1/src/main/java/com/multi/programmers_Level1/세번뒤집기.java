package com.multi.programmers_Level1;

import java.util.*;

public class 세번뒤집기 {
	public int solution(int n) {
        int answer = 0;
        String ans = "";
        
        while(n!=0){
            ans+=n%3;
            n= n/3;
        }
        answer= Integer.parseInt(ans,3);
        return answer;
    }
}
