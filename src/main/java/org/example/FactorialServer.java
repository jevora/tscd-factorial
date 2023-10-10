package org.example;

import static spark.Spark.get;
import static spark.Spark.port;

public class FactorialServer {
	public static void main(String[] args) {
		System.out.println("arrancando servidor");
		port(8080);
		get("/factorial/:number", (req, res) -> {
			try {
				String numberParam = req.params("number");
				long factorial = calculateFactorial(Integer.parseInt(numberParam));
				return "El factorial de " + numberParam + " es " + factorial + "\n\n";
			} catch (NumberFormatException e) {
				return "Por favor, proporciona un número válido como parámetro 'number'.";
			}
		});
		System.out.println("servidor arrancado");
	}

	private static long calculateFactorial(int number) {
		long factorial = 1;
		for (int i = 2; i <= number; i++) factorial *= i;
		return factorial;
	}
}

