package com.multi.programmers;

import java.util.Scanner;

public class 첫번째로나오는음수 {
	public int solution(int[] num_list) {
        int answer = 0;
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]<0){
                answer=i;
                break;
            }else {
                answer=-1;
            }
        }
        return answer;
    }
};
