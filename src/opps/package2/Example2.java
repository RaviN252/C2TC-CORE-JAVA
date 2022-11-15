package opps.package2;
import opps.package1.*; //importing package

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 obj = new Example1();
		obj.display();

	}

}


//>>>importing entire pacakge,package1

/*import opps.package1.Example1;
public class Example2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 obj = new Example1();
		obj.display();
	}
	
}*/


//>>>Referring package member and by its fully qualified name

/*public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		opps.package1.Example1 obj = new opps.package1.Example1();
		obj.display();

	}
}*/





