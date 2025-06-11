import java.util.ArrayList;

public class Subsets {
    static ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> list, int index){
        ArrayList<ArrayList<Integer>> allLists;
        if(list.size() == index){
            allLists = new ArrayList<ArrayList<Integer>>();
            allLists.add(new ArrayList<Integer>());
        }else{
            allLists = getSubsets(list, index+1);
            int item = list.get(index);
            ArrayList<ArrayList<Integer>> moresubsets = new ArrayList<ArrayList<Integer>>();
            for(ArrayList<Integer> subset: allLists){
                ArrayList<Integer> newsubset = new ArrayList<Integer>();
                newsubset.addAll(subset);
                newsubset.add(item);
                moresubsets.add(newsubset);
            }
            allLists.addAll(moresubsets);
        }
        return allLists;
    }

}