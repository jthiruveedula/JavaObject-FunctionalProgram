
public class SwitchPractice {

	public static void main(String[] args) {
//		System.out.println(findingDayinWeek(4));

		System.out.println(isWeekDay(2));


	}

	public static String findingDayinWeek(int day) {
		String res="";
		switch(day) {
		
		case 0:
			return "Sunday";

		case 1:
			return "Monday";

		case 2:
			return "Tues";

		case 3:
			return "Wed";

		case 4:
			return "Thru";

		case 5:
			return "Fri";

		case 6:
			return "Sat";

		
		}
		return "Enter Valid Day!";

	}

	public static String findingMonth(int mon) {

		switch (mon) {

		case 12:
			return "DEC";

		case 1:
			return "JAN";

		case 2:
			return "FEB";

		case 3:
			return "MAR";

		case 4:
			return "APR";

		case 5:
			return "JUN";

		case 6:
			return "JUL";
		case 7:
			return "AUG";
		case 8:
			return "SEP";
		case 9:
			return "OCT";
		case 10:
			return "NOV";
		case 11:
			return "Sat";


		}
		return "Enter Valid NUM for finding Month!";

	}

	public static boolean isWeekDay(int day) {

		switch (day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			return true;
		}
		return false;

	}

}
