package br.com.exercicio;

import javax.persistence.EntityManager;

import br.com.exercicio.model.bean.Pessoa;
import br.com.exercicio.model.repository.JPAUtil;

public class TesteBuscaVeiculoPorPessoa {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		
		Pessoa pessoa = manager.find(Pessoa.class, 2L);
		
		System.out.printf(pessoa.getNome() + 
						" possui o veiculo Marca: " + pessoa.getVeiculo().get(0).getMarca()
						+" Modelo: " + pessoa.getVeiculo().get(0).getModelo());
	
		manager.close();
		JPAUtil.close();

	}

}
