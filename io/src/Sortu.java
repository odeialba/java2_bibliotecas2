import java.util.*;
import java.io.*;

public class Sortu {
	public static void main(String[] arglist) throws IOException {
	//public static void main(String[] args) {
		String izena;
		String ruta;

		Scanner sc = new Scanner(System.in);
		System.out.println("Sartu fitxategia sortuko den ruta: \n");
		ruta = sc.next();
		System.out.println("\nSartu sortuko den fitxategiaren izena \n");
		izena = sc.next();

		try {

		File sortu = new File(ruta, izena);

		if (sortu.createNewFile()) {
			System.out.println("Fitxategia ongi sortu da.");
		}else {
			System.out.println("Fitxategia ez da ongi sortu.");
		}
	} catch (IOException ioe) {
		ioe.printStackTrace();
	}

	}
	
}