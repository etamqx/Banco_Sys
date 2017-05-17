package br.ufc.dc.tpi.banco;

import br.ufc.dc.tpi.banco.contas.*;

public class BancoArray {
	
	private ContaAbstrata[] = contas;
	private int indice = 0;

	public BancoArray() {
		contas = new ContaAbstrata[100];
	}

	public void cadastrar(ContaAbstrata conta) {
		contas[indice] = conta;
		indice++;
	}

	private ContaAbstrata procurar(String numero) {
		int i = 0;
		boolean achou = false;

		while((!achou) && (i<indice)) {
			if (contas[i].numero().equals(numero)) {
				achou = true;
			}
			else {
				i++;
			}

		}

		if (achou == true) {
			return contas.[i];
		}

		else {
			return null;
		}
	}

	public void creditar(String numero, float valor) {
		
	}
}