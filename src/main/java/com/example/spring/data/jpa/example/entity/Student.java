package com.example.spring.data.jpa.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Builder;

@Entity
@Builder
@Table(
		name = "tbl_student",
        uniqueConstraints = @UniqueConstraint(
        		name ="emailid_unique" ,
        		columnNames = "email_address"
        		))
public class Student {

	@Id // For Primary key
	@SequenceGenerator(
			name = "student_sequence", 
			sequenceName = "student_sequence", 
			allocationSize = 1)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE, 
			generator = "student_sequence")
	private Long studentId;
	private String firstName;
	private String lastName;
	@Column(
			name = "email_address",
			nullable = false
			) // For emailId is changed to email_address in Table
	private String emailId;
	private String guardianName;
	private String guardianEmail;
	private String guardianMobile;

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getGuardianName() {
		return guardianName;
	}

	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}

	public String getGuardianEmail() {
		return guardianEmail;
	}

	public void setGuardianEmail(String guardianEmail) {
		this.guardianEmail = guardianEmail;
	}

	public String getGuardianMobile() {
		return guardianMobile;
	}

	public void setGuardianMobile(String guardianMobile) {
		this.guardianMobile = guardianMobile;
	}

	public Student(Long studentId, String firstName, String lastName, String emailId, String guardianName,
			String guardianEmail, String guardianMobile) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.guardianName = guardianName;
		this.guardianEmail = guardianEmail;
		this.guardianMobile = guardianMobile;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId="
				+ emailId + ", guardianName=" + guardianName + ", guardianEmail=" + guardianEmail + ", guardianMobile="
				+ guardianMobile + "]";
	}

	public  Student(){

	}
}
