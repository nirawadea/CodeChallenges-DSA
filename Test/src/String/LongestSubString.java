package String;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

    public static int longestString(String str) {

        if (str == null || str.length() == 0) {
            return 0;
        }

        int maxLen = Integer.MIN_VALUE;
        int right = 0;
        int left = 0;
        Set<Character> set = new HashSet<>();

//        while (right < str.length()) {
//            if (set.contains(str.charAt(right))) {
//                maxLen = Math.max(maxLen, right - left);
//                while (set.contains(str.charAt(right))) {
//                    set.remove(str.charAt(left));
//                    left++;
//                }
//            }else{
//                set.add(str.charAt(right));
//                right++;
//            }
//        }
//
        // p,w,w,k,e,w,x,p,w

       for(right = 0; right<str.length(); right++){

           while(set.contains(str.charAt(right))){
               set.remove(str.charAt(left));
               left++;
           }

         set.add(str.charAt(right));
         maxLen = Math.max(maxLen, right-left+1);
       }
       return maxLen;
    }
}


// Time complexity is O(n) and Space complexity is O(1) bc HashSet stores at most m unique characters where m is the size of the char
