package edu.ifms.irrf.model;

public class CalculadoraInss {
	
	public static double calcularInss(double salario) {
		if (salario < 1045)
			return salario * 0.075;
		else
			if (salario < 2089.60)
				return (1045 * 0.075) + ((salario - 1045) * 0.09);
			else
				if(salario < 3134.40)
					return (1045 * 0.075) + ((2089.60 - 1045) * 0.09) + ((salario - 2089.61)* 0.12);
				else
					if(salario < 6101.06)
						return (1045 * 0.075) + ((2089.60 - 1045) * 0.09) + ((3134.40 - 2089.61)* 0.12) + ((salario - 3134.41)* 0.14);
					else
						return 713.08;
	}
	
}
