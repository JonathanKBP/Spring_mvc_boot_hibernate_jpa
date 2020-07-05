package com.example;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.example.model.beans.Veiculo;
import com.example.model.repository.JPAUtil;

public class MostrarVeiculos {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Query query = manager.createQuery("from Veiculo");
		List <Veiculo> veiculos = query.getResultList()
;
		for(Veiculo v: veiculos) {
			System.out.println(v);
			
		}
		
		manager.close();
		JPAUtil.close();
	}

}


