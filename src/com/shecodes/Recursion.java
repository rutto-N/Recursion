package com.shecodes;

public class Recursion {
    public String pairStar(String s) {
        if (s.isEmpty() || s.length() == 1)
            return s;
        if (s.charAt(0) == s.charAt(1))
            return s.charAt(0) + "*" + pairStar(s.substring(1));
        else
            return s.charAt(0) + pairStar(s.substring(1));
    }
    public int strCount(String text, String sub) {
        if (text.length() < sub.length() || text.isEmpty())
            return 0;
        if (text.startsWith(sub))
            return 1 + strCount(text.substring(sub.length()), sub);
        else
            return strCount(text.substring(1), sub);
    }
    public int numberOfLowerX(String text){
        if (text.isEmpty()){
            return 0;
        }
        if (text.charAt(0) == 'x')
            return 1 + numberOfLowerX(text.substring(1));
        else
            return numberOfLowerX(text.substring(1));

    }
    public int triangle(int n){
        if (n==0){
            return 0;
        }
        return n+triangle(n-1);
    }
    public String parenBit(String s) {
        if (s.isEmpty()) {
            return s;
        }
        if (s.charAt(0) == '(') {
            if (s.charAt(s.length() - 1) == ')') {
                return s;
            } else{
                return parenBit(s.substring(0, s.length()-1));
            }


        }else{
            return parenBit(s.substring(1));
        }

    }
}
