package com.kleyton.translateProlog;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.annotation.ManagedBean;

@ManagedBean
public class GeradorArquivo {
	

	public static String obtemUserSystem() throws Exception {
		Process processo = Runtime.getRuntime().exec("id -un");
		InputStream stdin = processo.getInputStream();
		BufferedReader leitor = new BufferedReader(new InputStreamReader(stdin));
		String user = null;

		user = leitor.readLine();
		leitor.close();
		processo.destroy();

		return user;
	}
	
	public static void criaDiretorio() throws Exception {

		String user = obtemUserSystem();

		try {
			File diretorio = new File("/home/" + user + "/translog");
			diretorio.mkdir();
			
		} catch (Exception e) {
			System.out.println("ocorreu um erro.");
			e.printStackTrace();
		}
		
	}

	public static void criaArquivo() throws Exception {
		
		String user = obtemUserSystem();
		
		try {
			File arquivo = new File("/home/" + user +"/translog/program.pl");
	     
			if (arquivo.createNewFile()) {
	        System.out.println("Arquivo gerado: " + arquivo.getName());
			} else {
	        System.out.println("O arquivo já existe.");		        
			}
		      
	    } catch (IOException e) {
	      System.out.println("ocorreu um erro.");
	      e.printStackTrace();
	    }
	}
	
	public static void escreveArquivo(String texto) throws Exception {
		String user = obtemUserSystem();
		FileWriter fw = new FileWriter("/home/" + user + "/translog/program.pl");
		fw.write(texto);
		fw.close();
	}
}
