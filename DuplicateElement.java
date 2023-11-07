package BasicJavaPackege;

public class DuplicateElement {

	public static void main(String[] args) {
		int a[]= {1,5,6,4,5,8,4,9,7,9,8,10};
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length-1;j++) {
				if((a[i]==a[j])&&(i!=j)) {
					System.out.println(a[j]);
				}
			}
		}

	}

}
