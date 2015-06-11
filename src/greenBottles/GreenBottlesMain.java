package greenBottles;

public class GreenBottlesMain {
	
	public static void main(String [] args){
		
		int count = 10;
		String bot = "bottles";
		
		if(count == 1){
			bot = "bottle";
		}
		while(count >0){
		System.out.println(count +" green " +bot +" hanging on the wall,");
		System.out.println(count +" green " +bot +" hanging on the wall,");
		System.out.println("if one green bottle should accidentally fall" );
		System.out.println("There'll be " +(count -1)+ " green " +bot +" hanging on the wall");
		
			count--;
			System.out.println();
		}
	}

}
