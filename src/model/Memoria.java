package model;

import java.util.ArrayList;
import java.util.List;

public class Memoria {

	private List<SegmentoMemoria> segmentos;
	
	public Memoria() {
		super();
		this.segmentos = new ArrayList<SegmentoMemoria>();
		
	}
	
	public Memoria(List<SegmentoMemoria> segmentos) {
		super();
		this.segmentos = segmentos;
	}

	public List<SegmentoMemoria> getSegmentos() {
		return segmentos;
	}

	@Override
	public String toString() {
		String segmentosToString = "";
		for(SegmentoMemoria seg : getSegmentos()) {
			segmentosToString = segmentosToString + seg.toString() + "\n";
		}
		return segmentosToString;
	}
	
	
}
