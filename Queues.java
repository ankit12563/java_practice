import java.util.LinkedList;
import java.util.Queue;
class Queues {
  public static void main(String arg[]) {
    
    Queue<String> q = new LinkedList<>();

    q.add("Ankit");
    q.add("Afrin");

    while(!q.isEmpty()){
      System.out.println(q.peek());
      q.remove();

    }
  }
}
