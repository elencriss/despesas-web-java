package br.com.impacta.despesaswebjava.models;

import java.time.LocalDate;

public class Despesa {
	
	private String descricao;
	private CategoriaDespesas categoria;
	private LocalDate data;
	private double valor;
	private String observacoes;
	
	public Despesa() {}
	
	public Despesa(String descricao, CategoriaDespesas categoria, LocalDate data, double valor) {
		this.setDescricao(descricao);
		this.setCategoria(categoria);
		this.setData(data);
		this.setValor(valor);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public CategoriaDespesas getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaDespesas categoria) {
		this.categoria = categoria;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
	

}
