package org.example;

import static spark.Spark.get;
import static spark.Spark.port;

public class FactorialServer {
	public static void main(String[] args) {
		port(80);
		get("/factorial", (req, res) -> {
			try {
				String numberParam = req.queryParams("number");
				long factorial = calculateFactorial(Integer.parseInt(numberParam));
				return "El factorial de " + numberParam + " es " + factorial;
			} catch (NumberFormatException e) {
				return "Por favor, proporciona un número válido como parámetro 'number'.";
			}
		});
	}

	private static long calculateFactorial(int number) {
		long factorial = 1;
		for (int i = 2; i <= number; i++) factorial *= i;
		return factorial;
	}
}

