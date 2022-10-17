package esprit.tn.repository;

import java.util.ArrayList;
import java.util.List;

import esprit.tn.entity.Student;

public class StudentRepository {

		private final List<Student> students;

		public StudentRepository() {
		students = new ArrayList<Student>();

		students.add(new Student("@123456780", "Test Ben TEST", "test@esprit.tn”"));
		students.add(new Student("22551100", "Mohamed ben SALAH", "med.salsahfesprit.tn"));

		}

		public List<Student> getAllStudents() {
		return students;
		}

		public void saveStudent(Student student) {
		students.add(student);

		 
		}
}
