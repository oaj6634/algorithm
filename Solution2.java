public class Solution2 {
    public String solution(String s) {
        String answer;
        int a = s.length();
        char temp[] = s.toCharArray();
        if((a % 2) == 0)
        {
            char charArray[] = {temp[(a-1)/2], temp[(a-1)/2+1]};
            String str = String.valueOf(charArray);
            answer = str;
        }
        else
        {
            char charArray1[] = {temp[((a+1)/2)-1]};
            String str1 = String.valueOf(charArray1);
            answer = str1;
        }
        return answer;
    }
}
