package BasicJavaPackege;

public class BainarySearch {

	public static void main(String[] args) {
		int a[]={40,45,30,41,14,78,87,95};
		int sr=14;
		int li=0;
		int hi=a.length-1;
		int mi=li+hi/2;
		while(li<=hi) {
			if(a[mi]==sr) {
				System.out.println(mi+"Index no");
			}
			else if(a[mi]<sr){
				li=mi+1;
				System.out.println(li);

			}
			else {
				hi=mi-1;
				System.out.println(hi);
			}
			mi=(li+hi)/2;
		}
		if(li>hi) {
			System.out.println("Element not found");
		}
		
	}

}
