
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private String titular;
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	public boolean transfere(double valor, Conta destino) {
		if(!(this.saldo<valor)) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
		
	}
	public boolean saca(double valor) {
		if(!(this.saldo<valor)) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
}