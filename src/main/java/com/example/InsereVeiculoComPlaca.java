package com.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.example.model.beans.Placa;
import com.example.model.beans.Veiculo;
import com.example.model.repository.JPAUtil;

public class InsereVeiculoComPlaca {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Placa p = new Placa();
		p.setCidade("São Paulo");
		manager.persist(p);
		Veiculo v = new Veiculo();
		v.setModelo("Palio");
		v.setMarca("Fiat");
		v.setCor("preto");
		v.setPlaca(p);
		manager.persist(v);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}
