import java.util.Arrays;

public class ArrayBag<T> {

  private final T[] bag;
  private int numberOfEntries;
  private static final int Default_Capacity = 10;

  public ArrayBag(){
      this(Default_Capacity);
  }

  public ArrayBag(int capacity){
      bag = (T[]) new Object[capacity];
      numberOfEntries = 0;
  }

  private boolean isArrayFull(){
      return numberOfEntries > bag.length;
  }

  public boolean add(T newEntry){
      if(isArrayFull()){
          System.out.println("Cannot add: Bag is full");
          return false;
      }else {
          bag[numberOfEntries] = newEntry;
          numberOfEntries++;
          return true;
      }

  }

  public boolean remove(T entry){
      int index = getIndexOf(entry);
      if(index != -1){
          bag[index] = bag[numberOfEntries-1];
          bag[numberOfEntries-1] = null;
          numberOfEntries--;
          return true;
      }
      return false;
  }

  public int getIndexOf(T entry){
      for (int i = 0; i<numberOfEntries; i++){
          if(bag[i].equals(entry)){
              return i;
          }
      }
      return -1;
  }

  public boolean contains(T entry){
      return getIndexOf(entry) != -1;
  }

  public int size(){
      return numberOfEntries;
  }

  public  boolean isEmpty(){
      return numberOfEntries == 0;
  }

  public T[] toArray(){
      return Arrays.copyOf(bag, numberOfEntries);
  }

  public void clear(){
      for (int i =0; i<numberOfEntries; i++){
          bag[i] = null;
      }
      numberOfEntries =0;
  }
}
