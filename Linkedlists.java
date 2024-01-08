import java.util.Collections;
import java.util.LinkedList;

class Linkedlists {
  public static void main(String arg[]) {
    LinkedList<String> link = new LinkedList<String>();
    
    link.add("My");
    link.add("Name");
    link.add("is");
    link.add("Ankit Regmi");

    System.out.println(link);
    System.out.println(link.get(1));
    System.out.println(link.getFirst());

    link.addFirst("Hello");
    link.addLast(".");

    System.out.println(link);

    link.set(3, "was");
    System.out.println(link);
    System.out.println(link.size());

    Collections.sort(link);
    System.out.println(link);

    link.remove(0);
    System.out.println(link);

    link.add(2,"MY friend");
    System.out.println(link);

    System.out.println(link.indexOf("Hello"));

    LinkedList<String> link1 = new LinkedList<>();
    link1.addAll(link);
    System.out.println(link1);
  }
}