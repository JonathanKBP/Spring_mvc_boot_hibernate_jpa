package com.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.example.model.beans.Veiculo;
import com.example.model.repository.JPAUtil;

public class AtualizarVeiculos {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
		Veiculo v = manager.find(Veiculo.class, 2L);
		v.setMarca("BMW");
		
		transaction.commit();
		
		manager.close();
		JPAUtil.close();

	}

}
