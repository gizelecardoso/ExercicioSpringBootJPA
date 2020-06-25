package br.com.exercicio;

import javax.persistence.Persistence;

public class TesteCriandoTabelas {
	
	public static void main(String[] args) {
		
		Persistence.createEntityManagerFactory("exercicioJPA");
		
	}

}
