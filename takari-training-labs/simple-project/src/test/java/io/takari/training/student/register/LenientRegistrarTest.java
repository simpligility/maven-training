package io.takari.training.student.register;

import io.takari.training.student.Registrar;
import io.takari.training.student.Student;
import io.takari.training.student.StudentStore;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class LenientRegistrarTest {

	private StudentStore studentStore;

	private Registrar registrar;

	@Before
	public void setup() {

		studentStore = new MockStudentStore();
		registrar = new LenientRegistrar(studentStore);

	}

	@Test
	public void testRegisterStudent() {

		Student registered = registrar.registerStudent("Elon Mush", 14);

		assertTrue(registrar.checkStudentStatus(registered.getId()));

	}

	// This test is designed to fail.
	// @Test
	// public void testRegisteredStudent() {
	// assertTrue( registrar.checkStudentStatus( 23 ) );
	// }

}
