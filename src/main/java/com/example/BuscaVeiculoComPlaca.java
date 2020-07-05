package com.example;

import javax.persistence.EntityManager;

import com.example.model.beans.Veiculo;
import com.example.model.repository.JPAUtil;

public class BuscaVeiculoComPlaca {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Veiculo v = manager.find(Veiculo.class, 1L);
		System.out.println(v);
		manager.close();
		JPAUtil.close();
	}
}
