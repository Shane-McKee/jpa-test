package com.myproject.jpaexample.domain;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;


/**
 * Entity implementation class for Entity: Person
 *
 */
@Entity
public class Person implements Serializable {

	
	@Id @GeneratedValue(strategy=GenerationType.TABLE)
	private Long id;
	
	@Column(name = "FIRST_NAME", nullable = false, length = 35)
	private String firstName;
	
	@Column(name = "LAST_NAME", nullable = false, length = 35)
	private String lastName;
	private Integer age;
	
	@Column(name = "BIRTH_DAYE")
	@Temporal(TemporalType.DATE)
	private Date birthDate;
	
	private static final long serialVersionUID = 1L;
	
	public Person() {
		super();
	}   
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}   
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}   
	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}   
	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName="
				+ lastName + ", age=" + age + ", birthDate=" + birthDate + "]";
	}
	
	
   
}
