public class Solution26 {
    public String solution(int n) {
        String answer = "";
        String su = "수";
        String bak = "박";
        for(int a = 2; a < n+2; a++)
        {
            if(a%2 == 0)
            {
                answer = answer + su;
            }
            else
            {
                answer = answer + bak;
            }
        }
        return answer;
    }
}
