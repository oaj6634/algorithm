//전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution6 {
    public String solution(String phone_number) {
        String list[] = phone_number.split("");
        int a = list.length;
        String list1[] = new String[a-4];
        for(int b = 0; b<a-4; b++)
        {
            list1[b] = "*";
        }

        String arr1[] = Arrays.copyOfRange(list,a-4, a);

        List<String> list2 = new ArrayList<>(Arrays.asList(list1));
        List<String> list3 = new ArrayList<>(Arrays.asList(arr1));

        list2.addAll(list3);

        String answer[] = list2.toArray(new String[0]);

        String arrayToString = String.join("", answer);


        return arrayToString;
    }
}
