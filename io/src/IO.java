import java.io.*;
import java.util.*;
public class IO {
	public static void main(String[] args) {
		String nombre;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nIntroduce un nombre para la carpeta: ");
		nombre = sc.next();
		File carpeta = new File(nombre);
		if (carpeta.mkdir()){
		  System.out.println("Se ha creado la carpeta.");
		}else{
		  System.out.println("No se ha podido crear la carpeta. Puede que ya exista.");
		}
	}
}
