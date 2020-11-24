package capitulo3_ocp_dip;

public class CalculadoraDePrecos {
	
	private TabelaDePreco tabela;
	private Frete correios;

	public CalculadoraDePrecos(TabelaDePreco tabela, Frete frete) {
		this.tabela = tabela;
		this.correios = frete;
		
	}

	public double calcula(Compra produto) {
		double desconto = tabela.descontoPara(produto.getValor());
		double frete = correios.para(produto.getCidade());

		return produto.getValor() * (1 - desconto) + frete;
	}

}
