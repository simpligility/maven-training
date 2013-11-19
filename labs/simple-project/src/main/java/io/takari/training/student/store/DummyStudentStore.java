package io.takari.training.student.store;

import io.takari.training.student.Student;
import io.takari.training.student.StudentStore;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.inject.Singleton;

@Singleton
public class DummyStudentStore implements StudentStore {
	
	private final Map<Integer,Student> studentMap;
	
	public DummyStudentStore() {
		studentMap = new HashMap<Integer, Student>();
	}
	
	public boolean exists(Integer id) {
		return studentMap.containsKey( id );
	}
	
	public Student load(Integer id) {
		Student s = studentMap.get(id);
		return s;
	}

	public Student save(Student p) {
		if( p.getId() == null ) {
			p.setId( studentMap.size() + 1 );
		}
		studentMap.put( p.getId(), p );	
		return p;
	}

}
