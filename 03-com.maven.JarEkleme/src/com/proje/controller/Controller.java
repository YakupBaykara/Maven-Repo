package com.proje.controller;

import com.proje.repository.Repository;

public class Controller {
	
	public static void main(String[] args) {
		
		Repository repository = new Repository();
		
		repository.insert("Yakup");
		repository.sil("Baykara"); 
	}

}
