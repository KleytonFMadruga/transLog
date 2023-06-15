package com.kleyton.translateProlog;

import javax.annotation.ManagedBean;

@ManagedBean
public class Tradutor {
	
	public static String traducao(String codigoEmPt_fatos, String codigoEmPt_regras) {
		String codigo = "";
		String cf = codigoEmPt_fatos;
//		String cr = codigoEmPt_regras;
		int i = 0;
		
//		//traduzindo fatos
//		while(cf.charAt(i) != ',') {
//			
//			if(cf.charAt(i) == ';') {
//				codigo += ".\n";				
//			}else {
//				codigo += cf.charAt(i);
//			}
//			i++;
//			
//		}
//		
//		if(codigo.length()>0) {
//			codigo += ".\n";
//		}
		
				
		//traduzindo regras
//		i=0;
//		while(cr.charAt(i) != cr.length()) {
//			if((cr.charAt(i)=='S') && (cr.charAt(i+1)=='E')) {
//				codigo += ":-";
//				i++;
//			}else if(cr.charAt(i) == ';') {
//				codigo += ".\n";
//			}else {
//				codigo += cr.charAt(i);
//			}
//			i++;
//		}
//		
//		if(cr.length()>0) {
//			codigo += ".\n";
//		}
//		System.out.println("TAMANHO: " + codigoEmPt_regras);
//		return codigo;
		
		//OS CÓDIGOS ESTÃO SENDO CAPTURADOS POR APENAS UMA VARIÁVEL!!!!!
		return codigoEmPt_fatos ;
	}
	
		
}
