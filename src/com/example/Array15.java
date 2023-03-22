package com.example;

import java.util.Arrays;
// java.lang ㅍㅐ키지의 클래스는 Import를 하지 않아도 사용 가능

public class Array15 {
    public static void main(String[] args) {
        char[] copyFrom = {'h', 'e', 'l', 'l', 'o', '!'};

        char[] copyTo = Arrays.copyOfRange(copyFrom, 1, 4);

        for (char c : copyTo) {
            System.out.println(c);
        }
    }
}
