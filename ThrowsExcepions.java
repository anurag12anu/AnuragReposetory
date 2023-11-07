package BasicJavaPackege;

public class ThrowsExcepions  {
	void sum() throws ArithmeticException{
		int a=45,b=0,c;
		c=a/b;
		System.out.println(c);
		
	}

	public static void main(String[] args) {
		ThrowsExcepions ts=new ThrowsExcepions();
	
		try {
		ts.sum();
		}
		catch(ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("Excepion ");
		}
		
		
	}

}
