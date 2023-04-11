package Cities;

public class Mumbai {
	
	static int a = 10 ;
	       int b = 20 ;

	public void test() {
		
         int a = 30 ;
         int b = 40 ;
         
         System.out.println(a);
         System.out.println(b);
         System.out.println(Mumbai.a);
         System.out.println(this.b);
	}

     public static void main(String[] args) {
    	 
    	 Mumbai x = new Mumbai ();
    	 
    	 x.test();
    	 
     }
}