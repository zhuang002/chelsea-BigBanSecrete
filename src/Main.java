import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		
		String retString = "";
		
		for (int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			char decoded = decode(c, i+1, k);
			retString += decoded;
		}
		System.out.println(retString);
	}

	private static char decode(char c, int p, int k) {
		// TODO Auto-generated method stub
		int shift = 3*p+k;
		int offset = c-'A';
		offset -= shift;
		offset = offset % 26;
		if (offset<0)
			offset += 26;
		char retChar = (char)('A'+offset);
		return retChar;
	}

}
