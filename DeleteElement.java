package BasicJavaPackege;

public class DeleteElement {

	public static void main(String[] args) {
		int a[]= {40,78,98,65,20};
		int de=98;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==de) {
				a[i]=a[i+1];
			}
		}
		for(int no:a) {
			System.out.println(no);
		}


	}

}
