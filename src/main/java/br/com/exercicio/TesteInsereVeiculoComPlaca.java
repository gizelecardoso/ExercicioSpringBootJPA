package br.com.exercicio;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.exercicio.model.bean.Placa;
import br.com.exercicio.model.bean.Veiculo;
import br.com.exercicio.model.repository.JPAUtil;

public class TesteInsereVeiculoComPlaca {
	
	public static void main(String[] args) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		
		Placa placa = new Placa();
		placa.setIdentificador("ABC5647");
		placa.setCidade("Sao Paulo");
		manager.persist(placa);
		
		Veiculo veiculo = new Veiculo();
		veiculo.setMarca("GM");
		veiculo.setModelo("Celta");
		veiculo.setAno("2000");
		veiculo.setPlaca(placa);
		manager.persist(veiculo);
		
		transaction.commit();
		manager.close();
		JPAUtil.close();
		
		
	}


}
