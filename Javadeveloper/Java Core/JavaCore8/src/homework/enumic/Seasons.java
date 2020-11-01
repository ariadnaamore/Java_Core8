package homework.enumic;

public enum Seasons {
WINTER, SPRING, SUMMER, FALL;
	
	
	
	private static Seasons[] seasons = values();
	

	
	//method for next season		
	public Seasons getNextSeason (String s) {
		for (int i =0 ;i<seasons.length; i++) {
			Seasons season = seasons[i];
			if (season.name().equalsIgnoreCase(s)) {
				if(i<3) {
					return seasons[i+1];
				}
			} return seasons[0];
		} return null;
	}
	
	
		
		
		//method for previous seasons
		
		public Seasons getPrevSeasons (String s1) {
			for (int i =0;i<seasons.length; i++) {
				Seasons season = seasons[i];
				if (season.name().equalsIgnoreCase(s1)) {
					if(i==0) {
						return seasons[3];
					}if(i<=3) {
						return seasons[i-1];}
				}
				}return null;
		} 
		//else method for previous seasons
		/*
		 * public Seasons getPrevSeasons2(String s3) {
		 * 
		 * Seasons prevseason = null; for (int i =0; i<seasons.length; i++) { Seasons
		 * season = seasons[i]; if(season.name().equalsIgnoreCase(s3)) { if (i !=0)
		 * prevseason = seasons[i-1]; else prevseason = seasons[3]; } } return
		 * prevseason; }
		 */
		
}
