import java.util.Scanner;

public class P4_Accepting_String {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string with 3 words");
		String s = sc.nextLine();
		int sp = s.indexOf(" ");
		int lis = s.lastIndexOf(" ");
		
		String s1 = s.charAt(0)+"."+s.charAt(sp+1)+"."+s.substring(lis+1);
        System.out.println(s1);
	}

}
