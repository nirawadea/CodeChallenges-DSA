public class SerachElementInArray {

//    public SerachElementInArray(String element){
//        this.element = element;
//    }

    public int getElement(String element, String[] array){
        for(int i=0; i<array.length; i++){
            if (array[i].equals(element)){
                return i;
            }
        }
        return -1;
    }
}
