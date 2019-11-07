package no.hvl.dat100.jplab12.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab12.oppgave3.*;

public class SkrivBlogg {

	private static String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/jplab12/tests/";

	//public static boolean skriv(Blogg samling, String filnavn) {
	public static boolean skriv(String filnavn) {

		PrintWriter skriver = null;

		String text = "Fuck yeah!";
		String message = "Skriving av fil lyktes.";
		//String text = samling.toString();
		
		boolean success = false;

		try {

			skriver = new PrintWriter(MAPPE + filnavn + ".txt");
			skriver.println(text);
			success = true;
			
		} catch (FileNotFoundException e) {

			message = "Skriving av fil mislyktes. Faen.";
			System.out.println(MAPPE + filnavn + ".txt");
			
		} finally {

			if (skriver != null) skriver.close();
			System.out.println(message);

		}
		return success;
	}
	
	//for testing
	public static void main(String[] args) {
		boolean test = skriv("test");
		System.out.println(test);
	}
}
