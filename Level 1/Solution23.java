//자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Solution23 {
    public int[] solution(long n) {
        int[] answer = {};
        int length = (int)(Math.log10(n)+1);
        int arr[] = new int[length];
        String to = Long.toString(n);
        String arr1[] = to.split("");
        List<String> arr2 = Arrays.asList(to);
        Collections.reverse(arr2);
        String[] array = arr2.toArray(new String[arr2.size()]);
        int[] arr3 = Arrays.stream(array).mapToInt(Integer::parseInt).toArray();
        return arr3;
    }
}
