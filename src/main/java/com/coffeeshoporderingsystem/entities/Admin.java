package com.coffeeshoporderingsystem.entities;
	import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

	@Entity
	@Table(name = "Admin")
	public class Admin {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "Admin_id")
	    private int adminId;

	    @OneToOne
	    @JoinColumn(name = "Registration_id", referencedColumnName = "Registration_id")
	    private Registration registration;

	}
