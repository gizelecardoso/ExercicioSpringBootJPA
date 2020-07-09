package br.com.exercicio;

import javax.persistence.EntityManager;

import br.com.exercicio.model.bean.Placa;
import br.com.exercicio.model.repository.JPAUtil;

public class TesteBuscaPlacaComVeiculo {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		
		Placa p = manager.find(Placa.class, 1L);
		
		System.out.println(p.getVeiculo().getModelo());
		
		manager.close();
		JPAUtil.close();

	}

}
