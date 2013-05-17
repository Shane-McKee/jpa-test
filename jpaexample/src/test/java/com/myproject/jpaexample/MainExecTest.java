package com.myproject.jpaexample;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.util.List;

import javax.persistence.EntityManager;

import org.junit.Test;

import com.myproject.jpaexample.domain.Person;

public class MainExecTest {

	@Test
	public void type() throws Exception {
		assertThat(MainExec.class, notNullValue());
	}

	@Test
	public void instantiation() throws Exception {
		EntityManager em = null;
		MainExec target = new MainExec(em);
		assertThat(target, notNullValue());
	}

	@Test
	public void main_A$StringArray() throws Exception {
		String[] args = new String[] {};
		MainExec.main(args);
	}

	@Test
	public void createPeople_A$() throws Exception {
		EntityManager em = null;
		MainExec target = new MainExec(em);
		target.createPeople();
	}

	@Test
	public void countPeople_A$() throws Exception {
		EntityManager em = null;
		MainExec target = new MainExec(em);
		int actual = target.countPeople();
		int expected = 0;
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void peopleMaker_A$String$String() throws Exception {
		EntityManager em = null;
		MainExec target = new MainExec(em);
		String first = null;
		String last = null;
		Person actual = target.peopleMaker(first, last);
		Person expected = null;
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void listAllPerson_A$() throws Exception {
		EntityManager em = null;
		MainExec target = new MainExec(em);
		List<Person> actual = target.listAllPerson();
		List<Person> expected = null;
		assertThat(actual, is(equalTo(expected)));
	}

}
