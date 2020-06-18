package Basics;

public class Weather {

	public static void main(String[] args) {
	//what to wear based on the temperature - if statements
		
		float temperature = 80;
		String sunCondition = "Sunny";
		
		if (temperature > 80) {
			System.out.println("Warm now, wear something cute!");
		}
		else if (temperature < 60 && sunCondition == "Sunny") {
			System.out.println("Cool now, wear something warm.");
			System.out.println("Wear a hat!");
		}
		else
		{
			System.out.println("Cold day, bring a sweater");
		}
		
		System.out.println("Program is ending");

	}

}
