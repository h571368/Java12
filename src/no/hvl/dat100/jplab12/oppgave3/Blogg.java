package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;


public class Blogg {
	
protected Innlegg innleggstabell[];
protected int nesteledige;


	
	public Blogg() {
		this.innleggstabell = new Innlegg[20];
		this.nesteledige = 0;

	}

	public Blogg(int lengde) {
		this.innleggstabell = new Innlegg[lengde];
		this.nesteledige = 0;
	}
	
	

	public int getAntall() {
		return nesteledige;
	}
	
	public Innlegg[] getSamling() {
		return innleggstabell;
	}
	
	public void setSamling(Innlegg[] innleggtab) {
		this.innleggstabell = innleggtab;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		Innlegg[] samling = getSamling();
		
		int i = 0;
		int x = 0;
		while(i < samling.length) {
			
			if(samling[i] == innlegg) {
				x = i;
			}
			else {
				x = -1;
			}
			i++;
		}
		
		return x;

	}

	public boolean finnes(Innlegg innlegg) {
		Innlegg[] samling = getSamling();
		
		int i = 0;
		boolean x = false;
		while(i < samling.length) {
			
			if(samling[i] == innlegg) {
				x = true;
			}
		
			i++;
		}
		
		return x;

	}

	public boolean ledigPlass() {
		Innlegg[] samling = getSamling();
		
		int i = 0;
		boolean x = false;
		while(i < samling.length) {
			if(samling[i] == null) {
				nesteledige = i;
				x = true;
				
			}
			i++;
		}
		
		return x;
			
		}

	
	public boolean leggTil(Innlegg innlegg) {
		
		Innlegg[] samling = getSamling();
		int i = 0;
		boolean x = false;
		while(i < samling.length) {
			if(finnes(innlegg) == false && ledigPlass() == true) {
			samling[nesteledige] = innlegg;
			setSamling(samling);
			
			x = true;
			}
			
			i++;
		}
		
		return x;
			
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