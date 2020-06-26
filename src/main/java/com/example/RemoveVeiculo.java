package com.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.example.model.beans.Veiculo;
import com.example.model.repository.JPAUtil;

public class RemoveVeiculo {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		
		Veiculo v = manager.find(Veiculo.class, 1L);
		
		transaction.commit();
		manager.close();
		JPAUtil.close();

	}

}
