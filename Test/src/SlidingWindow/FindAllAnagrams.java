package SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagrams {
    public static List<Integer> findAnagram(String s, String p){

        List<Integer> result = new ArrayList<>();
        int slength = s.length();
        int plength = p.length();

        for (int i=0; i<slength-plength; i++){
            String sub = s.substring(i, i+plength);
            if (isAnagram(sub,p)){
                result.add(i);
            }
        }
        return result;
    }

    private static boolean isAnagram(String sub, String p){

        if(sub.length() != p.length()){
            return false;
        }
        int[] count = new int[26];

        for(int i=0; i<sub.length(); i++){
            count[sub.charAt(i) - 'a']++;
            count[p.charAt(i) - 'a']--;
        }

        for(int val : count){
            if(val!=0){
                return false;
            }
        }
        return true;
    }


}
