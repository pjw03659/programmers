package com.multi.programmers;

import java.util.*;

public class ���ǿ��°Լ�����ȯ�ϱ�1 {
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
