package com.jpmcers.project1;

public class Main {


	public static void main(String[] args) {
		
		DataWorker obj1 = new DataWorker();
		obj1.listPalabras = obj1.regresaArrayList("C:\\Users\\pepem\\git\\Proyecto1-POO\\Project1\\temporal1.csv");
		obj1.listPalabras = obj1.eliminarCaracteres(obj1.listPalabras);
		
		
	}

}
