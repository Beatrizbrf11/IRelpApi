package com.irelp.receitadespesaservice.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irelp.receitadespesaservice.entity.ReceitaDespesa;
import com.irelp.receitadespesaservice.repository.ReceitaDespesaRepository;

@Service
@Transactional
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
}
