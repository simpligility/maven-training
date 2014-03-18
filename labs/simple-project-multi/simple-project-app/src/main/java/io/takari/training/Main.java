package io.takari.training;

import io.takari.training.student.Registrar;
import io.takari.training.student.Student;
import io.takari.training.student.StudentStore;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println( StringUtils.reverse("!dlrow olleH"));
		System.out.println( "Welcome to the Registration Database App...");
		System.out.println( "Person ID? " );
		Scanner scanner = new Scanner(System.in);
		Integer personId = new Integer( scanner.nextLine() );
		scanner.close();
		
		System.out.printf( "You supplied Person ID %d searching...\n", personId );
		
		Injector injector = Guice.createInjector(new SimpleModule() );
		StudentStore studentStore = injector.getInstance( StudentStore.class );
		Registrar registrar = injector.getInstance( Registrar.class );

		Student s = new Student( personId, 12 );
		studentStore.save( s );
		
		boolean status = registrar.checkStudentStatus( personId );	
		
		if( status ) {
			System.out.println( "This student is currently enrolled and meets " +
							    "the registrar's criteria" );
		} else {
			System.out.println( "This student does not meet the registrar's criteria" );
		}
		
	}

}
