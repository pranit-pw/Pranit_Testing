package Cities;

public class Delhi {
	
	public static void main(String[] args) {
		
		String a = "Velocity" ;
		String b = "Velocity" ;
		
		String c = new String("Velocity") ;
		String d = new String("Velocity") ;
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b);
		System.out.println("========");
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(c==d);
		System.out.println("========");
		
		b = "Class" ;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b);
		System.out.println("========");
		
		
		a.equals(c);
	}

}
