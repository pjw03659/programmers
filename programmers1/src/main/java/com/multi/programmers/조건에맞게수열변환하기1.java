package com.multi.programmers;

import java.util.*;

public class 조건에맞게수열변환하기1 {
	public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        for(int i=0; i<arr.length;i++){
            if(arr[i]>=50 && arr[i]%2==0){
                arr[i]=arr[i]/2;
                answer[i]=arr[i];
            }else if( arr[i]<50 && arr[i]%2==1){
                arr[i]=arr[i]*2;
                answer[i]=arr[i];
            }else {
                answer[i]=arr[i];
            }
        }
        return answer;
    }
}
