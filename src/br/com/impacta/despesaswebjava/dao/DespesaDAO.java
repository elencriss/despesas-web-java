package br.com.impacta.despesaswebjava.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.impacta.despesaswebjava.models.CategoriaDespesas;
import br.com.impacta.despesaswebjava.models.Despesa;



public class DespesaDAO {

	private List<Despesa> despesas;
	
	public List<Despesa> getDespesas(){
		if(this.despesas == null){
			this.despesas = new ArrayList<Despesa>();
		}
		
		despesas.add(new Despesa("Restaurante", CategoriaDespesas.ALIMENTACAO, LocalDate.now(), 89.95));
		despesas.add(new Despesa("Corte de Cabelo", CategoriaDespesas.CUIDADOS_PESSOAIS, LocalDate.now(), 45));
		despesas.add(new Despesa("Combustível", CategoriaDespesas.VEICULO, LocalDate.now(), 80));
		despesas.add(new Despesa("Tênis", CategoriaDespesas.VESTUARIO, LocalDate.now(), 237));
		despesas.add(new Despesa("Almoço", CategoriaDespesas.ALIMENTACAO, LocalDate.now(), 30));
		despesas.add(new Despesa("Conta de Energia", CategoriaDespesas.MORADIA, LocalDate.now(), 170));
		despesas.add(new Despesa("Pós Graduação", CategoriaDespesas.EDUCACAO, LocalDate.now(), 850));
		despesas.add(new Despesa("Plano de Saúde", CategoriaDespesas.SAUDE, LocalDate.now(), 360));
	
		return despesas;
	}
	
}

