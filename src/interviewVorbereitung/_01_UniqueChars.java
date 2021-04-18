package interviewVorbereitung;

public class _01_UniqueChars {

	public static void main(String[] args) {
		String str="jsdgdbvaaannndfnknkvifobfpp";
		String unique= ""  ;
		
		for (int i=0; i<str.length();i++) {
			if(!unique.contains(String.valueOf(str.charAt(i)))) {
				unique += str.charAt(i);
			}
		}	
		System.out.println(unique);
	}

}
