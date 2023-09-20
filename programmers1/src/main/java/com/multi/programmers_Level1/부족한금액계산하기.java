package com.multi.programmers_Level1;

import java.util.*;

public class 부족한금액계산하기 {
	public long solution(int price, int money, int count) {
        long answer = -1;
        long total=0;
        for(int i=1; i<=count; i++){
            total+=(long)i;
        }
        total=total*price;
        if(money>= total){
            answer=0;
        }else {
            answer= total-money;
        }
        return answer;
    }
}
