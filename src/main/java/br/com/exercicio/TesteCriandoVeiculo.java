package br.com.exercicio;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.exercicio.model.bean.Veiculo;
import br.com.exercicio.model.repository.JPAUtil;

public class TesteCriandoVeiculo {

	public static void main(String[] args) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		
		Veiculo veiculo = new Veiculo();
		
		veiculo.setMarca("Renault");
		veiculo.setModelo("Duster");
		veiculo.setAno("2000");
		
		manager.persist(veiculo);
		
		transaction.commit();
		manager.close();
		JPAUtil.close();

	}

}
