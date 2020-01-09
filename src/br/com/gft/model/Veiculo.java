package br.com.gft.model;

public class Veiculo {
	protected String Modelo;
	protected int Velocidade;
	protected int Passageiro;
	protected int Combustivel;
	public Veiculo(String modelo, int velocidade, int passageiro, int combustivel) {
		this.Modelo=modelo;
		this.Velocidade=velocidade;
		this.Passageiro=passageiro;
		this.Combustivel=combustivel;
	}
	public String getModelo() {
		return this.Modelo;
	}
	public int getVelocidade() {
		return this.Velocidade;
	}
	public int getPassageiro() {
		return this.Passageiro;
	}
	public int getCombustivel() {
		return this.Combustivel;
	}
}
