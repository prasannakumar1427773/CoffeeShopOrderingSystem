package com.coffeeshoporderingsystem.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "`Payments`")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Payment_Id")
	private int paymentId;

	@ManyToOne
	@JoinColumn(name = "Order_Id", referencedColumnName = "Order_Id")
	private Order order;

	@Column(name = "Payment_date")
	private int paymentDate;

}
