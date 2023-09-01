package com.san.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@Table(name = "user")
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue
	private long id;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String ssn;
	private String email;
}
