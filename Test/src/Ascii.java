public class Ascii {

    String str = "hello";
    int total = 0;
    int j = 1;

    public void calculateAscii(){

        for(int i=0; i<str.length() && j< str.length(); i++){
            char c = str.charAt(i);
            char c2 = str.charAt(j);
            int ascii = (int) c;
            int ascii2 = (int) c2;
            total += Math.abs(ascii-ascii2);
            j++;
        }
        System.out.print("Total calculation of" + str + "is " + total );
    }
}
