
public class SkiingResult {
 double firstLapTime;
 double secondLapTime;
 double thirdLapTime;
 double fourthLapTime;
 int finishingPosition;
 int penalties;
 
 SkiingResult(int finishingPosition, double firstLapTime, double secondLapTime, double thirdLapTime, double fourthLapTime, int penalties){
	 this.firstLapTime = firstLapTime;
	 this.secondLapTime = secondLapTime;
	 this.thirdLapTime = thirdLapTime;
	 this.fourthLapTime = fourthLapTime;
	 this.finishingPosition = finishingPosition;
	 this.penalties = penalties;
 }
}
