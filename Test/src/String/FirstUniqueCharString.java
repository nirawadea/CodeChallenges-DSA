package String;

public class FirstUniqueCharString {

    public int firstUniqChar(String s) {
        //leetcode
        //loveleetcode

        int[] arr = new int[26];

        for(int i=0; i<s.length(); i++){
            int ascii = s.charAt(i);
            arr[ascii - 'a']++;
        }

        int i;
        for(i=0; i<s.length(); i++){
            if(arr[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharString solution = new FirstUniqueCharString();

        String input1 = "leetcode";
        String input2 = "loveleetcode";
        String input3 = "aabb";

        System.out.println("First unique character in '" + input1 + "' is at index: " + solution.firstUniqChar(input1));
        System.out.println("First unique character in '" + input2 + "' is at index: " + solution.firstUniqChar(input2));
        System.out.println("First unique character in '" + input3 + "' is at index: " + solution.firstUniqChar(input3));
    }

}
