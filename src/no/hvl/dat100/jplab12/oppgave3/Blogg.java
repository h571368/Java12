
  
package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;

public class Blogg {

	private Innlegg[] samling;
	private int nesteLedig;
	
	

	public Blogg() {
		this.samling = new Innlegg[20];
		this.nesteLedig = 0;
	}

	public Blogg(int lengde) {
		this.samling = new Innlegg[lengde];
		this.nesteLedig = 0;
	}

	public int getAntall() {
		return nesteLedig;
	}
	
	public Innlegg[] getSamling() {
		return samling;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		int i = 0;
		while (i < nesteLedig) {
			if (samling[i].erLik(innlegg)) {
				return i;
				}
			
			i++;
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		if (finnInnlegg(innlegg) == -1) {
			return false;
			}
		
		return true;
	}

	public boolean ledigPlass() {
		
		int i = 0;
		boolean x = false;
		int t = samling.length;
	
		while(i < t){
			if(samling[i] == null) {
				nesteLedig = i;
				t = i;
				x = true;
			}
			i++;
		}
		return x;	
		}
	
	public boolean leggTil(Innlegg innlegg) {
		
		if(!ledigPlass() || finnes(innlegg)) {
			return false;
			}
		
		else {
			samling[nesteLedig] = innlegg;
			nesteLedig++;
			return true;
		}
	}
	
	public String toString() {
		
		throw new UnsupportedOperationException(TODO.method());
	}

	
	
	
	
	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}

