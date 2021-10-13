//자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
//예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

import java.util.*;

public class Solution14 {
    public int solution(int n) {
        int answer = 0;
        String a = String.valueOf(n);
        String[] array_word;
        int sum = 0;

        array_word = a.split("");
        int length = array_word.length;
        int[] arr2 = new int[length];

        for(int c = 0; c < length; c++)
        {
            arr2[c] = Integer.parseInt(array_word[c]);
        }
        for(int d = 0; d < length; d ++)
        {
            sum = sum + arr2[d];
        }
        return sum;
    }
}
