package com.kalyanamastuapp.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "USERS_KMP")
public class User {
	
	//test
	@Column(name = "USER_ID")
	private String USER_ID;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long USERS_KMP_REF;

	@NotEmpty(message = "Username cannot be empty")
    @Size(max = 100, message = "Username must have at least 2 characters")
    @Column(name = "fullname")
    private String firstName;

    @Email
    @NotEmpty(message = "Email cannot be empty")
    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "age")
    private int age;
    
    @Column(name = "mobilenumber")
    private int mobilenumber;
    
    @Column(name = "gender")
    private String gender;

    @Column(name = "religion")
    private String religion;

    @Column(name = "caste")
    private String caste;

    @Column(name = "occupation")
    private String occupation;

    @Column(name = "education")
    private String education;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
    private Address address;
    
    @Column(name = "hobbies")
    private String hobbies;
    
    @Column(name = "surname")
    private String surname;
    
    @Column(name = "physical_status")
    private String physical_status;
    
    @Column(name = "income")
    private String income;
    @Column(name = "height")
    private String height;
    @Column(name = "weight")
    private String weight;
    @Column(name = "profileImageUrl")
    private String profileImageUrl;
	
    public User() {
		super();
	}
	/**
	 * @param uSER_ID
	 * @param firstName
	 * @param email
	 * @param password
	 * @param age
	 * @param mobilenumber
	 * @param gender
	 * @param religion
	 * @param caste
	 * @param occupation
	 * @param education
	 * @param address
	 * @param hobbies
	 * @param surname
	 * @param physical_status
	 * @param income
	 * @param height
	 * @param weight
	 * @param profileImageUrl
	 */
	public User(String uSER_ID,
			@NotEmpty(message = "Username cannot be empty") @Size(max = 100, message = "Username must have at least 2 characters") String firstName,
			@Email @NotEmpty(message = "Email cannot be empty") String email, String password, int age,
			int mobilenumber, String gender, String religion, String caste, String occupation, String education,
			Address address, String hobbies, String surname, String physical_status, String income, String height,
			String weight, String profileImageUrl) {
		super();
		USER_ID = uSER_ID;
		this.firstName = firstName;
		this.email = email;
		this.password = password;
		this.age = age;
		this.mobilenumber = mobilenumber;
		this.gender = gender;
		this.religion = religion;
		this.caste = caste;
		this.occupation = occupation;
		this.education = education;
		this.address = address;
		this.hobbies = hobbies;
		this.surname = surname;
		this.physical_status = physical_status;
		this.income = income;
		this.height = height;
		this.weight = weight;
		this.profileImageUrl = profileImageUrl;
	}
	/**
	 * @return the uSER_ID
	 */
	public String getUSER_ID() {
		return USER_ID;
	}
	/**
	 * @param uSER_ID the uSER_ID to set
	 */
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	/**
	 * @return the uSERS_KMP_REF
	 */
	public Long getUSERS_KMP_REF() {
		return USERS_KMP_REF;
	}
	/**
	 * @param uSERS_KMP_REF the uSERS_KMP_REF to set
	 */
	public void setUSERS_KMP_REF(Long uSERS_KMP_REF) {
		USERS_KMP_REF = uSERS_KMP_REF;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the mobilenumber
	 */
	public int getMobilenumber() {
		return mobilenumber;
	}
	/**
	 * @param mobilenumber the mobilenumber to set
	 */
	public void setMobilenumber(int mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the religion
	 */
	public String getReligion() {
		return religion;
	}
	/**
	 * @param religion the religion to set
	 */
	public void setReligion(String religion) {
		this.religion = religion;
	}
	/**
	 * @return the caste
	 */
	public String getCaste() {
		return caste;
	}
	/**
	 * @param caste the caste to set
	 */
	public void setCaste(String caste) {
		this.caste = caste;
	}
	/**
	 * @return the occupation
	 */
	public String getOccupation() {
		return occupation;
	}
	/**
	 * @param occupation the occupation to set
	 */
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	/**
	 * @return the education
	 */
	public String getEducation() {
		return education;
	}
	/**
	 * @param education the education to set
	 */
	public void setEducation(String education) {
		this.education = education;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	/**
	 * @return the hobbies
	 */
	public String getHobbies() {
		return hobbies;
	}
	/**
	 * @param hobbies the hobbies to set
	 */
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	/**
	 * @return the physical_status
	 */
	public String getPhysical_status() {
		return physical_status;
	}
	/**
	 * @param physical_status the physical_status to set
	 */
	public void setPhysical_status(String physical_status) {
		this.physical_status = physical_status;
	}
	/**
	 * @return the income
	 */
	public String getIncome() {
		return income;
	}
	/**
	 * @param income the income to set
	 */
	public void setIncome(String income) {
		this.income = income;
	}
	/**
	 * @return the height
	 */
	public String getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(String height) {
		this.height = height;
	}
	/**
	 * @return the weight
	 */
	public String getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(String weight) {
		this.weight = weight;
	}
	/**
	 * @return the profileImageUrl
	 */
	public String getProfileImageUrl() {
		return profileImageUrl;
	}
	/**
	 * @param profileImageUrl the profileImageUrl to set
	 */
	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}
	
}
