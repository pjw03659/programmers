package com.multi.programmers;

import java.util.*;

public class flag������ٸ�����ȯ�ϱ� {
	public int solution(int a, int b, boolean flag) {
        int answer = 0;
        if(flag==true){
            answer = a+b;
        }else {
            answer = a-b;
        }
        return answer;
    }
}
