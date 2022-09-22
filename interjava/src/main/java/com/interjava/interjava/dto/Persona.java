package com.interjava.interjava.dto;

import java.io.Serializable;

public class Persona implements Serializable{
	
	

   
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	private String nombre;
    private Integer edad;
    private String nss;
    private String sexo;
    private Float peso;
    private Float altura;
    
    private int calcularIMC;
    private boolean esMayorDeEdad;
    
    

	

	public int getCalcularIMC() {
		return calcularIMC;
	}

	public void setCalcularIMC(int calcularIMC) {
		this.calcularIMC = calcularIMC;
	}

	public boolean isEsMayorDeEdad() {
		return esMayorDeEdad;
	}

	public void setEsMayorDeEdad(boolean esMayorDeEdad) {
		this.esMayorDeEdad = esMayorDeEdad;
	}

	public boolean isComprobarSexo() {
		return comprobarSexo;
	}

	public void setComprobarSexo(boolean comprobarSexo) {
		this.comprobarSexo = comprobarSexo;
	}

	private boolean comprobarSexo;
   
    
    //nombre, edad, NSS (Numero de Seguro Social), sexo (H hombre, M mujer), peso y altura.

    public Persona(){
    	this.nombre = "";
    	this.edad = 0;
    	this.nss = "";
    	this.sexo = Constantes.SEXO_HOMBRE;
    	this.peso = (float)0;
    	this.altura = (float)0;
    }
    
    public Persona(String nombre , Integer edad , String nss , String sexo , Float peso , Float altura){
    	this.nombre = nombre;
    	this.edad = edad;
    	this.nss = nss;
    	this.sexo = sexo;
    	this.peso = peso;
    	this.altura = altura;
    }


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getEdad() {
		return edad;
	}


	public void setEdad(Integer edad) {
		this.edad = edad;
	}


	public String getNss() {
		return nss;
	}


	public void setNss(String nss) {
		this.nss = nss;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public Float getPeso() {
		return peso;
	}


	public void setPeso(Float peso) {
		this.peso = peso;
	}


	public Float getAltura() {
		return altura;
	}


	public void setAltura(Float altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", nss=" + nss + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + ", calcularIMC=" + calcularIMC + ", esMayorDeEdad=" + esMayorDeEdad
				+ ", comprobarSexo=" + comprobarSexo + "]";
	}

	


    
    
  


  
}
