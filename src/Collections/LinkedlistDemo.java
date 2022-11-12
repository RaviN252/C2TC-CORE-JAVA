package Collections;
import java.util.LinkedList;
public class LinkedlistDemo {
	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		// adding elements to the list
		list.add("ravi");
		list.add("pavi");
		list.add("navi");
		System.out.println(list);
		// adding an element to the first position
		list.addFirst("Rock");
		
		// adding an element to the last position
		list.addLast("Rahul");
		System.out.println(list);
		
		// adding an element to the 4 position
		list.add(3,"praveeen");
		list.add(3,"G1");
		System.out.println(list);
		
		// iterating linkedlist
		java.util.Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
