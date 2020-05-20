/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.grafo;

/**
 *
 * @author Rodrigo
 */
public class Aresta {
    private String rotulo;
    private Vertice v1;
    private Vertice v2;
    private int peso;

    public Aresta(Vertice v1, Vertice v2) {
	super();
	this.v1 = v1;
	this.v2 = v2;
    }
    public String getRotulo() {
        return rotulo;
    }
    
    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }
    
    public Vertice getV1() {
        return v1;
    }
    
    public void setV1(Vertice v1) {
        this.v1 = v1;
    }
    
    public Vertice getV2() {
        return v2;
    }
    
    public void setV2(Vertice v2) {
        this.v2 = v2;
    }
    
    public int getPeso() {
        return peso;
    }
    
    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public boolean contemAresta(Vertice v1,Vertice v2){
        if((this.v1 == v1)&&(this.v2 == v2))
            return(true);
        if((this.v1 == v2)&&(this.v2 == v1)) 
            return(true);
        return(false);
    }
    
    public boolean contemVertice(Vertice v){
        if(this.v1 == v) 
            return(true);
        if(this.v2 == v) 
            return(true);
        return(false);
    }

}




