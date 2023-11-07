package BasicJavaPackege;
import java.util.ArrayList;

public class EvenOddArray {

	public static void main(String[] args) {
		int a[]= {4,2,3,5,6,7,8,9,11,15,16,18};
		
		ArrayList<Integer> a1=new ArrayList();
		ArrayList<Integer> a2=new ArrayList();
		for(int i=0;i<a.length-1;i++) {
			if(i%2==0) {
				a1.add(a[i]);
			}
			else {
				a2.add(a[i]);
				
			}
		}
		for(int no:a1) {
			System.out.println("Even no = "+no+"\n");
			
		}
		for(int no:a2) {
			System.out.println("Odd no = "+no+"\n");
		}
		
		

	}

}
