class Solution {
    public boolean solution(int x) {
        String[] answer =  String.valueOf(x).split("");
        int sum = 0;
        
        for (String digit : answer) {
            sum += Integer.parseInt(digit);
        }
        
           if( x % sum == 0){
                return true;
            } else return false;

    }
}