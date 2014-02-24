package io.takari.training;

import io.takari.training.student.Registrar;
import io.takari.training.student.StudentStore;
import io.takari.training.student.register.LenientRegistrar;
import io.takari.training.student.store.DummyStudentStore;

import com.google.inject.AbstractModule;

public class SimpleModule extends AbstractModule {

	@Override
	protected void configure() {
		
		bind(StudentStore.class).to(DummyStudentStore.class);

		bind(Registrar.class).to(LenientRegistrar.class);
	}

}
