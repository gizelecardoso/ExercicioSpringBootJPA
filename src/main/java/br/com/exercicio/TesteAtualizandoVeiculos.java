package br.com.exercicio;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.exercicio.model.bean.Veiculo;
import br.com.exercicio.model.repository.JPAUtil;

public class TesteAtualizandoVeiculos {
	
	public static void main(String[] args) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		
		Veiculo veiculo = manager.find(Veiculo.class, 1L);
		
		veiculo.setMarca("Renault");
		veiculo.setModelo("Logan");
		
		transaction.commit();
		manager.close();
		JPAUtil.close();
		
	}

}
