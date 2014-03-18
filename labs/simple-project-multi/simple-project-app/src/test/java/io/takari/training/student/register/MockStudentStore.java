package io.takari.training.student.register;

import io.takari.training.student.Student;
import io.takari.training.student.StudentStore;

import java.util.HashMap;
import java.util.Map;

public class MockStudentStore implements StudentStore {

	private Map<Integer,Student> students = new HashMap<Integer,Student>();
	
	public boolean exists(Integer id) {
		return students.containsKey( id );
	}

	public Student load(Integer id) {
		return students.get( id );
		
	}

	public Student save(Student p) {
		students.put( p.getId(), p);
		return p;
	}

}
