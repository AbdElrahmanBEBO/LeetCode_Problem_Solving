class Solution {
    public boolean isPalindrome(int x) {
        
        if(x < 0)
            return false;
        
        return solution(Integer.toString(x));
        
    }
    public boolean solution(String num) {
        if(num.length() <= 1)
            return true;

        if(num.charAt(0) != num.charAt(num.length()-1))
            return false;

        return solution(num.substring(1,num.length()-1));
    }
    
}