package BasicJavaPackege;
import java.util.Scanner;

public class AddArray {

	public static void main(String[] args) {
		int[] a= {70,56,89,45,30,14};
		int i,j,k=3;
		int temp=0;
		for( i=0;i<a.length;i++) {
		
			for(j=0;j<a.length-1-i;j++) {
				if(a[j]<a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				
				}
				
			}
			if(i==k-1) {
				System.out.println(a[i]+"\n");
			}
		}
		
			for( i=0;i<a.length;i++) {
				System.out.println(a[i]+"\t");
			}
			
		}
		
		
	}


