package com.jpmcers.project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataWorker {
	ArrayList<String> listPalabras = new ArrayList<String>();
	String[] palabras = new String [30];
	
	/**
	 * Crea una array list con un csv
	 * @param ruta
	 * @return
	 */
	public ArrayList<String> regresaArrayList(String ruta){
		ArrayList <String> list = new ArrayList <String>();
		
		
		try {
			Scanner csvData = new Scanner(new File(ruta));
			while(csvData.hasNext()) {
				list.add(csvData.nextLine());
				System.out.println(list.get((list.size())-1));
			}}catch(FileNotFoundException ex){
				System.out.println(ex.toString());
			}
			
		System.out.println(list.size());
		return list;
		
	}
	
	/**
	 * Metodo que elimina numeros, caracteres especiales y palabras que contengan Mo//mo
	 * @param list2
	 * @return
	 */
	public ArrayList<String> eliminarCaracteres(ArrayList<String> list2) {
		int i=0, j=0;
		
		ArrayList<String> list = new ArrayList<String>();
		String[] tempArray = list2.toArray(new String[0]);
		
		for(i=0; i<tempArray.length; i++) {
			
			tempArray[i]=tempArray[i].replaceAll("F1", " ").replaceAll("\\d", " ").replaceAll("\\W", " ").replaceAll("AbuDhabiGP[\\w]*", " ").replaceAll("https[\\w]*", " ");
			list.add(tempArray[i]);
			

		}
		return list;
	}
	
}


