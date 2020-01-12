package outros;

public class Conta {

	private Integer numero;
	private String nome;
	private Float saldo;
	private Float limiteSaque;
	
	public Conta(Integer numero, String nome, Float saldo, Float limiteSaque) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getSaldo() {
		return saldo;
	}

	public void setSaldo(Float saldo) {
		this.saldo = saldo;
	}

	public Float getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Float limiteSaque) {
		this.limiteSaque = limiteSaque;
	};
	
	public void depositar(float quantia) {
		saldo += quantia;
	}
	
	public void saque(float quantia) {
		if(quantia > saldo) {
			throw new DominioException("ERRO. Você não possui saldo suficiente para esta operação.");
		}
		if(quantia > limiteSaque) {
			throw new DominioException("ERRO. Quantia de saque não permitido. Contacte seu gerente.");
		}
		saldo -= quantia;
	}
}
