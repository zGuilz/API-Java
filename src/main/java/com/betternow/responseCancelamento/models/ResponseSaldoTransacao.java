package com.betternow.responseCancelamento.models;

import java.io.Serializable;

import javax.persistence.Entity;
//import javax.persistence.GenerationType;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CANCELAMENTO_RESPONSE_SALDO_TRANSACAO")
public class ResponseSaldoTransacao implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	/*
	 * @GeneratedValue(strategy=GenerationType.AUTO) private long id;
	 */

	
	private long ec;
	
	private double vlGrossAmountAvailable;
	
	/*
	 * public long getId() { return id; }
	 * 
	 * public void setId(long id) { this.id = id; }
	 */

	
	public long getEc() {
		return ec;
	}

	public void setEc(long ec) {
		this.ec = ec;
	}
	

	public double getvlGrossAmountAvailable() {
		return vlGrossAmountAvailable;
	}

	public void setVlGrossAmountAvailable(double vlGrossAmountAvailable) {
		this.vlGrossAmountAvailable = vlGrossAmountAvailable;
	}
	
	
}
