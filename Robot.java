

//Superclass - General class
public class Robot {

	String name; 
	String franchise; 
	int height; //round to feet
	int weight; 
	boolean strongEnough; 
	
	public void displayInfo() {
		System.out.println("Hi, I'm " + name +"."); 
		System.out.println("I am from the famous franchise " + franchise + ".");
		System.out.println("My height is " + height + " feet and my weight is " + weight + " pounds."); 
		System.out.println("Do you want me to save the World?"); 
		System.out.println("Yes or No"); 
		 
	}
	
	public boolean tryToSaveWorld() {
		if (strongEnough) {
			System.out.println("Easy peasy. Time to go John Wick style on these aliens.");
			return true;
		}else {
			System.out.println("..... Well at least I tried.... the Earth was destroyed.\n");
			System.out.println("Let's rewind time and try again."); 
			return false;
		}
	}
	
	public boolean askToSaveWorld(String choice) {
		boolean wasSaved = false; 
		if (choice.toLowerCase().equals("yes") || choice.toLowerCase().equals("y")) {
			System.out.println("Okay, I'll give it a shot. \n"); 
			wasSaved = tryToSaveWorld(); 
		}else {
			System.out.println("Yeah, that's probably for the best"); 
		}
		return wasSaved; 
	}
	
}
