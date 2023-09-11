package longestBalancedSubstring;

public class Solution {

    public int findTheLongestBalancedSubstring(String s) {
        int res = 0;
        int i = s.indexOf('0');
        if (i == -1){
            return 0;
        }
        int zeroes, ones = 0;
        while (i < s.length()){
            ones = 0;
            zeroes = countFirstSymbol(s.substring(i));
            i += zeroes;
            if (i < s.length()){
                ones = countFirstSymbol(s.substring(i));
                i += ones;
            }
            res = Math.max(res, Math.min(zeroes, ones));
        }
        System.out.println(res * 2);
        return res * 2;
    }


    private int countFirstSymbol(String s){
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(0)) {
                res++;
            }
            else{
                return res;
            }
        }
        return res;
    }


}
