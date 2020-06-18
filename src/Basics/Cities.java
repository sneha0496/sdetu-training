package Basics;

public class Cities {

	public static void main(String[] args) {
		
		//declare and define an array of string
		String cities[] = {"NY","SFO", "Dallas","Miami"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		//declare an array
		String states[] = new String[5];
		states[0]="California";
		states[1]="NJ";
		states[2]="Utah";
		states[3]="Ohio";
		states[4]="Texas";
		System.out.println(states[0]);
		System.out.println(states[1]);
		System.out.println(states[2]);
		System.out.println(states[3]);
		System.out.println(states[4]);
		
		//integer for the index in the loop
		int i = 0;
		
		//boolean for the for lop in the while loop
		boolean stateFound = false;
		
		//to print all the elements in a do-while loop - enters loop first and then checks the condition
		do {
			System.out.println(states[i]);
			i = i+1;
		} while (!stateFound);
		

		//while loop - checks the condition first and then enters the loop;
		while (i <= 5) {
			String state = states[i];
			if (state == "Texas") {
				stateFound = true;
			}
			i++;
		}
		
	}	

}
