import java.io.*;
import java.util.*;

public class Ficheros  {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		String zer;
		String ruta;
		String izena;
		String testua = "";
		String salida;

		System.out.println("Zer egin nahi duzu?");
		System.out.println("Sortu (C), Idatzi (E), Irakurri (L), Atera (S)");
		zer = sc.next();
		while (!zer.equalsIgnoreCase("s")) {

			if (zer.equalsIgnoreCase("c")) {
				System.out.println("Sartu fitxategia sortuko den ruta: \n");
				ruta = sc.next();
				System.out.println("\nSartu sortuko den fitxategiaren izena: \n");
				izena = sc.next();
				
				try {
					File sortu = new File(ruta, izena);
					if (sortu.createNewFile()) {
						System.out.println("Fitxategia ongi sortu da.");
					} else {
						System.out.println("Fitxategia ez da ongi sortu.");
					}
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}

			} else if (zer.equalsIgnoreCase("e")) {
				System.out.println("Sartu idatziko den fitxategiaren ruta: \n");
				ruta = sc.next();
				System.out.println("\nSartu idatziko den fitxategiaren izena: \n");
				izena = sc.next();
				System.out.println("\nSartu gehitu nahi duzun testua: \n");
				testua = sc.next();

				try {
					PrintWriter pw = null;	
					pw = new PrintWriter(ruta + "/" + izena);
					while (!testua.equalsIgnoreCase("FIN")) {
						pw.println(testua);
               			testua = sc.nextLine();
           			}
					pw.flush();
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}

			} else if (zer.equalsIgnoreCase("l")) {
				System.out.println("Sartu irakurriko den fitxategiaren ruta: \n");
				ruta = sc.next();
				System.out.println("\nSartu irakurriko den fitxategiaren izena: \n");
				izena = sc.next();

				File archivo = new File(ruta + "/" + izena);
				FileReader leer = new FileReader (archivo);
				BufferedReader bf = new BufferedReader(leer);
				while ((salida = bf.readLine())!=null) {
   					System.out.println("\n" + salida);
   				}

			} else {
				System.out.println("Aukera okerra aukeratu duzu.");
			}

			System.out.println("Zer egin nahi duzu?");
			System.out.println("Sortu (C), Idatzi (E), Irakurri (L), Atera (S)");
			zer = sc.next();

		}
		System.out.println("Atera aukeratu duzu.");
	}
}