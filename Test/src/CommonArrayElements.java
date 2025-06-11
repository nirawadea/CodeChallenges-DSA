import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CommonArrayElements {

    int[] a = {2,3,4,9,5,3};
    int[] b = {1,7,3 ,9,8,3};

//    ArrayList<Integer> list = new ArrayList<>();
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();
    Map<Integer, Integer> map = new HashMap<>();

    public void getCommon(){

//        for(int i=0; i<a.length; i++){
//            for(int j=0; j<b.length; j++){
//                if(a[i]==b[j]){
//                    if(!list.contains(a[i])){
//                        list.add(a[i]);
//                    }
//                }
//            }
//        }
//        System.out.println(list);

//        for(int i : a){
//            set1.add(i);
//        }
//        for(int i : b){
//            if(set1.contains(i)){
//                set2.add(i);
//            }
//        }
//        System.out.println("Common Elements: " + set2);

        for (int i :a){
            if(map.containsKey(i)){
                //map.put(key, value)
                //value = map.get(key)
                map.put(i,map.get(i)+1);
            }else {
                map.put(i,1);
            }
        }
        for (int i :b){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else {
                map.put(i,1);
            }
        }

        for (Map.Entry<Integer, Integer> map2 : map.entrySet()) {
            if(map2.getValue() >1){
                System.out.println(map2.getKey());
            }
        }

    }
}
