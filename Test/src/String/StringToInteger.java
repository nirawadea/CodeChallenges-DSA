package String;

public class StringToInteger {

    public int myAtoi(String s){
        int n = s.length();
        int i = 0;
        int sign = 1;
        long result = 0;

        if(n == 0){
            return 0;
        }

        while(i<n && s.charAt(i) == ' '){
            i++;
        }

        if(i<n && s.charAt(i) == '+' || s.charAt(i) == '-'){
            sign = 1;
            i++;
        }else{
            sign = -1;
            i++;
        }

        while(i<n && Character.isDigit(i)){
            result = result*10 + (s.charAt(i) - '0');
            i++;

            if(sign*result > Integer.MAX_VALUE || sign*result < Integer.MIN_VALUE){
                return Integer.MAX_VALUE;
            }else{
                return Integer.MIN_VALUE;
            }
        }
        return (int) (sign*result);
    }
}
