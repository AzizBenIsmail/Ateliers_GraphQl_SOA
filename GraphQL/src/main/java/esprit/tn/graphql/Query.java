package esprit.tn.graphql;
import esprit.tn.entity.Student;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

import esprit.tn.repository.StudentRepository;

public class Query implements GraphQLRootResolver {

		private final StudentRepository studentRepository;

		public Query(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;

		}

		public List<Student> allStudents() {
		return studentRepository.getAllStudents();
		}

		 
		
}
