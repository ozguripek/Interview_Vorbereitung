package interviewVorbereitung;

public class _08_Angle {

	public static void main(String[] args) {
		
		System.out.println(angle(6,30));
		
		

	}

	public static int angle(int hour, int minute) {

		if (hour >= 0 && hour <= 12 && minute>=0 && minute <=60) {

			int hourmove = (hour * 30) + (minute * 1/2);
			int angle = (hourmove - minute * 6);

			if (angle < 0) {
				angle *= -1;
			} else if (angle > 180) {
				angle = 360 - angle;
			}
			
			return angle;

		}else {
			System.out.println("Invalid time.Try an other one!");
			return 0;
		}

	}

}
