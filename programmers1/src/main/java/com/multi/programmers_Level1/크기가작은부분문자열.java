package com.multi.programmers_Level1;

import java.util.*;

public class ũ�Ⱑ�����κй��ڿ� {
	public int solution(String t, String p) {
        int answer = 0;
        int length = p.length();
        long num= Long.parseLong(p);
        
        for(int i=0; i<=t.length()-length;i++){
            long diff= Long.parseLong(t.substring(i,i+length));
            if(diff<=num){
                answer++;
            }
        }
        
        
        return answer;
    }
}
