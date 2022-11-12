package Collections;
import java.util.LinkedList;
public class LinkedlistExample {

	public static void main(String[] args) {
		LinkedList<String> LinkedList = new LinkedList<String>();
		// add string elements is usedfor adding
		//the elements to the linked list
		LinkedList.add("item1");
		LinkedList.add("item4");
		LinkedList.add("item3");
		LinkedList.add("item6");
		LinkedList.add("item2");
		
		// display linked list content
		System.out.println("Linked lidt congtent :"+ LinkedList);
		
		// add first and last elements
		LinkedList.addFirst(" first item0");
		LinkedList.addLast("last item9");
		System.out.println("Linked lidt congtent after addition :"+ LinkedList);
		
		// this is how to get and set values
		Object firstVar = LinkedList.get(0);
		System.out.println("First element:"+ firstVar);
		LinkedList.set(0, "changed first item");
		Object firstVar2 = LinkedList.get(0);
		System.out.println("First element after update by set method:"+ firstVar2);
		
		// remove first and last element
		LinkedList.removeFirst();
		LinkedList.removeLast();
		System.out.println("linked list after deletion  of first amd last element:"+ LinkedList);
		
		// add to a position and remove from a position
		//LinkedList.add(0,1); // error becausewe shoud give string not an int
		LinkedList.add(0," Newely added item");
		LinkedList.remove(2);
		System.out.println("final content"+ LinkedList);
	}
}
