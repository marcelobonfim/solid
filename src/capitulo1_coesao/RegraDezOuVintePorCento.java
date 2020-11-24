package capitulo1_coesao;

public class RegraDezOuVintePorCento implements RegraDoCargo {

	public RegraDezOuVintePorCento() {

	}

	@Override
	public double calcular(Funcionario funcionario) {
		if (funcionario.getSalarioBase() > 3000.0) {
			return funcionario.getSalarioBase() * 0.8;
		} else {
			return funcionario.getSalarioBase() * 0.9;
		}
	}
}
