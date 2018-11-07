package main;

import java.util.ArrayList;
import java.util.List;

import model.AlgoritmoAlocacao;
import model.Memoria;
import model.SegmentoMemoria;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> processos = new ArrayList<Integer>();
		processos = gerarProcessos();
		
		//Comentar as outras questoes ao gerar os dados. Ex: para gerar os dados da questão a, 
		//deve-se comentar os processos e os segmentos das demais questoes.
		
		
		Memoria memoria = new Memoria(gerarSegmentos());
		
		// First fit
		System.out.println("\n First fit \n");
		
		for(int processo : processos) {
			AlgoritmoAlocacao.firstFit(memoria, processo);			
		}
		
		System.out.println(memoria.toString());
		
		//Best fit
		System.out.println("\n Best fit \n");
		
		memoria = new Memoria(gerarSegmentos());
		for(int processo : processos) {
			AlgoritmoAlocacao.bestFit(memoria, processo);			
		}
		
		System.out.println(memoria.toString());
		
		//Worst fit
		System.out.println("\n Worst fit \n");
				
		memoria = new Memoria(gerarSegmentos());
		for(int processo : processos) {
			AlgoritmoAlocacao.worstFit(memoria, processo);			
		}		
		System.out.println(memoria.toString());
		
		// Circular fit
		memoria = new Memoria(gerarSegmentos());
		System.out.println("\n Circular fit \n");
				
		for(int processo : processos) {
			AlgoritmoAlocacao.firstFit(memoria, processo);			
		}
		System.out.println(memoria.toString());
		
		
	}
	private static List<Integer> gerarProcessos(){
		List<Integer> processos = new ArrayList<Integer>();
		
		//a
		processos.add(3);
		processos.add(8);
		processos.add(5);
		processos.add(10);
		processos.add(6);
		
		
		//b
		processos.add(6);
		processos.add(4);
		processos.add(15);
		processos.add(4);
		processos.add(8);
		
		//c
		processos.add(6);
		processos.add(12);
		processos.add(26);
		processos.add(18);
		processos.add(30);
		
		
		return processos;
	}
	
	private static List<SegmentoMemoria> gerarSegmentos(){
		List<SegmentoMemoria> segmentosMemoria = new ArrayList<SegmentoMemoria>();
		
		//a- 11K, 5K, 19K, 17K, 8K, 14K, 12K e 13K,
		segmentosMemoria.add(new SegmentoMemoria(1, 11));
		segmentosMemoria.add(new SegmentoMemoria(2, 5));
		segmentosMemoria.add(new SegmentoMemoria(3, 19));
		segmentosMemoria.add(new SegmentoMemoria(4, 17));
		segmentosMemoria.add(new SegmentoMemoria(5, 8));
		segmentosMemoria.add(new SegmentoMemoria(6, 14));
		segmentosMemoria.add(new SegmentoMemoria(7, 12));
		segmentosMemoria.add(new SegmentoMemoria(8, 13));
		
		//b- 15K, 4K, 25K, 18K, 5K, 9K, 12K e 13K
		segmentosMemoria.add(new SegmentoMemoria(1, 15));
		segmentosMemoria.add(new SegmentoMemoria(2, 4));
		segmentosMemoria.add(new SegmentoMemoria(3, 25));
		segmentosMemoria.add(new SegmentoMemoria(4, 18));
		segmentosMemoria.add(new SegmentoMemoria(5, 5));
		segmentosMemoria.add(new SegmentoMemoria(6, 9));
		segmentosMemoria.add(new SegmentoMemoria(7, 12));
		segmentosMemoria.add(new SegmentoMemoria(8, 13));
				
		//c- 2K, 4K, 8K, 16K, 32K, 64K, 128K e 256K
		segmentosMemoria.add(new SegmentoMemoria(1, 2));
		segmentosMemoria.add(new SegmentoMemoria(2, 4));
		segmentosMemoria.add(new SegmentoMemoria(3, 8));
		segmentosMemoria.add(new SegmentoMemoria(4, 16));
		segmentosMemoria.add(new SegmentoMemoria(5, 32));
		segmentosMemoria.add(new SegmentoMemoria(6, 64));
		segmentosMemoria.add(new SegmentoMemoria(7, 128));
		segmentosMemoria.add(new SegmentoMemoria(8, 256));
		return segmentosMemoria;
	}
}
