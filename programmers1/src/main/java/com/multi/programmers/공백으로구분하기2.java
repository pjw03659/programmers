package com.multi.programmers;

import java.util.*;

public class 공백으로구분하기2 {
	public String[] solution(String my_string) {
        return my_string.trim().split("\\s+");
    }
}
