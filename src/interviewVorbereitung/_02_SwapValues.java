package interviewVorbereitung;

public class _02_SwapValues {

	public static void main(String[] args) {
		int a=10;
		int b=4;
		
		System.out.println(a+","+b);
		
		b=a+b;
		a=b-a;
		b=b-a;
		
		System.out.println(a+","+b);
		
		b=a*b;
		a=b/a;
		b=b/a;
		System.out.println(a+","+b);
	}

}
