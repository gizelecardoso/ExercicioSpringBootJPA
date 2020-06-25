package br.com.exercicio;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.exercicio.model.bean.Veiculo;
import br.com.exercicio.model.repository.JPAUtil;

public class TesteRemovendoVeiculos {

	public static void main(String[] args) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		
		Veiculo veiculo = manager.find(Veiculo.class, 2L);
				
		manager.remove(veiculo);
		
		transaction.commit();
		manager.close();
		JPAUtil.close();

	}

}
