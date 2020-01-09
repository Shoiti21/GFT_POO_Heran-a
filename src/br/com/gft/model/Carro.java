package br.com.gft.model;

public class Carro extends Veiculo {
	private String Marca;
	private int Porta;
	private int Ano;
	
	public Carro(String modelo,int velocidade, int passageiro, int combustivel, String marca, int porta, int ano){
		super(modelo, velocidade, passageiro, combustivel);
		this.Marca=marca;
		this.Porta=porta;
		this.Ano=ano;
	}
	
	public String getMarca(){
		return this.Marca;
	}
	public int getPorta() {
		return this.Porta;
	}
	public int getAno() {
		return this.Ano;
	}
}
