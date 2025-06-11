import java.util.ArrayList;

public class List {


   public boolean check(){

       ArrayList<String> list = new ArrayList<>();
       list.add("Apple");
       list.add("Mango");
       list.add("Banana");
       list.add("Grape");
       list.add("Pineapple");

       for (String s : list){
           if(s.contains("Cherry")){
               System.out.println("Mango is present");
               return true;
           }
       }
       System.out.println("Not Present");
       return false;
   }
}
