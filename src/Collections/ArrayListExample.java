package Collections;
import java.util.ArrayList;
public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrli = new ArrayList<>(); // Declaring the ArrayList without mentioned its
		for (int i = 0; i <= 5; i++) // Appending new elements at the end of the list
			arrli.add(i);
		System.out.println(arrli);
		arrli.remove(5);  // Remove element at index 5
		System.out.println(arrli);
		arrli.remove(4);  // Remove element at index 4
		System.out.println(arrli);
		arrli.remove(3);  // Remove element at index 3
		System.out.println(arrli);
		arrli.remove(2); // Remove element at index 2
		System.out.println(arrli);
		arrli.remove(1);  // Remove element at index 1
		System.out.println(arrli);// Displaying the ArrayList // after deletionPrinting elements one by one
		for (int i = 0; i < arrli.size(); i++)
		System.out.println(arrli.get(i) + " ");
		System.out.println("***********");
		arrli.add(1);   // add element at index 1
		System.out.println(arrli);
		arrli.add(2); 
		System.out.println(arrli);
		arrli.add(3); 
		System.out.println(arrli);
		arrli.add(4); 
		System.out.println(arrli);
		arrli.add(5); 
		System.out.println(arrli);
	}
}


