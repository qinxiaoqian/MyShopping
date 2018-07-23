package cn.jbit.classandobject.test1;

public class ScoreCalc {
	int scoreJ;
	int scoreC;
	int scoreDB;
	
	int sum;
	double avg;
	public int showSum() {
		sum=scoreJ+scoreC+scoreDB;
		return sum;	
	}
	public double showAvg() {
		avg=sum/3;
		return avg;
	}

}
