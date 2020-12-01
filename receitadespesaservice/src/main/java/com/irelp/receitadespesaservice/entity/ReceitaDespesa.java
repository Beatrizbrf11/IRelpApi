package com.irelp.receitadespesaservice.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "receitaDespesa")
public class ReceitaDespesa {

	@Id
	@JsonProperty("id")
	private int Id;

	@JsonProperty("descricao")
	private String Descricao;

	@JsonProperty("despesa")
	private boolean Despesa;

	@JsonProperty("imagem")
	private String Imagem;

	@JsonProperty("tipo")
	private int Tipo;

	@JsonProperty("dataCriacao")
	private Date DataCriacao;

	public ReceitaDespesa() {
	}

	public ReceitaDespesa(int id, String descricao, boolean despesa, String imagem, int tipo, Date dataCriacao) {
		super();
		this.Id = id;
		this.Descricao = descricao;
		this.Despesa = despesa;
		this.Imagem = imagem;
		this.Tipo = tipo;
		this.DataCriacao = dataCriacao;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public void setDescricao(String Descricao) {
		this.Descricao = Descricao;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDespesa(boolean Despesa) {
		this.Despesa = Despesa;
	}

	public boolean getDespesa() {
		return Despesa;
	}

	public void setImagem(String Imagem) {
		this.Imagem = Imagem;
	}

	public String getImagem() {
		return Imagem;
	}

	public void setTipo(int tipo) {
		this.Tipo = tipo;
	}

	public int getTipo() {
		return Tipo;
	}

	public void setDataCriacao(Date DataCriacao) {
		this.DataCriacao = DataCriacao;
	}

	public Date getDataCriacao() {
		return DataCriacao;
	}
}
