//두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고,
// 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요
public class Solution43 {
    public int solution(int left, int right) {
        int answer = 0;
        int sum = 0;
        int sum1 = 0;
        for(int a = 0;a<=right-left; a++){
            for(int b = 1; b <= left; b++){
                if(left % b == 0){
                    sum++;
                }
                if(left<right){
                    left++;
                }

            }
            if(sum % 2 == 0){
                sum1 = sum1 + left;
            }
            else {
                sum1 = sum1-left;
            }
        }
        return answer;
    }
}
