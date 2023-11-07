package BasicJavaPackege;

public class BasicPrimeNo {

	public static void main(String[] args) {
		for(int n=1;n<=100;n++) {
			int cout=0;
			int m=n;
			for(int i=1;i<=m;i++) {
				if(m%i==0) {
				cout=cout+1;
				}
			}
			if(cout==2) {
				System.out.println(n);
			}
		}

	}

}
