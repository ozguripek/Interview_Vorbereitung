package interviewVorbereitung;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _05_MaxNumber {

	public static void main(String[] args) {
		int[]intArr= {74, 8, 12, 25, 56};
		Arrays.sort(intArr);
		System.out.println("min of array: " + intArr[0]);
		System.out.println("max of array: " + intArr[intArr.length-1]);
		
		List<Integer> list= new ArrayList<>();
		
		for( int i=0; i<intArr.length;i++) {
			
			list.add(intArr[i]);
		}
		System.out.println(list.toString());
		
		Collections.sort(list);
		System.out.println("min of list: "+list.get(0));
		System.out.println("max of list: " + list.get(list.size()-1));
		

	}

	
}


