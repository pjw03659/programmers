package com.multi.programmers_Level1;

import java.util.*;

public class ������� {
	public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n;i++){
            if(n%i==0){
                answer+=i;
            }
        }
        return answer;
    }
}
