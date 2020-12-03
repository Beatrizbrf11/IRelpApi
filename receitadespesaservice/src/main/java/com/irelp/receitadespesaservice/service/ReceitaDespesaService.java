package com.irelp.receitadespesaservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irelp.receitadespesaservice.entity.ReceitaDespesa;
import com.irelp.receitadespesaservice.repository.ReceitaDespesaRepository;

@Service
public class ReceitaDespesaService {

	@Autowired
	private ReceitaDespesaRepository repository;

	public ReceitaDespesa getReceitaDespesa(int id) {
		ReceitaDespesa retorno = repository.findById(id).get();
		return retorno;
	}

	public List<ReceitaDespesa> listReceitaDespesa() {
		List<ReceitaDespesa> retorno = repository.findAll();
		return retorno;
	}

	public boolean deleteReceitaDespesa(int id) {
		try {
			repository.deleteById(id);
			return true;
		} catch (Exception ex) {
			throw new RuntimeException("Erro ao salvar favorito: " + ex);
		}

	}

	public ReceitaDespesa createReceitaDespesa(ReceitaDespesa receitaDespesa) {
		try {
			repository.save(receitaDespesa);

			String texto = "Receita";

			if (receitaDespesa.getDespesa())
				texto = "Despesa";
			new Slack("https://hooks.slack.com/services/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")
					.text("Sucesso ao cadastrar " + texto + " com a descrição: " + receitaDespesa.getDescricao())
					.send();

			return receitaDespesa;
		} catch (Exception ex) {
			throw new RuntimeException("Erro ao criar: " + ex.getMessage());
		}
	}
	
	public String Slack() {
		try {
			
			new Slack("https://hooks.slack.com/services/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")
					.text("Sucesso ao cadastrar")
					.send();
			return "Sucesso";
		} catch (Exception ex) {
			return "Erro integrar com slack; Mensagem:  " + ex.getMessage() +" StackTrace: "+ ex.getStackTrace() +" Cause: "+ ex.getCause();
		}
	}
}
