package br.com.gft.main;

import br.com.gft.model.Veiculo;
import br.com.gft.model.Aviao;
import br.com.gft.model.Carro;

public class Main {
	public static void main(String[] args){
		Carro meucarro= new Carro("Porte pequeno",50,4,100,"HB20",2,2010);
		Aviao meuaviao= new Aviao("Porte grande",500,70,10000,"ATR600",5,2000);
		
		System.out.println("CARRO");
		System.out.println("Modelo: "+meucarro.getModelo());
		System.out.println("Velocidade: "+meucarro.getVelocidade()+" Km/h");
		System.out.println("Número de passageiro: "+meucarro.getPassageiro()+" pessoas");
		System.out.println("Quantidade de combustivel: "+meucarro.getCombustivel()+" litros");
		System.out.println("Marca: "+meucarro.getMarca());
		System.out.println("Número de porta: "+meucarro.getPorta());
		System.out.println("Ano: "+meucarro.getAno());
		System.out.println("______________________________________________________________________");
		System.out.println("AVIÃO");
		System.out.println("Modelo: "+meuaviao.getModelo());
		System.out.println("Velocidade: "+meuaviao.getVelocidade()+" Km/h");
		System.out.println("Número de passageiro: "+meuaviao.getPassageiro()+" pessoas");
		System.out.println("Quantidade de combustivel: "+meuaviao.getCombustivel()+" litros");
		System.out.println("Tipo: "+meuaviao.getTipo());
		System.out.println("Uso: "+meuaviao.getUso()+" anos");
		System.out.println("Altura máxima: "+meuaviao.getAltura()+" Km");
	}
	
}
