package GS;

import java.util.ArrayList;
import java.util.List;

public class student_avg {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();

		int marks[][] = { { 4, 8, 9 }, { 3, 6, 7 }, { 2, 9, 9 } };
		String students[] = { "ram", "naam", "shyaam" };
		for (int i = 0; i < marks.length; i++) {
			double sum = 0;
			for (int j = 0; j < marks[0].length; j++) {
				sum += marks[i][j];
			}

			double avg = sum / marks[0].length;
			list.add(new Student(students[i], avg));
		}
		
		for (Student s : list) {
			System.out.println(s.name + " " + s.avg);
		}
		
	}
}

class Student {
	String name;
	double avg;

	Student(String name, double avg) {
		this.name = name;
		this.avg = avg;
	}
}
