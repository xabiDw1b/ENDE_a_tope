package com.ende.pruebasGitHub;

public class NicoSchofield {

	private String motivoNacimiento;
	private int añosMolestando;
	
	public NicoSchofield(String motivoNacimiento, int añosMolestando) {
		
		this.motivoNacimiento = motivoNacimiento;
		this.añosMolestando = añosMolestando;
	}
	
	public static void main(String[] args) {
		NicoSchofield n1 = new NicoSchofield("Amor incondicional",19);
		System.out.println("Socorroro estoy dentro de una aula apestosa!");
	}
	
}
