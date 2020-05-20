package com.algoritmos;

import java.util.ArrayList;

import com.IO.Keyboard;
import com.estruturas.Aresta;
import com.estruturas.Grafo;
import com.estruturas.Vertice;

public class Algoritmos {
	
	public static void main(String arg[]) {

		Grafo inicial = new Grafo();
		Grafo resultado = new Grafo();
		
		Aresta arestaAux;
		Vertice verticeAux1, verticeAux2;
		int opcao = 5;
		double peso = 0;
		String origem , destino;
		
		while(opcao!=0){
			System.out.println("1 - Criar Grafo");
			System.out.println("2 - Add Aresta");
			System.out.println("3 - Imprimir Grafo dado");
			System.out.println("4 - Obter arvore de Busca em Profundidade");
			System.out.println("5 - Obter arvore de Busca em Largura");
			System.out.println("0 - fim");
			
			opcao = Keyboard.readInt();
			
			//dando um reset no grafo de resultado
			resultado.clearLists();
			
			//limpando verificadores booleanos
			inicial.limparArestaVisitada();
			inicial.limparVerticeVisitado();
			
			switch (opcao){
			case 1:
				System.out.print("Escolha o Numero de colunas (entre 2 e 6): \n");
				int op = 0;
				op = Keyboard.readInt();
				if (op<2 || op>6) {
					System.out.print("\nO Numero deve estar entre 2 e 6");
					System.out.print("\n\nENTER para continuar");
					Keyboard.readInt();
					break;
				}
				
				if(op>1) {
					inicial.addVertice("a");
					inicial.addVertice("b");
					inicial.addVertice("c");
					inicial.addVertice("d");
					inicial.addVertice("e");
					inicial.addVertice("f");
				}
				if(op>2) {
					inicial.addVertice("g");
					inicial.addVertice("h");
					inicial.addVertice("i");
				}
				if(op>3) {	
					inicial.addVertice("j");
					inicial.addVertice("k");
					inicial.addVertice("l");
				}
				if(op>4) {
					inicial.addVertice("m");
					inicial.addVertice("n");
					inicial.addVertice("o");
				}
				if(op>5){
					inicial.addVertice("p");
					inicial.addVertice("q");
					inicial.addVertice("r");
				}
				inicial.imprimeArvore();
			break;
			case 2:	
				System.out.print("Coloque o peso (1=1, 2=Raiz de 2): "+"\n");
				int tipoP = 0;
				tipoP = Keyboard.readInt();
				if (tipoP==1)
					peso = 1;
				if (tipoP==2)
					peso=Math.sqrt(2);
				System.out.print("Coloque o origem: "+"\n");
				origem = Keyboard.readString();
				System.out.print("Coloque o Destino: "+"\n");
				destino = Keyboard.readString();
				inicial.addAresta(peso,origem,destino);
				
				inicial.imprimeArvore();
				break;
			case 3:
				inicial.imprimeArvore();
				break;
				
			case 4:
				//Algoritmo de Busca em Profundidade
				
				origem = Keyboard.readString();
				destino = Keyboard.readString();
				resultado.setArestas(inicial.buscaEmProfundidade(origem, destino));
				
				resultado.imprimeArvore();
				break;
			case 5:
				//Algoritmo de Busca em Largura
				
				origem = Keyboard.readString();
				destino = Keyboard.readString();
				resultado.setArestas(inicial.buscaEmLargura(origem, destino));
				
				resultado.imprimeArvore();
				break;
			case 0:
				break;
			default:
				System.out.println("invalido");
				break;
			}
			
		}
	}
}
