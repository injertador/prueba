package p621;
import java.util.Scanner;
public class Solucion {

	//teclado
	public static Scanner teclado = new Scanner (System.in);
	
	public static int pagina() {
		
		//Variable
		int hoja;
		
		//Solicitamos la hoja
		hoja = teclado.nextInt();
		
		//Comprobamos si la hoja es par o impar
		if(hoja%2==0) {
			return hoja+1;
		} else {
			return hoja-1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables
		int intentos;
		
		//Solicitamos informacion
		intentos = teclado.nextInt();
		
		//Bucle para realizar los intentos solicitados
		for(int i=0;i<intentos;i++) {
			System.out.println(pagina());
		}
	}

}
