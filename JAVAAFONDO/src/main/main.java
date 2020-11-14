package main;

import java.util.Scanner;

public class main { 
	
	
	public static void main(String[]args) {
		
	/*	int dia;
		int mes;
		int anio;	*/
		
	Scanner leer = new Scanner(System.in);
	
	
	/*System.out.println("ingrese Fecha 1 (dia, mes, año)");
	
	 dia = leer.nextInt();
	 mes = leer.nextInt();
	 anio = leer.nextInt();
	
	Fecha f1 = new Fecha(dia,mes,anio);*/
	
	
	/*System.out.println("ingrese la fecha"); 
	
	String sFecha= leer.next();*/
	
   
	
	Fecha f2 = new Fecha(22,12,2015);
	
	
	//System.out.println("Fecha 1 = "+f1);
	System.out.println("Fecha 2 = "+f2);
	
	System.out.println("ingrese dias a sumar");
	int diasSum= leer.nextInt();
	
	f2.addDias(diasSum);
	
	System.out.println("sumando "+diasSum+" dias, queda : "+f2);
	
	
	/*if( f1.equals(f2)) {
		
		 System.out.println("son iguales");
		 
		
	}
	
	else {
		
		 System.out.println("son distintas");
	}
	
	
	*/
		
		
	}

}
