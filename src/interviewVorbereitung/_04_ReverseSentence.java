package interviewVorbereitung;

public class _04_ReverseSentence {

	public static void main(String[] args) {
	String sentence1="hey my name name is özgür";
	System.out.println(sentence1);
	StringBuilder strbuldr= new StringBuilder(sentence1);
	StringBuilder reverse= strbuldr.reverse();
	System.out.println(reverse);

	
	String sentence2= "hey my name is özgür";
	System.out.println(sentence2);
	String revrs= "";
	for(int i=sentence2.length()-1;i>=0;i--) {
		revrs +=sentence2.charAt(i);
	}
	System.out.println(revrs);
	}

}
