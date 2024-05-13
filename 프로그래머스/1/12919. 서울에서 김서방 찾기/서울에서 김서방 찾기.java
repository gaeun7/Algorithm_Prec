class Solution {
    public String solution(String[] seoul) {
        int i = 0;
        for(String name : seoul) {
            if(name.equals("Kim")){
                break;
            }
            i++;
        }
        return "김서방은 " + i +"에 있다"; 
    }
}