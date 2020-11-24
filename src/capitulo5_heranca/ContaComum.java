package capitulo5_heranca;

public class ContaComum {

	private ManipuladorDeSaldo manipuladorDeSaldo;

    public ContaComum() {
        this.manipuladorDeSaldo = new ManipuladorDeSaldo();
    }

    public void deposita(double valor) {
       manipuladorDeSaldo.deposita(valor);;
    }

    public void saca(double valor) {
        manipuladorDeSaldo.saca(valor);
    }

    public void rende() {
        manipuladorDeSaldo.rende(0.01);
    }

    public double getSaldo() {
        return manipuladorDeSaldo.getSaldo();
    }
}
