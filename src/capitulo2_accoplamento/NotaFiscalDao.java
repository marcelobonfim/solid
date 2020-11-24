package capitulo2_accoplamento;

public class NotaFiscalDao implements AcaoAposGerarNotaFiscal {
	
	public void executa(NotaFiscal nf) {
        System.out.println("salva nf no banco");
    }
	
}
