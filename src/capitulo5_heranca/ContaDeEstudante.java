package capitulo5_heranca;

public class ContaDeEstudante {
	
	private ManipuladorDeSaldo manipuladorDeSaldo;
    private int milhas;
    
    public ContaDeEstudante() {
    	 this.manipuladorDeSaldo = new ManipuladorDeSaldo();
	}

    public void deposita(double valor) {
    	manipuladorDeSaldo.deposita(valor);
        this.milhas += (int)valor;
    }

    public int getMilhas() {
        return milhas;
    }
}
