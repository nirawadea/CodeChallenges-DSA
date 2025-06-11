public class ArithmeticProgression {

  public static int AP(int a1, int b2, int n){
      int d = b2 - a1;
      int result = a1 + (n-1) * d;
      System.out.println(result);
      return result;
  }
}
