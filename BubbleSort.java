package BasicJavaPackege;

public class BubbleSort {

	public static void main(String[] args) {
		int a[]= {40,45,30,41,14,78,87,95};
		int temp=0;
		int k=6;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			if(i==k-1) {
				System.out.println("5th smellest no ="+a[i]+"\t");
			}
		}
		for(int no:a) {
			System.out.println(no+"\t");
			
		}

	}

}
