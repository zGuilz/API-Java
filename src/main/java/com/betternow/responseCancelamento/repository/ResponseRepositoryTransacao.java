package com.betternow.responseCancelamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.betternow.responseCancelamento.models.ResponseSaldoTransacao;

public interface ResponseRepositoryTransacao extends JpaRepository<ResponseSaldoTransacao, Long>{
	ResponseSaldoTransacao findById(long id);

}
