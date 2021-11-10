import java.lang.reflect.Array;
import java.util.Arrays;

//문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다.
// str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
//예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.
public class Solution28 {
    public String solution(String s) {
        String answer = "";
        //띄어쓰기 기준으로 배열에 저장하기
        String[] answer1 = s.split(" ");
        // String 배열을 int 배열로 변환
        int[] arr2 = Arrays.stream(answer1).mapToInt(Integer::parseInt).toArray();
        //내림차순으로 정렬
        Arrays.sort(arr2);
        //int 배열을 String 배열로 변환
        String[] a=Arrays.toString(arr2).split("[\\[\\]]")[1].split(", ");
        answer = a[0] + " " + a[a.length-1];
        return answer;

    }
}
