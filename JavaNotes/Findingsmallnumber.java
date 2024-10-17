package Self_note;

import java.util.Arrays;
import java.util.*;

public class Findingsmallnumber  {
	
		int givenarray[] = {1,20,3,32,321,32};
		Integer given[] = {1,20,3,32,321,32};
		//using for loop concept
		void forloop() {
			int smallest = Integer.MAX_VALUE;
			for (int i=0;i<givenarray.length;i++)
			{
				if (smallest>givenarray[i]) {
					smallest = givenarray[i];
			System.out.println(smallest);
				}
			}
		}
		
		// using array sorting concept
			void array() {
				Arrays.sort(givenarray);
				System.out.println(givenarray[0]);
		
			}
			
			//using collections concept
			void collections() {
				List<Integer> list = Arrays.asList(given);
				Collections.sort(list);
				int small = list.get(0);
				System.out.println(small);
				
			}
		
	public static void main(String args[]) {
		Findingsmallnumber output = new Findingsmallnumber();
		output.forloop();
		output.array();
		output.collections();
	}
 
}
