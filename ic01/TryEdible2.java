public class TryEdible2 {

  	public static void main (String [] args) {
		Edible n = new Edible(){
				public int getCalories() { return 110; }
			};
		System.out.println("n: " + n);
	}
						
} 
