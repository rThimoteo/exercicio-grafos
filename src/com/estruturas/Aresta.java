package com.estruturas;

public class Aresta {

	private double peso;
	private Vertice origem;
	private Vertice destino;
	private boolean visitado = false;
	
	
	public Aresta(double peso, Vertice origem, Vertice destino) {
		this.setPeso(peso);
		this.setOrigem(origem);
		this.setDestino(destino);
	}
	
	public boolean isVisitado() {
		return visitado;
	}

	public void setVisitado(boolean visitado) {
		this.visitado = visitado;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Vertice getOrigem() {
		return origem;
	}

	public void setOrigem(Vertice origem) {
		
		this.origem = origem;
	}

	public Vertice getDestino() {
		return destino;
	}

	public void setDestino(Vertice destino) {
		
		this.destino = destino;
	}
	
	@Override
	public String toString() {
		String s = " ";
		s+= this.getOrigem().getNome() + this.getDestino().getNome();
		return s;
	}

}
