class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] rank = {6, 6, 5, 4, 3, 2, 1};
        int[] answer = new int[2];
        
        for (int i = 0; i < lottos.length; i ++) {
            if (lottos[i] == 0) {
                answer[0]++;
                continue;
            }
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    answer[0]++;
                    answer[1]++;
                }
            }
        }
        
        answer[0] = rank[answer[0]];
        answer[1] = rank[answer[1]];
        
        return answer;
    }
}