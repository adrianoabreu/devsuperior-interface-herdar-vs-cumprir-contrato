package interface_herdar_vs_cumprir_contrato_model_entidades;

import interface_herdar_vs_cumprir_contrato_enum.Cor;

public class Circulo extends FiguraAbstrata{

	private Double raio;

	public Circulo(Cor cor, Double raio) {
		super(cor);
		this.raio = raio;
	}

	public Double getRadius() {
		return raio;
	}

	public void setRadius(Double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return Math.PI * raio * raio;
	}
	
}
