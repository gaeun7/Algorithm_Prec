class Solution {
    public int[] solution(long n) {

        int length = (int) Math.log10(n) + 1;
        
        int[] answer = new int[length];
        int[] reanswer = new int[length];

        for(int i = length - 1; i >= 0; i--) {
            answer[i] = (int)(n % 10);
            n /= 10;
        }

        for(int i = 0; i < length; i++) {
            reanswer[i] = answer[length - i - 1];
        }
        
        return reanswer;
    }
}