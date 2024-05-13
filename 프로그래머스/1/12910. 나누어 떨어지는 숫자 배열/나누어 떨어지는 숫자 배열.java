import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
    
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int a : arr){ 
            if(a % divisor == 0){
                list.add(a);
            }
        }
        if(list.size() == 0) { 
           int[] noResult = {-1};
            return noResult;
        }

        Collections.sort(list);

        int[] result = list.stream().mapToInt(Integer::intValue).toArray();
        return result;
        
    }
}