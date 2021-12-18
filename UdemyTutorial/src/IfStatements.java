
public class IfStatements {
	
	public static void main(String[] args) {
		int age = 36;
		
		if(age >= 18 && age <= 20) {
			System.out.println("Buy cigarettes & go vote!");
		}
		else if(age >= 21 && age <= 29) {
			System.out.println("Drink ALL da beers!");
		}
		else if(age >= 65) {
			System.out.println("Go to Florida, it's time to retire!");
		}
		else if(age >= 30 && age <= 50) {
			System.out.println("Stop whining & get back to work.");
		}
		else {
			System.out.println("Until you're older, go play in the mud.");
		}
	}

}
