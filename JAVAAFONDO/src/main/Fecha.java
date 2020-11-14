package main;

public class Fecha {
	
	private int dia;
	private int mes;
	private int anio;
	
	public Fecha(int dia,int mes,int anio) {
		
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
		
		
	     }
	
     public Fecha(String s) {
		
		int pos1= s.indexOf('/');
		int pos2= s.lastIndexOf('/');
		
		
		
		String sDia= s.substring(0,pos1);
		dia=Integer.parseInt(sDia);
		
		
		
		String sMes= s.substring(pos1+1,pos2);
		mes= Integer.parseInt(sMes);
		
		
		
		String sAnio= s.substring(pos2+1);
		anio= Integer.parseInt(sAnio);
		
	}
     
     
     private int fechaToDias() {
    	 
    	 
    	 return anio*360+mes*30+dia;
     }
     
      
     private void diasToFecha(int i) {
    	 
    	 
    	 
    	 anio= (int)i/360;
    	 
    	 int resto =i % 360;
    	 
    	 mes=(int)resto/30;
    	 dia=resto%30;
    	 if(dia ==0) {
    		 
    		 dia=30;
    		 mes--;
    	 }
    	 
    	 if (mes ==0) {
    		 
    		 mes=12;
    		 anio--;
    	 }
     }
     
     public void addDias(int d) {
    	 
    	 
    	 int sum= fechaToDias()+d;
    	 
    	 diasToFecha(sum);
     }
		
	public String toString() {
		
		
		
		
		return dia+"/"+mes+"/"+anio;
	}	
		
		
	public boolean equals(Object o) {
		
		Fecha otra = (Fecha)o;
		return (dia == otra.dia) && ( mes== otra.mes)&& (anio == otra.anio);
	}	
		
		
		
	

}
