import java.math.BigDecimal;

public class ArrayRunner {
	public static void main(String[] args) {

		Student student = new Student("Jagadeesh", 10, 97, 105, 40, 50);
		int number = student.getNumberOfMarks();
		System.out.println("No.Of Marks: " + number);
		int sum = student.getTotalSumOfMarks();
		System.out.println("Sum of Marks:" + sum);
		int maximumMark = student.getMaxMark();
		System.out.println("Max Marks gained in all Subjects is : " + maximumMark);
		int minMark = student.getMinMark();
		System.out.println("Min Marks gained in all Subjects is : " + minMark);
		BigDecimal average = student.getAverageMark();
		System.out.println("Avg Marks gained in all Subjects is : " + average);

		student.addNewMark(23);

		System.out.println(student);
		student.removeMark(1);
		System.out.println(student);

	}

}