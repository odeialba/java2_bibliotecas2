import java.util.*;
public class UtilArray {
	public static void main(String[] args) {
		int[] numeros = new int[12];

		numeros[0] = -2;
		numeros[1] = 6;
		numeros[2] = 5;
		numeros[3] = 4;
		numeros[4] = -6;
		numeros[5] = 20;
		numeros[6] = 3;
		numeros[7] = 0;
		numeros[8] = -10;
		numeros[9] = -12;
		numeros[10] = 19;

		Scanner sc = new Scanner(System.in);
		System.out.println("\n Introduce un numero para añadir al array: ");

		numeros[11] = sc.nextInt();

		Date fecha = new Date();
		System.out.println("\n Numeros sin ordenar: ");

		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + "\n");
		}

		Arrays.sort(numeros);

		System.out.println("\n Numeros ordenados: ");

		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + "\n");
		}
		System.out.println("");

		System.out.println("Programa ejecutado el dia: " + fecha.toString());
	}
	
}