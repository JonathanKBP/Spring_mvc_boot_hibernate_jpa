package com.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.example.model.beans.Veiculo;
import com.example.model.repository.JPAUtil;

public class InserirVeiculo {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		
		Veiculo v = new Veiculo();
		v.setMarca("Toyota");
		v.setModelo("Yaris");
		v.setCor("Dourado");
		manager.persist(v);
		
		v.setMarca("Jeep");
		v.setModelo("Marchi");
		v.setCor("Verde");
		manager.persist(v);
		

		v.setMarca("Disney");
		v.setModelo("Relampago Marquinhos");
		v.setCor("Vermelho");
		manager.persist(v);
		
		transaction.commit();
		manager.close();
		JPAUtil.close();

	}

}
