import java.util.*;
import java.lang.*;
class Solution {
    public String solution(String s, String skip, int index) {
        String[] temp = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
                          "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
                          "w", "x", "y", "z"};
        List<String> alphabets = new ArrayList<>(Arrays.asList(temp));
        
        for(int i=0; i<skip.length(); i++){
            alphabets.remove(String.valueOf(skip.charAt(i)));
        } 
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            int sIdx = alphabets.indexOf(String.valueOf(s.charAt(i)));
            int nextSIdx = (sIdx+index)%alphabets.size();
            sb.append(alphabets.get(nextSIdx));
        }
        return sb.substring(0);
    }
}