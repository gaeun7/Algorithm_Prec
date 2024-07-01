import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> map = new HashMap<>();
        
        
        for(int i = 0; i<keymap.length; i++) {
            for(int j = 0; j<keymap[i].length(); j++) {
                char key = keymap[i].charAt(j);
                if(map.containsKey(key)) {
                    int idx = map.get(key);
                    if(idx < j+1) {
                        map.put(key, idx);
                    } else map.put(key, j + 1);
                } else map.put(key, j+1);
            }
        }
        System.out.println(map);
        for(int i = 0; i<targets.length; i++) {
            int count = 0;
            boolean check = true;
            for(int j = 0; j<targets[i].length(); j++) {
                char key = targets[i].charAt(j);
                if(map.containsKey(key)) {
                    count+=map.get(key);
                } else check = false;
            }
            answer[i] = check == false ? -1 : count;
        }
        return answer;
    }
}