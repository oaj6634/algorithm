import java.util.Arrays;
import java.util.Collections;

public class Solution4 {
    public long solution(long n) {
        long answer = 0;
        String answer1 = "";
        String number = String.valueOf(n);
        String list[] = number.split("");
        Arrays.sort(list, Collections.reverseOrder());
        int b = list.length;
        for(int a = 0; a < b; a ++)
        {
            answer1 = answer1+list[a];
        }

        answer = Long.parseLong(answer1);


        return answer;
    }
}
