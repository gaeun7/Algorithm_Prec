import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        Long longP = Long.parseLong(p);
        for(int i = 0; i<t.length() - p.length() + 1; i++) {
            char[] newT = new char[p.length()];
            for(int j = 0; j<newT.length; j++) {
                newT[j] = t.charAt(i+j);
            }
            String strT = String.valueOf(newT);
            Long presentT = Long.parseLong(strT);
            System.out.println(presentT);
            if(presentT <= longP) {
                answer++;
            }
        }
        return answer;
    }
}