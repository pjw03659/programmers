package com.multi.programmers;

import java.util.*;

public class 원소들의곱과합 {
	public int solution(int[] num_list) {
        int answer = 0;
        int sum =0;
        int product=1;
        for(int i=0; i<num_list.length; i++){
            sum+=num_list[i];
            product=num_list[i]*product;
        }
        if(product<(sum*sum)){
            answer=1;
        }
        return answer;
    }
}
