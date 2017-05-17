package br.ufc.dc.tpi.banco;

import br.ufc.dc.tpi.banco.contas.*;

public interface IBanco {
	
	public double saldoTotal();
	public int numeroContas();
	public void cadastrar(ContaAbstrata conta);
	private ContaAbstrata procurar(String numero);
	public void creditar(String numero, double valor);
	public void debitar(String numero, double valor);
	public double saldo(String numero);
	public void transferir(String origem, String destino, double valor);
	
}
