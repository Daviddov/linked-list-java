
public class Main {

	public static void main(String[] args) {
LinkedList list = new LinkedList();
list.addLast(10);
list.addLast(20);
list.addLast(30);
list.addFirst(5);
list.removeFirst();
list.removeLast();
System.out.println(list.indexOf(30));
System.out.println(list.contains(30));

	}
}
