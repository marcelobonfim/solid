package capitulo5_heranca;

public class ManipuladorDeSaldo {

	private double saldo;

	public ManipuladorDeSaldo() {
		this.saldo = 0;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void rende(double taxa) {
		this.saldo += this.saldo * taxa;
	}

	public double getSaldo() {
		return saldo;
	}

}
