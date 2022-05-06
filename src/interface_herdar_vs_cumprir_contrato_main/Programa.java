package interface_herdar_vs_cumprir_contrato_main;

import interface_herdar_vs_cumprir_contrato_enum.Cor;
import interface_herdar_vs_cumprir_contrato_model_entidades.Circulo;
import interface_herdar_vs_cumprir_contrato_model_entidades.FiguraAbstrata;
import interface_herdar_vs_cumprir_contrato_model_entidades.Retangulo;

public class Programa {

	public static void main(String[] args) {
		
		FiguraAbstrata s1 = new Circulo(Cor.PRETO, 2.0);
		FiguraAbstrata s2 = new Retangulo(Cor.BRANCO, 3.0, 4.0);
		
		System.out.println("Cor  do   Circulo: " + s1.getCor());
		System.out.println("Area do   Circulo: " + String.format("%.3f", s1.area()));
		System.out.println("Cor  do Retangulo: " + s2.getCor());
		System.out.println("Area do Retangulo: " + String.format("%.3f", s2.area()));

	}

}
