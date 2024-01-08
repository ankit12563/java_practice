import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
  public static void main(String arg[]) {

    ArrayList<Integer> array = new ArrayList<>();

    array.add(7);
    array.add(10);

    System.out.println(array.get(0));

    array.set(0,1);
    System.out.println(array.get(0));

    Collections.sort(array, Collections.reverseOrder());
    System.out.println(array);


  }
  
}
