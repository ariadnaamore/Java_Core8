package homework.enumic;

public enum Seasons {
WINTER, SPRING, SUMMER, FALL;
	
	
	
	private static Seasons[] nextses = values();
	
	//method for next season
	public Seasons nextses() {

		return nextses[(this.ordinal()+1)%nextses.length];
	}
	
		
		//method for previous seasonssssss
		
	private static Seasons[] prevses = values();
		public Seasons prevses() {

			return prevses[(this.ordinal()-1+prevses.length)%prevses.length];
			
		
	}
}
