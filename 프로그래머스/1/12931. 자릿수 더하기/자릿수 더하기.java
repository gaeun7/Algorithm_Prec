import java.util.*;

public class Solution {
    public  int solution(int n) {
        int sum = 0;
        
      int[] answer = new int[(int) Math.log10(n) + 1];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = (n % 10);
            n = n / 10;
            
            sum = sum + answer[i];
        }
        return sum;
    }
}