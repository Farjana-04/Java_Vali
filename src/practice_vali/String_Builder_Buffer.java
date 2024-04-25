package practice_vali;

public class String_Builder_Buffer {

	public static void main(String[] args) {
		//String is an immutable object. Once its created is not going to change. 
		//If we create another object for String, automatically this new object count as a garbage collection. 
		//String s = new String("yes");
		//s.concat("No");
		//System.out.println(s);
		
		//StringBuffer is an mutable object. Once its created its can be change. If we create another object for String, automatically its
		//StringBuffer st = new StringBuffer(" New ");
//		st.append(" Old ");
//		System.out.println(st);
		
		//What is the difference between == and .equals() in Java?***
		//In Java, "==" is used for reference equality, which means that it checks whether two objects refer to the same memory location.
		String s1 = "hello";
		String s2 = new String("hello");

		if (s1 == s2) {
		  System.out.println("s1 and s2 are the same object");
		} else {
		  System.out.println("s1 and s2 are different objects");
		}
		//Value equality takes place when two separate objects happen to have the same values or state.
		//This compares values and is closely related to the Object's equals() method.
        String p1 = "hello";
		String p2 = new String("hello");

		if (p1.equals(p2)){ 
		  System.out.println("p1 and p2 have the same value");
		} else {
		  System.out.println("p1 and p2 have different values");
		}     
	}

}
