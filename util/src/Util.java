import java.util.*;

public class Util {
	public static void main(String args[]) {

		//String algo;
		int ran;
		//Scanner sc = new Scanner(System.in);
		//System.out.print("\nIntroduce algo: ");
		//algo = sc.next();
		Random r = new Random();
		Date gaur = new Date();
		ran = r.nextInt();

		System.out.print("\nHoy " + gaur + " te ha tocado: " + ran + "\n");

	}
}
