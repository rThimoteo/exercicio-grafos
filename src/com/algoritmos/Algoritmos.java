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
					int [][] pos = new int [1][1];
					inicial.acharVertice("a").setPosicao(pos);
					
					inicial.addVertice("b");
					pos = new int [1][2];
					inicial.acharVertice("b").setPosicao(pos);
					
					inicial.addVertice("c");
					pos = new int [1][3];
					inicial.acharVertice("c").setPosicao(pos);
					
					inicial.addVertice("d");
					pos = new int [2][1];
					inicial.acharVertice("d").setPosicao(pos);
					
					inicial.addVertice("e");
					pos = new int [2][2];
					inicial.acharVertice("e").setPosicao(pos);
					
					inicial.addVertice("f");
					pos = new int [2][3];
					inicial.acharVertice("f").setPosicao(pos);
				}
				if(op>2) {
					inicial.addVertice("g");
					int [][] pos = new int [3][1];
					inicial.acharVertice("g").setPosicao(pos);
					
					inicial.addVertice("h");
					pos = new int [3][2];
					inicial.acharVertice("h").setPosicao(pos);
					
					inicial.addVertice("i");
					pos = new int [3][3];
					inicial.acharVertice("i").setPosicao(pos);
				}
				if(op>3) {	
					inicial.addVertice("j");
					int [][] pos = new int [4][1];
					inicial.acharVertice("j").setPosicao(pos);
					
					inicial.addVertice("k");
					pos = new int [4][2];
					inicial.acharVertice("k").setPosicao(pos);
					
					inicial.addVertice("l");
					pos = new int [4][3];
					inicial.acharVertice("l").setPosicao(pos);
				}
				if(op>4) {
					inicial.addVertice("m");
					int [][] pos = new int [5][1];
					inicial.acharVertice("m").setPosicao(pos);
					inicial.addVertice("n");
					pos = new int [5][2];
					inicial.acharVertice("n").setPosicao(pos);
					
					inicial.addVertice("o");
					pos = new int [5][3];
					inicial.acharVertice("o").setPosicao(pos);
				}
				if(op>5){
					inicial.addVertice("p");
					int [][] pos = new int [6][1];
					inicial.acharVertice("p").setPosicao(pos);
					
					inicial.addVertice("q");
					pos = new int [6][2];
					inicial.acharVertice("q").setPosicao(pos);
					
					inicial.addVertice("r");
					pos = new int [6][3];
					inicial.acharVertice("r").setPosicao(pos);
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
