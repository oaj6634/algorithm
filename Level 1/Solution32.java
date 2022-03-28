import java.util.Scanner;

public class Solution32 {
    public void solution32() {
        {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            if( a < b)
            {
                System.out.println("<");
            }
            else if(a > b)
            {
                System.out.println(">");
            }
            else
            {
                System.out.println("==");
            }
        }
    }
}
