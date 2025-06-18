package String;

//Input: s = "anagram", t = "nagaram"
//Output: true

public class ValidAnagram {
    public boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        int[] arr = new int[128];

        for(int i=0; i<s1.length(); i++){
            int ascii = s1.charAt(i);
            arr[ascii] = arr[ascii] + 1;
        }

        for(int i=0; i<s2.length(); i++){
            int ascii = s2.charAt(i);
            arr[ascii] = arr[ascii]-1;

        }

       for(int i=0; i<arr.length;i++){
           if(arr[i] > 0){
               return false;
           }
       }
        return true;

    }
}

//arr[ascii] + 1 = 0 + 1 (if uninitialized)
//It does not update the array unless you assign it back like:
//arr[ascii] = arr[ascii] + 1;\

// TC - O(n)
//SC - O(1)

