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
		int opcao = 5, peso;
		String origem , destino;
		
		while(opcao!=0){
			System.out.println("1 - Add vertices e aresta");
			System.out.println("2 - Imprimir Grafo dado");
			System.out.println("3 - Obter arvore de Busca em Profundidade");
			System.out.println("4 - Obter arvore de Busca em Largura");
			System.out.println("0 - fim"+"\n");
			
			opcao = Keyboard.readInt();
			
			//dando um reset no grafo de resultado
			resultado.clearLists();
			
			//limpando verificadores booleanos
			inicial.limparArestaVisitada();
			inicial.limparVerticeVisitado();
			
			switch (opcao){
			case 1:
				System.out.print("Coloque o peso: "+"\n");
				peso = Keyboard.readInt();
				System.out.print("Coloque o origem: "+"\n");
				origem = Keyboard.readString();
				System.out.print("Coloque o Destino: "+"\n");
				destino = Keyboard.readString();
				inicial.addAresta(peso,origem,destino);
				
				inicial.imprimeArvore();
				break;
			case 2:
				inicial.imprimeArvore();
				break;
				
			case 3:
				//Algoritmo de Busca em Profundidade
				
				origem = Keyboard.readString();
				destino = Keyboard.readString();
				resultado.setArestas(inicial.buscaEmProfundidade(origem, destino));
				
				resultado.imprimeArvore();
				break;
			case 4:
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
