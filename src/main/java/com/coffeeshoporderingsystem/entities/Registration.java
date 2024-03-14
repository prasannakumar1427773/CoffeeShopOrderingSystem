package com.coffeeshoporderingsystem.entities;

	import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name = "Registration")
	public class Registration {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "Registration_id")
	    private int registrationId;

	    @Column(name = "User_name")
	    private String userName;

	    @Column(name = "User_password")
	    private String userPassword;

	    @Column(name = "User_address")
	    private String userAddress;

	    @Column(name = "User_email")
	    private String userEmail;

	    @Column(name = "User_mobileno")
	    private int userMobileNo;

	    @Column(name = "User_gender")
	    private String userGender;

		public void setUserAddress(String string) {
			
		}

		public void setUserPassword(String string) {
			
		}

		public void setUserName(String string) {
			
		}

		public void setUserEmail(String string) {
			
		}

		public void setUserMobileNo(int i) {
			
		}

		public void setUserGender(String string) {
			
		}
	}
