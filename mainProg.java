
import java.util.Scanner; 

public class mainProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//initialize the Scanner
		Scanner keyboard = new Scanner(System.in); 
		
		Wall_e walle = new Wall_e(); 
		R2_D2 r2d2 = new R2_D2(); 
		Terminator term = new Terminator(); 
		
		//variables for input 
		int choice = 0; 
		String yesOrNo = ""; 
		boolean saved = false;
		
		do {
			System.out.println("Choose a robot to save the Earth from aliens"); 
			System.out.println("=============================================");
			System.out.println("1.) Wall-e");
			System.out.println("2.) R2-D2");
			System.out.println("3.) Terminator");
			
			choice = keyboard.nextInt(); 
			
			switch(choice) {
			case 1:
				walle.displayInfo();
				yesOrNo = keyboard.next(); 
				saved = walle.askToSaveWorld(yesOrNo); 
				break; 
			case 2:
				r2d2.displayInfo();
				yesOrNo = keyboard.next();
				saved = r2d2.askToSaveWorld(yesOrNo); 
				break;
			case 3:
				term.displayInfo();
				yesOrNo = keyboard.next();
				saved = term.askToSaveWorld(yesOrNo); 
				break;
			}
			
		}while(saved != true); 
			
		
		
		
	}

}
