package p373;
import java.util.Scanner;
public class Solucion {
	
	//teclado
	public static Scanner teclado = new Scanner (System.in);

	public static long cubos(long cara_externa) {
		
		//variable
		long cara_interna;
		
		//Obtenemos los cubos internos
		cara_interna=cara_externa-2;
		
		long prueba=(cara_externa*cara_externa*cara_externa)-(cara_interna*cara_interna*cara_interna);
		return(prueba);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables
		int intentos;
		
		//obtenemos los intentos
		intentos=teclado.nextInt();
		
		for (int i = 0; i < intentos; i++) {
            long N = teclado.nextLong();
            long visibles = cubos(N);
            System.out.println(visibles);
        }
		
	}

}
