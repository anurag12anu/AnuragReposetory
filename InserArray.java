package BasicJavaPackege;

public class InserArray {

	public static void main(String[] args) {
		int a[]= {40,78,98,65,20};
		int in=100;
		int pos=3;
		for(int i=a.length-1;i>=pos-1;i--) {
			a[i]=a[i-1];
			
		}
		a[pos-1]=in;
		for(int no:a) {
			System.out.println(no);
		}

	}

}
