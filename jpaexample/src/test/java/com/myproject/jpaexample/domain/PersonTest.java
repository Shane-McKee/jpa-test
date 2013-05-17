package com.myproject.jpaexample.domain;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PersonTest {

	@Test
	public void type() throws Exception {
		assertThat(Person.class, notNullValue());
	}

	@Test
	public void instantiation() throws Exception {
		Person target = new Person();
		assertThat(target, notNullValue());
	}

	@Test
	public void toString_A$() throws Exception {
		Person target = new Person();
		String actual = target.toString();
		assertThat(actual, notNullValue());
	}

}
