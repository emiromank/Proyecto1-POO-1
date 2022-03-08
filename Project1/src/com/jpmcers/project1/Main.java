package com.jpmcers.project1;

public class Main {


	public static void main(String[] args) {
		
		DataWorker obj1 = new DataWorker();
		String[] palabras = {"Max","Hamilton","FIA"};

		obj1.setListPalabras(obj1.regresaArrayList("C:\\Users\\pepem\\git\\Proyecto1-POO\\Project1\\temporal1.csv"));
		obj1.setListPalabras(obj1.eliminarCaracteres(obj1.getListPalabras()));
		obj1.setPalabras(palabras);
		obj1.setTweets(obj1.contarPalabras(obj1.getPalabras(),obj1.getListPalabras()));
		obj1.imprimirPalabras(obj1.getTweets(), obj1.getPalabras());
		
	}

}
