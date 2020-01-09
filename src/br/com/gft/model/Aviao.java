package br.com.gft.model;

public class Aviao extends Veiculo {
	public String Tipo;
	public int Uso;
	public int Altura;
	
	public Aviao(String modelo,int velocidade, int passageiro, int combustivel, String tipo, int uso, int altura){
		super(modelo, velocidade, passageiro, combustivel);
		this.Tipo=tipo;
		this.Uso=uso;
		this.Altura=altura;
	}
	
	public String getTipo(){
		return this.Tipo;
	}
	public int getUso() {
		return this.Uso;
	}
	public int getAltura() {
		return this.Altura;
	}
}
