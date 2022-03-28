// 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
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
