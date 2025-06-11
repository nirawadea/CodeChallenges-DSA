public class SumIntegers {

    int sum = 0;

    public int sumOfArray(String[] arr){
//        for(String num :arr){
//            if(num.matches("-?\\d+")){
//                sum += Integer.parseInt(num);
//            }
//        }
//        return sum;
        for (String num : arr){
            try {

                sum += Integer.parseInt(num);

            }catch (NumberFormatException e){

            }
        }

        return sum;
    }
}
