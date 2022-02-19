package ua.lviv.lgs.enumeration.homework;

public enum Month{
	 
    JANUARY (Seasons.WINTER, 31),
    FEBRUARY (Seasons.WINTER,28),
    MARCH (Seasons.SPRING, 31),
    APRIL (Seasons.SPRING, 30),
    MAY (Seasons.SPRING, 31),
    JUNE (Seasons.SUMMER, 30),
    JULY (Seasons.SUMMER, 31),
	AUGUST (Seasons.SUMMER, 31),
	SEPTEMBER (Seasons.FALL, 30),
	OCTOBER (Seasons.FALL, 31),
	NOVEMBER (Seasons.FALL, 30),
	DECEMBER (Seasons.WINTER, 31);
	
	Seasons season;
	int numOfDays;
	
	private Month(Seasons season, int numOfDays) {
		this.season = season;
		this.numOfDays = numOfDays;
	}

	public Seasons getSeason() {
		return season;
	}

	public int getNumOfDays() {
		return numOfDays;
	}
	
	


}
