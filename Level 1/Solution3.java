public class Solution3 {
    public double solution(int arr[]) {
        double answer = 0;
        int a = arr.length;
        double sum = 0;
        for(int i= 0; i < a; i ++ )
        {
            sum = sum + arr[i];
        }
        answer = sum/a;
        return answer;
    }
}
