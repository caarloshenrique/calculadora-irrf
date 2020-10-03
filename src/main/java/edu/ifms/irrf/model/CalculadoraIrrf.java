package edu.ifms.irrf.model;

import java.text.DecimalFormat;

public class CalculadoraIrrf {
	
	public static String calcularInss(double salario, int dependentes, double inss) {
		double valorDependentes = dependentes * 189.59;
		double baseCalculo = salario - valorDependentes - inss;
		
		if (baseCalculo > 1903.98) {
			 if (baseCalculo < 2826.65)
				 return new DecimalFormat("#,##0.00").format(baseCalculo * 0.075 - 142.80);
			 else
				 if (baseCalculo < 3751.05)
					 return new DecimalFormat("#,##0.00").format(baseCalculo * 0.15 - 354.80);
				 else
					 if (baseCalculo < 4664.68)
						 return new DecimalFormat("#,##0.00").format(baseCalculo * 0.225 - 636.13);
					 else
						 return new DecimalFormat("#,##0.00").format(baseCalculo * 0.275 - 869.36);
		} else {
			return "0";
		} 
	}
}
