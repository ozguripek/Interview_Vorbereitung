package interviewVorbereitung;

public class _03_Reverse {

	public static void main(String[] args) {
		
		String str="abcdefghz";
		System.out.println(str);
		String reversed= "";
		
		for(int i=str.length()-1;i>=0;i--) {
			reversed +=str.charAt(i);
		}
		System.out.println(reversed);
	}

}
