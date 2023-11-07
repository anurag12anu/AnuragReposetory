package BasicJavaPackege;

public class Apprear {

	public static void main(String[] args) {
		int[] a= {1,2,5,5,1,2,8,9,8};
		int rev=0;
		for(int i=0;i<a.length;i++) {
			rev=rev^a[i];
			
		}
		System.out.println(rev);

	}

}
