package com.example;

import javax.persistence.Persistence;

public class CriarBaseTabelas {

	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("bossiniPU");

	}

}
