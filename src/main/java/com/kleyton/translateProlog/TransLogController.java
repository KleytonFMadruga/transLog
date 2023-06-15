package com.kleyton.translateProlog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TransLogController {


	@GetMapping(value = "/app")
	public void getPage() {

	}
	
	@RequestMapping(value = "/app", method = RequestMethod.POST)
	public String saveCodigo(Arquivo arquivo) throws Exception {
		try {
			GeradorArquivo.escreveArquivo(Tradutor.traducao(arquivo.fatos, arquivo.regras));
		}catch(Exception e) {
			System.out.println("deu um erro aqui " + e);
		}
		return "redirect:/app";
	}
	
}
