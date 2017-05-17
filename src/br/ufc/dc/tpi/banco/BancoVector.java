package br.ufc.dc.tpi.banco;

import br.ufc.dc.tpi.banco.contas.Conta;
import java.util.Vector;

public class BancoVector{
	
	private Vector<ContaAbstrata> vetorContas = new Vector<Conta>();
	
	public BancoVector {}
	
	public void cadastrar(Conta conta){
		listaContas.add(conta);
	}
	
	public void procurar(String numero){
		for(int i=0; i < listaContas.size(); i++){
			
		}
	}
	
	public void creditar(String numero, double valor){
		//...
	}
	
	public void debitar(String numero, double valor){
		//...
	}
	
	public double saldo(){
		//...
	}
	
	public void transferir(String origem, String destino, double valor){
		//...
	}
	
}