package com.kalyanamastuapp.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;



@Entity
public class Address {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long A_id;
    private String village,city,state;
    private String country;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USERS_KMP_REF")
    private User user;

	/**
	 * @return the a_id
	 */
	public Long getA_id() {
		return A_id;
	}

	/**
	 * @param a_id the a_id to set
	 */
	public void setA_id(Long a_id) {
		A_id = a_id;
	}

	/**
	 * @return the village
	 */
	public String getVillage() {
		return village;
	}

	/**
	 * @param village the village to set
	 */
	public void setVillage(String village) {
		this.village = village;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @param a_id
	 * @param village
	 * @param city
	 * @param state
	 * @param country
	 * @param user
	 */
	public Address(Long a_id, String village, String city, String state, String country, User user) {
		super();
		A_id = a_id;
		this.village = village;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	/**
	 * 
	 */
	public Address() {
		super();
	}

    
}
