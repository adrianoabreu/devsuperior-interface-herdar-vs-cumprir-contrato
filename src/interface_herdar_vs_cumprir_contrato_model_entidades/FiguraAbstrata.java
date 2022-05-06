package interface_herdar_vs_cumprir_contrato_model_entidades;

import interface_herdar_vs_cumprir_contrato_enum.Cor;

public abstract class FiguraAbstrata implements Figura{

	private Cor cor;

	
	public FiguraAbstrata(Cor cor) {
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
	
}
