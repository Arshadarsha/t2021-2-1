
import java.util.Scanner;
public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=scan.nextInt();
		int val = n%2!=0 ? n : n-1;
		
		for(int j=0;j<val*2;j++) {
			if(j%2!=0) {
				System.out.print(j+" ");
			}
		}
		

	}

}
