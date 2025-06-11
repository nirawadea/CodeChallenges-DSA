public class ReverseString {

    String str = "Naman";

//    String rev = "";
//    StringBuffer sb1;


    int len = str.length();

//    public void ReverseString(){
//        for(int i=len-1;i>=0;i--)
//        {
//            rev = rev + str.charAt(i);
//        }
//        System.out.println("Reverse String:" + rev);
//
//        if(str.equals(rev)){
//            System.out.println("String is equal");
//        }else{
//            System.out.println("String not equal");
//        }

    public boolean isPalindrome(){
        StringBuffer sb =  new StringBuffer();
        StringBuffer rev = sb.append(str.toLowerCase());
        System.out.println(rev);

        if(str.equalsIgnoreCase(String.valueOf(rev))){
//            System.out.println("Reverse String" + rev);
            return true;
        }else{
//            System.out.println("Not Reverse String" + " "+ rev);
            return false;
        }
    }
}
