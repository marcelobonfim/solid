package capitulo1_coesao;

public enum Cargo {
    DESENVOLVEDOR(new RegraDezOuVintePorCento()),
    DBA(new RegraQuinzeOuVintePorCento()),
    TESTER(new RegraQuinzeOuVintePorCento()); 
    
    private RegraDoCargo regraDoCargo;

	private Cargo(RegraDoCargo regraDoCargo) {
		this.regraDoCargo = regraDoCargo;
    }

	public RegraDoCargo getRegraDoCargo() {
		return regraDoCargo;
	}

	public void setRegraDoCargo(RegraDoCargo regraDoCargo) {
		this.regraDoCargo = regraDoCargo;
	}
}
