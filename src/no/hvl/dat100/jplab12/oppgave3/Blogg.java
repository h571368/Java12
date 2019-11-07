
  
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
		
		String str = Integer.toString(nesteLedig) + "\n";
		for(int i = 0; i < nesteLedig; i++) {
			str += samling[i].toString();
		}
		
		return str;
		
		//throw new UnsupportedOperationException(TODO.method());
		
		//En metode public String toString() som returnerer data i tabellen som en streng der f�rste linje i strengen angir antall
		//Innlegg-objekt i tabellen, eks., en tabell med to innlegg ( et tekst-innlegg og et bilde-innlegg):
		//2\nTEKST\n1\nOle Olsen\n23-10-2019\n0\nen tekst\nBILDE\n2\nOline Olsen
		//\n24-10-2019\n0\net bilde\nhttp://www.picture.com/oo.jpg\n
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

