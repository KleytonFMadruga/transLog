package com.kleyton.translateProlog;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TranslatePrologApplication {

	public static void main(String[] args) throws Exception {

		try {
			SpringApplication app = new SpringApplication(TranslatePrologApplication.class);
			app.setDefaultProperties(Collections.singletonMap("server.port", "1231"));
			app.run(args);

		} catch (Exception e) {
			System.out.println( "O Tomcat já foi iniciado pelo app: message log: " + e.getMessage());

		} finally {
			ExecutaBrowser.executaBrowser();
			GeradorArquivo.criaDiretorio();
			GeradorArquivo.criaArquivo();

		}

	}

}
