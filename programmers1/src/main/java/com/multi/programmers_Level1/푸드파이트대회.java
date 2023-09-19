package com.multi.programmers_Level1;

import java.util.*;

public class 푸드파이트대회 {
	public String solution(int[] food) {
        String answer = "";
        String half="";
        
        for(int i=1; i<food.length;i++){
            if(food[i] != 0){
                for(int j =0; j<food[i]/2 ; j++){
                    half+= Integer.toString(i);
                }
            }
        }
        
        answer=half +'0';
        //half = "122333"
        for(int i=half.length()-1; i>=0 ; i--){
            answer += half.substring(i,i+1);
        }
        
        return answer;
    }
}
