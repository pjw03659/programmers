package com.multi.programmers_Level1;

import java.util.*;

public class ���尡�������� {
	public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0; i<s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                answer[i]=-1;
                map.put(s.charAt(i),i);
            }else {
                answer[i] = i- map.get(s.charAt(i));
                map.put(s.charAt(i),i);
            }
        }
        return answer;
    }
}
