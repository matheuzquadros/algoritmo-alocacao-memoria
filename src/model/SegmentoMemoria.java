package model;

public class SegmentoMemoria {
	private int id;
	private int tamanho;
	private int espacoAlocado;
	
	public SegmentoMemoria(int id, int tamanho) {
		super();
		this.id = id;
		this.tamanho = tamanho;
		
	}
	
	public int getId() {
		return id;
	}
	
	
	public int getTamanho() {
		return tamanho;
	}

	public int getEspacoAlocado() {
		return espacoAlocado;
	}

	public boolean alocarProcesso(int espacoParaAlocar) {
		if(espacoParaAlocar <= tamanho) {
			this.espacoAlocado = espacoParaAlocar;
		}
		return espacoParaAlocar <= tamanho;
	}

	@Override
	public String toString() {
		return "SegmentoMemoria [id=" + id + ", tamanho=" + tamanho + ", espacoAlocado=" + espacoAlocado + "]";
	}
	
	
	
	
	
	
}
