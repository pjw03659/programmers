package com.multi.programmers_Level1;

import java.util.*;

public class ��������1�̵Ǵ¼����ϱ� {
	public int solution(int n) {
        int answer = 1;
        while(true){
            if(n%answer==1){
                break;
            }
            answer++;
        }
        return answer;
    }
}
