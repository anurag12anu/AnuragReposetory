package BasicJavaPackege;
import java.util.Scanner;

public  class BasicJava {
	public void basic() {
		
		Scanner sc=new Scanner(System.in);
		for(int n=1;n<5000;n++) {
		int f=1,sum=0,r;
		//System.out.println("Enter the number of n");
		//int n=sc.nextInt();
		int m=n;
		
		while(m!=0) {
			int i=1;
			
			r=m%10;
			while(r!=0) {
				f=f*r;
				r=r-1;
			}
		
			
			sum=sum+f;
			f=1;
			m=m/10;
		}
		if(sum==n) {
			System.out.println(n);
			
		}
		
		}
		
				}
		
	
		
	public static void main(String[] args) {
		BasicJava st=new BasicJava();
		st.basic();
		
	}
}
  