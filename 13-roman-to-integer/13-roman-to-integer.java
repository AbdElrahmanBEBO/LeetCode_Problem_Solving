class Solution {
    public int romanToInt(String s) {        
        int x = 0;
        
        while(s.length() > 1){            
            if(checkChar(s.charAt(0)) < checkChar(s.charAt(1))) {
                x += checkChar(s.charAt(1)) - checkChar(s.charAt(0));
                s = s.substring(2);
            }
            else {
                x += checkChar(s.charAt(0));
                s = s.substring(1);
            }                                                
        }
        
        if(s.length() == 1)
            x += checkChar(s.charAt(0));
                
        return x;
    }    
    
    public int checkChar(char ch) {
        if(ch == 'I')
            return 1;
        else if(ch == 'V')
            return 5;
        else if(ch == 'X')
            return 10;
        else if(ch == 'L')
            return 50;
        else if(ch == 'C')
            return 100;
        else if(ch == 'D')
            return 500;        
            
        return 1000;
    }
}