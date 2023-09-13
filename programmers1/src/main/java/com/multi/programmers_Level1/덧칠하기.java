package com.multi.programmers_Level1;

import java.util.*;

public class µ¡Ä¥ÇÏ±â {
	public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        int start = section[0];
        answer++;
        
        for(int item:section){
            if(start+m>item){
                continue;
            }
            start=item;
            answer++;
        }
        
        return answer;
    }
}
