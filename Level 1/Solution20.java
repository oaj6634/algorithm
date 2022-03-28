//자연수 n이 매개변수로 주어집니다.
// n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요.
// 답이 항상 존재함은 증명될 수 있습니다.
import java.util.Arrays;

public class Solution20 {
    public int solution(int n){
        int arr[] = new int[n];
        int b = 1;
        for(int a = 0; a <= n; a++)
        {
            if(n%b==1) {
                arr[a] = b;
            }
            b++;
        }
        int[] resultArr = Arrays.stream(arr).distinct().toArray();
        Arrays.sort(resultArr);
        int answer = resultArr[1];
        return answer;


    }
}
