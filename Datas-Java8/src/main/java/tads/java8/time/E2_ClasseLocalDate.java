package tads.java8.time;

import java.time.LocalDate;

public class E2_ClasseLocalDate {
	
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println("Data Atual: " + hoje); //formato ISO-8601
		
		LocalDate emissaoRG = LocalDate.of(2000, 1, 15);
		System.out.println("Emissão do RG: " + emissaoRG);
	}

}
