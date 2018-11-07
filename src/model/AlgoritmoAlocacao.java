package model;

public class AlgoritmoAlocacao {

	public static void firstFit(Memoria memoria, int tamanhoProcesso) {
		for(SegmentoMemoria seg : memoria.getSegmentos()) {
			if(seg.getEspacoAlocado() == 0) {
				boolean alocouProcesso = seg.alocarProcesso(tamanhoProcesso);
				if(alocouProcesso) {
					break;
				}
			}
		}
	}
	
	public static void bestFit(Memoria memoria, int tamanhoProcesso) {
		int bestFitId = 1;
		double bestFitMenorEspaco = Double.MAX_VALUE;
		
		for(SegmentoMemoria seg : memoria.getSegmentos()) {
			if(seg.getEspacoAlocado() == 0 && tamanhoProcesso <= seg.getTamanho()) {
				double diferenca = seg.getTamanho() - tamanhoProcesso;
				if(diferenca < bestFitMenorEspaco) {
					bestFitMenorEspaco = diferenca;
					bestFitId = seg.getId();
				}
			}
		}
		
		int id = bestFitId;
		
		SegmentoMemoria bestFitSegment  = memoria.getSegmentos().stream().filter(p -> p.getId() == id).findFirst().orElse(null);
		if(bestFitSegment != null) {
			bestFitSegment.alocarProcesso(tamanhoProcesso);
		}
	}
	
	public static void worstFit(Memoria memoria, int tamanhoProcesso) {
		int worstFitId = 1;
		double worstFitMaiorEspaco = 0;
		
		for(SegmentoMemoria seg : memoria.getSegmentos()) {
			if(seg.getEspacoAlocado() == 0 && tamanhoProcesso <= seg.getTamanho()) {
				double diferenca = seg.getTamanho() - tamanhoProcesso;
				if(diferenca > worstFitMaiorEspaco) {
					worstFitMaiorEspaco = diferenca;
					worstFitId = seg.getId();
				}
			}
		}
		
		int id = worstFitId;
		
		SegmentoMemoria worstFitSegment  = memoria.getSegmentos().stream().filter(p -> p.getId() == id).findFirst().orElse(null);
		if(worstFitSegment != null) {
			worstFitSegment.alocarProcesso(tamanhoProcesso);
		}
	}
}
