import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//hello123
class Examples {
//instances of ShootingRound, ShootingResult, SkiingResult, FinalResult, and Athlete classes
ShootingRound shotRoundE1 = new ShootingRound(2);
ShootingRound shotRoundE2 = new ShootingRound(5);
ShootingRound shotRoundE3 = new ShootingRound(3);
ShootingRound shotRoundE4 = new ShootingRound(4);
ShootingRound shotRoundE5 = new ShootingRound(5);

ShootingResult shotResultE1 = new ShootingResult(shotRoundE1, shotRoundE2, shotRoundE3, shotRoundE4);
ShootingResult shotResultE2 = new ShootingResult(shotRoundE1, shotRoundE5, shotRoundE3, shotRoundE4);

SkiingResult skiingResultE1 = new SkiingResult(4, 30, 50.5, 25.7, 15, 0);
SkiingResult skiingResultE2 = new SkiingResult(2, 29, 50.5, 24, 15.5, 1);

FinalResult finalResultE1 = new FinalResult(shotResultE1, skiingResultE1);
FinalResult finalResultE2 = new FinalResult(shotResultE2, skiingResultE2);

Athlete athleteE1 = new Athlete(finalResultE1);
Athlete athleteE2 = new Athlete(finalResultE2);

//dummy test 
	@Test
	void test() {
		assertEquals(skiingResultE1.secondLapTime,skiingResultE2.secondLapTime);
	}

}
