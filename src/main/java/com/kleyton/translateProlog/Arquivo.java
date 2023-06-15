package com.kleyton.translateProlog;


public class Arquivo {
	
	public String fatos;
	public String regras;
	
	public Arquivo(String fatos, String regras) {
		this.fatos = fatos;
		this.regras = regras;
	}
	
	public Arquivo() {
		
	}
	
	public String getFatos() {
		return fatos;
	}
	
	public String getRegras() {
		return regras;
	}
	
	public void setFatos(String fatos) {
		this.fatos = fatos;
	}
	
	public void setRegras(String regras) {
		this.regras = regras;
	}

	@Override
	public String toString() {
		return "Arquivo [fatos=" + fatos + ". regras=" + regras + "]";
	}
	
	
}
