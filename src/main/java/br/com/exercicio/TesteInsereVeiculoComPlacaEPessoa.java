package br.com.exercicio;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.exercicio.model.bean.Pessoa;
import br.com.exercicio.model.bean.Placa;
import br.com.exercicio.model.bean.Veiculo;
import br.com.exercicio.model.repository.JPAUtil;

public class TesteInsereVeiculoComPlacaEPessoa {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		
		Placa placa = new Placa();
		placa.setIdentificador("EHH7632");
		placa.setCidade("Sao Paulo");
		manager.persist(placa);
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Gizele");
		manager.persist(pessoa);
		
		Veiculo veiculo = new Veiculo();
		veiculo.setMarca("Volkswagem");
		veiculo.setModelo("New Beatle");
		veiculo.setAno("2020");
		veiculo.setPessoa(pessoa);
		veiculo.setPlaca(placa);
		manager.persist(veiculo);
		
		transaction.commit();
		manager.close();
		JPAUtil.close();
		

	}

}
