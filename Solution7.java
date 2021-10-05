//0부터 9까지의 숫자 중 일부가 들어있는 배열 numbers가 매개변수로 주어집니다. numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요
public class Solution7 {
    public int solution(int[] numbers){
        int answer = -1;
        int c = 45;
        int a = numbers.length;
        int num = 0;
        int sum = 0;
        for(int b = 0; b < a; b++)
        {
            num = num + numbers[b];
        }
        if(num == 45)
        {
            answer = 0;
        }
        else
        {
            sum = c-num;
            answer = sum;
        }
        return answer;
    }
}
