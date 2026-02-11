public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String evenOrOdd(int x) {
		if (x%2==0) {
			return "Even";
		}
		else {
			return "Odd";
		}
	}

	public static String teacherOrStudent(String x) {
		if (x=="Kalisz") {
			return "Teacher";
		}
		else {
			return "Student";
		}
	}
	public static int fartherFromZero(int x) {
		if (x>0) {
			x=x+5;
			return x;
		}
		if (x<0) {
			x=x-5;
			return x;
		} else {
			return x;
		}
	}

	public static String isFive(int x) {
		if (x==5) {
			return "The number is Five";
		}
		else {
			return "The number is not Five";
		}
	}

	public static String positiveOrNegative(double x) {
		if (x>0) {
			return "Positive";
		}
		else {
			return "Negative";
		}
	}
	public static String highOrLow(int x) {
		if (x>100) {
			return "High";
		}
		else {
			return "Low";
		}
	}
	public static String isHello(String x) {
		if (x=="Hello") {
			return "The word is Hello";
		}
		else {
			return "The word is not Hello";
		}
	}
}
