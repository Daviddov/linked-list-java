import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
LinkedList list = new LinkedList();
list.addLast(10);
list.addLast(20);
list.addLast(30);
list.addFirst(5);
//list.removeFirst();
//list.removeLast();
System.out.println(list.getSize());
System.out.println(list.contains(30));
list.reverse();
System.out.println(Arrays.toString(list.toArray()));
System.out.print(list.fromLast(4));

	}
}
