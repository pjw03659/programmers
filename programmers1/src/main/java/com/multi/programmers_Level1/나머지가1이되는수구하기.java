package com.multi.programmers_Level1;

import java.util.*;

public class 나머지가1이되는수구하기 {
	public int solution(int n) {
        int answer = 1;
        while(true){
            if(n%answer==1){
                break;
            }
            answer++;
        }
        return answer;
    }
}
