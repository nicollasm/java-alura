package br.com.nicollas.exercicios;

public class Recibo implements Comparable<Recibo> {

	private String nomeEmpresa;
	private double valorRecibo;

	public Recibo(String nomeEmpresa, double valorRecibo) {
		this.nomeEmpresa = nomeEmpresa;
		this.valorRecibo = valorRecibo;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public double getValorRecibo() {
		return valorRecibo;
	}

	@Override
	public int compareTo(Recibo rec) {
		return (int) this.valorRecibo;
	}

	@Override
	public String toString() {
		return "Nome da empresa: " + this.nomeEmpresa + ", valor do recibo: " + this.valorRecibo;
	}
	
}
