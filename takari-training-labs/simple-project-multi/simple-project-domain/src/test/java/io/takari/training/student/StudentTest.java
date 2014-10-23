package io.takari.training.student;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest {

    @Test
    public void testNewStudent() {
        Student student = new Student();
        student.setName("Manfred");
        assertNotNull(student); // constructor worked..
        assertEquals("Manfred", student.getName());
    }

}
