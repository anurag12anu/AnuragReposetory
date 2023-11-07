package BasicJavaPackege;

public class SelectionSort {

	public static void main(String[] args) {
		int a[]={40,45,30,41,14,78,87,95};
		int temp=0;
		int k=5;
		
		for(int i=0;i<a.length;i++) {
			int min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
					min=j;
					
				}
				temp=a[i];
				a[i]=a[min];
				a[min]=temp;
				
			}
			if(i==k-1) {
				System.out.println("4th Smallest no ="+a[i]);
			}
			
		}
		for( int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		

	}
	

}
