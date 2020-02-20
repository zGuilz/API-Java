package com.betternow.responseCancelamento.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CANCELAMENTO_RESPONSE_SALDO_AGENDA")
public class ResponseSaldoAgenda implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private long ec;
	
	private double vlFuture;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getEc() {
		return ec;
	}

	public void setEc(long ec) {
		this.ec = ec;
	}

	public double getVlFuture() {
		return vlFuture;
	}

	public void setVlFuture(double vlFuture) {
		this.vlFuture = vlFuture;
	}
	
	
}
