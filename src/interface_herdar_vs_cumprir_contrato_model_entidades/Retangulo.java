package interface_herdar_vs_cumprir_contrato_model_entidades;

import interface_herdar_vs_cumprir_contrato_enum.Cor;

public class Retangulo extends FiguraAbstrata{

	private Double largura;
	private Double altura;

	public Retangulo(Cor cor, Double largura, Double altura) {
		super(cor);
		this.largura = largura;
		this.altura = altura;
	}

	public Double getWidth() {
		return largura;
	}

	public void setWidth(Double largura) {
		this.largura = largura;
	}

	public Double getHeight() {
		return altura;
	}

	public void setHeight(Double altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
		return largura * altura;
	}
	
}
