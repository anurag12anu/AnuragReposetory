package BasicJavaPackege;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		System.out.println("Enter row and col");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//int m=sc.nextInt();
		System.out.println("Enter the arrays");
		int[][] arr=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Print the matrix");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		int Addcol=0;
		int Addro=0;
		int i,j;
		System.out.println("Print the  sum of Diagonal");
			for (i=0;i<n;i++) {
				for( j=0;j<n;j++) {
				if(i==j)
					Addcol+=arr[i][j];
				if(i==n-1)
					Addro+=arr[i][j];
				
			}
		}
			System.out.println(Addcol+"\t");
			System.out.println(Addro+"\t");
			
		

	}

}
