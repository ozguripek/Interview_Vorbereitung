package interviewVorbereitung;

public class _06_Faktör {



	public static void main(String[] args) {
		int sayi=5;
		int fct= 1;
		for (int i=sayi; i>0; i--) {
			fct *=i;
		}
		System.out.println(fct);
		
		String factstr= String.valueOf(fct);
		String[] spt= factstr.split("");
		Integer i1= Integer.valueOf(spt[0])+Integer.valueOf(spt[1])+Integer.valueOf(spt[2]);
		
		System.out.println(i1);
		System.out.println("5!=" + fct + "="+i1);

	}
	
	

}
