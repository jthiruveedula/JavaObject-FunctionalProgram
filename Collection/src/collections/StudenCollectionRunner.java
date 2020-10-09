package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudenCollectionRunner {


	public static void main(String[] args) {
		
		List<Student> students = List.of(new Student(7, "jagadeesh"), new Student(8, "gayethri"),
				new Student(9, "great"));
//		System.out.println(students);

		List<Student> studentsort = new ArrayList<>(students);
		System.out.println("NonSorted Output:-" + studentsort);

		Collections.sort(studentsort);
		System.out.println("Sorted Output:- " + studentsort);

	}
}
