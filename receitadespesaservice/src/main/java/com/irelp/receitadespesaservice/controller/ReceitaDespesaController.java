package com.irelp.receitadespesaservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.irelp.receitadespesaservice.entity.ReceitaDespesa;
import com.irelp.receitadespesaservice.service.ReceitaDespesaService;

@RestController
@RequestMapping(value = "/v1/receitaDespesaservice")
public class ReceitaDespesaController {

	@Autowired
	private ReceitaDespesaService service;

	@RequestMapping(value = "/teste", method = RequestMethod.GET)
	public ResponseEntity<?> Teste() {
		return ResponseEntity.ok("Teste");
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<?> listReceitaDespesa() {
		return ResponseEntity.ok(service.listReceitaDespesa());
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getReceitaDespesa(@PathVariable(name = "id") int id) {
		return ResponseEntity.ok(service.getReceitaDespesa(id));
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteReceitaDespesa(@RequestBody int id) {
		return new ResponseEntity<>(service.deleteReceitaDespesa(id), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<?> createReceitaDespesa(@RequestBody ReceitaDespesa receitaDespesa) {
		return new ResponseEntity<>(service.createReceitaDespesa(receitaDespesa), HttpStatus.OK);
	}
}
