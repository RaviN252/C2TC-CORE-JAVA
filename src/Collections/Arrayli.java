package Collections;
import java.util.ArrayList;
public class Arrayli {
	
	static ArrayList<String> listNames = new ArrayList<>();
	
	void dispalyList ( ArrayList<String> listName)  // object
	{
		for (String name :listNames) 
		{
			System.out.println(name);
		}
	}
	
	
	
	void removeNameByPositipon ( int pos)  // remove by position
	{
		listNames.remove(pos);
	}
	void removeNameByString (String name)  // remove by position
	{
		listNames.remove(name);
	}
	
	
	void modifyName(int pos, String newName) // modify name
	{
		listNames.set(pos, newName);
	}
	
	int search(String name)// search by string & fetch pos
	{
		return listNames.indexOf(name);
	}

	public static void main(String[] args) {
		
		Arrayli ap = new Arrayli ();
		listNames.add("Ravi");
		listNames.add("john");
		listNames.add("pavi");
		System.out.println(listNames);         //  O/P [Ravi, john, pavi] 
		System.out.println(listNames.get(0));  // O/P Ravi
		System.out.println(listNames.get(2));  // O/P Pavi
		
		
		// remove by position
		ap.removeNameByPositipon(0);
		System.out.println("********");
		ap.dispalyList(listNames);
		System.out.println("********");
		System.out.println(listNames.get(0));
		System.out.println(listNames.get(1));
		
		
//		// remove by String
//		System.out.println("#########");
//		ap.removeNameByString("john");
//		ap.dispalyList(listNames);
//		System.out.println("########");
//		System.out.println(listNames.get(0));
//		System.out.println(listNames.get(1));
//		
		
		
		// modify list
		ap.modifyName(0, "RAVIN1");
		System.out.println("!!!!!!!!!!!!!");
		ap.dispalyList(listNames);
		
		//search for string and replace
		int pos  = ap.search("pavi");
		System.out.println(pos);

	}

}
