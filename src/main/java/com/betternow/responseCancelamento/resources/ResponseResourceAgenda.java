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

import com.betternow.responseCancelamento.repository.ResponseRepositoryAgenda;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import com.betternow.responseCancelamento.models.ResponseSaldoAgenda;

@RestController
@RequestMapping(value = "/api")
@Api(value="API REST Response Cancelamento")
@CrossOrigin(origins="*")
public class ResponseResourceAgenda {

	
	@Autowired
	ResponseRepositoryAgenda responseRepository;
	
	@GetMapping("/agendas")
	@ApiOperation(value="Retorna todos os ec's do Saldo Agenda")
	public List<ResponseSaldoAgenda> listaResponse(){
		return responseRepository.findAll();
	}
	
	@GetMapping("/agenda/{id}")
	@ApiOperation(value="Retorna apenas o ec expecifico que vem da requisição")
	public ResponseSaldoAgenda listaResponseUnico(@PathVariable(value="id") long id){
		return responseRepository.findById(id);
	}
	
	@PostMapping("/agenda")
	@ApiOperation(value="Inserir um response")
	public ResponseSaldoAgenda salvaResponse(@RequestBody ResponseSaldoAgenda response) {
		return responseRepository.save(response);
	}
	
	/*
	 * @DeleteMapping("/agenda")
	 * 
	 * @ApiOperation(value="Deleta um response") public void
	 * deletaResponse(@RequestBody ResponseSaldoAgenda response) {
	 * responseRepository.delete(response); }
	 */
	
	@PutMapping("/agenda")
	@ApiOperation(value="Atualiza um ec")
	public ResponseSaldoAgenda atualizaResponse(@RequestBody ResponseSaldoAgenda response) {
		return responseRepository.save(response);
		
	}
}
