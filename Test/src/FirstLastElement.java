import java.util.ArrayList;

public class FirstLastElement {

    int[] arr = {4,2,3,5,7};
    public void getElement(){

        ArrayList<String> list = new ArrayList<>();
        list.add("Aayuka");
        list.add("Swasti");
        list.add("Siddharth");
        list.add("krishna");

        if (!list.isEmpty()){
           String firstIndex =  list.get(0);
           String lastIndex = list.get(list.size()-1);
           System.out.println("FirstIndex"+ " " + firstIndex);
           System.out.println("LastIndex"+ " " + lastIndex);
        }else{
            System.out.println("List is empty");
        }

        if(arr != null){
            System.out.println("first element" + " "+ arr[0]);
            System.out.println("Second element" + " " + arr[arr.length-1]);
        }
    }
}
