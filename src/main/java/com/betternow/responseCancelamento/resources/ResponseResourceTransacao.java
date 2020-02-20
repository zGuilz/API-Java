package com.betternow.responseCancelamento.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.betternow.responseCancelamento.repository.ResponseRepositoryTransacao;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import com.betternow.responseCancelamento.models.ResponseSaldoTransacao;

@RestController
@RequestMapping(value = "/api")
@Api(value="API REST Response Cancelamento")
@CrossOrigin(origins="*")
public class ResponseResourceTransacao {

	
	@Autowired
	ResponseRepositoryTransacao responseRepository2;
	
	@GetMapping("/transacoes")
	@ApiOperation(value="Retorna todos os ec's de Saldo da Transação")
	public List<ResponseSaldoTransacao> listaResponse(){
		return responseRepository2.findAll();
	}
	
	@GetMapping("/transacao/{id}")
	@ApiOperation(value="Retorna apenas o ec expecifico que vem da requisição")
	public ResponseSaldoTransacao listaResponseUnico(@PathVariable(value="id") long id){
		return responseRepository2.findById(id);
	}
	
	@PostMapping("/transacao")
	@ApiOperation(value="Inserir um ec")
	public ResponseSaldoTransacao salvaResponse(@RequestBody ResponseSaldoTransacao response) {
		return responseRepository2.save(response);
	}
	
	/*
	 * @DeleteMapping("/transacao")
	 * 
	 * @ApiOperation(value="Deleta um response") public void
	 * deletaResponse(@RequestBody ResponseSaldoTransacao response) {
	 * responseRepository2.delete(response); }
	 */	
	@PutMapping("/transacao")
	@ApiOperation(value="Atualiza um ec")
	public ResponseSaldoTransacao atualizaResponse(@RequestBody ResponseSaldoTransacao response) {
		return responseRepository2.save(response);
		
	}
}
