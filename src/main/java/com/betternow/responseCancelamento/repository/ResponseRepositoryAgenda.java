package com.betternow.responseCancelamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.betternow.responseCancelamento.models.ResponseSaldoAgenda;

public interface ResponseRepositoryAgenda extends JpaRepository<ResponseSaldoAgenda, Long>{
	ResponseSaldoAgenda findById(long id);

}
