package com.jpmcers.project1;

public class Main {


	public static void main(String[] args) {
		
		DataWorker obj1 = new DataWorker();
		obj1.listPalabras = obj1.regresaArrayList("C:\\Users\\Roman\\Downloads\\f1Tweets\\F1Resumido.csv");
		obj1.listPalabras = obj1.eliminarCaracteres(obj1.listPalabras);
		
		
	}

}
