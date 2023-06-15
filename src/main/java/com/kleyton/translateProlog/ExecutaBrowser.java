package com.kleyton.translateProlog;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ExecutaBrowser {

	public static void executaBrowser() throws Exception {

		Process processo = Runtime.getRuntime().exec("xdg-settings get default-web-browser");

		InputStream stdin = processo.getInputStream();
		BufferedReader leitor = new BufferedReader(new InputStreamReader(stdin));
		String name = null;

		name = leitor.readLine();
		leitor.close();
		processo.destroy();

		String browserName = name.replace(".desktop", "");
		Runtime.getRuntime().exec(browserName + " http://localhost:1231/app");
	}
}
