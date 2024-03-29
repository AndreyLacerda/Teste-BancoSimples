package br.edu.ifsp.spo.lp1a3.simple_bank;

public class ContaPoupanša extends Conta{
	
	public ContaPoupanša(String titular, String numeroConta) {
		super(titular, numeroConta);
	}

	private static double taxaRendimento = 0.085;

	public static double getTaxaRendimento() {
		return taxaRendimento;
	}

	public static void setTaxaRendimento(double taxaRendimento) {
		ContaPoupanša.taxaRendimento = taxaRendimento;
	}
	
	public void aplicarRendimento() {
		double valor = this.getSaldo() * getTaxaRendimento();
		this.depositar(valor);
	}
}
