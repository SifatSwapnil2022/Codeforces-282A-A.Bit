import java.util.Scanner;

public class Bit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count=0;
		
		int i =0;
		
		while(i<n) {
			String s = sc.next();
			if(s.charAt(0)=='+') {
				count++;
			}
			
			else if(s.charAt(0)=='X'  &&  s.charAt(1)=='+') {
				count++;
			}
			else
			{
				count--;
			}
			i++;
		}
		
System.out.println(count);
	}

}
