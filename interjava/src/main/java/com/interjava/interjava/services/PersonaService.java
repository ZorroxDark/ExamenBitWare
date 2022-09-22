package com.interjava.interjava.services;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Service;

import com.interjava.interjava.dto.Persona;

@Service
public class PersonaService {

 
	public Persona validaciones(Persona p) {
		
		p.setNss(generaNSS());
		p.setComprobarSexo(comprobarSexo(p));
		p.setEsMayorDeEdad(esMayorDeEdad(p));
		p.setCalcularIMC(calcularIMC(p));
		
		return p;
	}
	
	
	
	public int calcularIMC(Persona p){
	
		int response  =0; 
		try {
			
			
			int bajo =20;
			int normal = 25;
			
			float estatura2=p.getAltura()*p.getAltura();
			float result = p.getPeso()/estatura2;

			if(result<=20) {
				return -1;
			}else if(result>=25) {
				return 1;
			}else {
				return 0;
			}
			
			
			//calculara si la persona está en su peso ideal 
			//(peso en kg/(Estatura^2 en m)), 
			// devuelve un -1 si está por debajo de su peso ideal, 
			//un 0 si está en su peso ideal 
			//y un 1 si tiene sobrepeso .
			//Te recomiendo que uses constantes para devolver estos valores.
			
		}catch(Exception e){
			System.out.println("Error calcularIMC "+e);
		}
		
		return response;
	}
	
	public boolean esMayorDeEdad(Persona p){
		
		boolean validaCorrecto = false;
		
		try {
			//esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
			if(p.getEdad()!=null) {
				if(p.getEdad()>=18) {
					validaCorrecto = true;
				}
				
			}
		}catch(Exception e){
			System.out.println("Error esMayorDeEdad "+e);
		}
		
		return validaCorrecto;
	}
	

	public boolean comprobarSexo(Persona p){
			
		boolean validaCorrecto = false;
		
			try {
				//comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. 
				//Devolver el valor en booleano. No será visible al exterior.
				if(p.getSexo()!=null) {
					if(p.getSexo().equals("H")||p.getSexo().equals("M")||p.getSexo().equals("h")||p.getSexo().equals("m")) {
						validaCorrecto = true;
					}
				}
				
			}catch(Exception e){
				System.out.println("Error comprobarSexo "+e);
			}
			
			return validaCorrecto;
	}
	
	public String generaNSS(){
		
		String cadena = "";
		try {
			
			String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		    
		   
		    for (int x = 0; x < 8; x++) {
		        int ini = numAleRango(0, caracteres.length() - 1);
		        char caracterAleatorio = caracteres.charAt(ini);
		        cadena += caracterAleatorio;
		    }
		    	    
		}catch(Exception e){
			System.out.println("Error generaNSS "+e);
		}
		
		return cadena;
	}
	
	 public static int numAleRango(int minimo, int maximo) {
	     
	        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
	    }
     
     
     

   
   
}
