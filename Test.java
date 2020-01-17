import java.util.Scanner;

class Test {

	public static void main(String ar[]) { 
		Scanner in=new Scanner(System.in);

		int sum=0;
		System.out.println("Enter any String value.");
		String input=in.nextLine();
		//System.out.println("+input+");
		char ch[]=input.toCharArray();

		int zeroAscii=(int)'0';
		for(char c : ch) {
		int tempAscii=(int)c;
		sum=(sum*10)+(tempAscii-zeroAscii);
		}
		System.out.println(sum);
	}
}