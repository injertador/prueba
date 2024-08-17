package p635;
import java.util.Scanner;
public class Solucion {
	
	//teclado
	public static Scanner teclado = new Scanner (System.in);
	
	//Funcion para convertir el año en siglo
	public static int siglo() {
		
		//variable
		int año;
		
		//if para comprobar si el año acaba en 00
		año=teclado.nextInt();
		if(año%100==0) {
			return año/100;
		} else {
			return (año/100)+1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variable
		int usos;
		
		//Solicitud de informacion
		usos=teclado.nextInt();
		
		//Bucle para la conversion de año a siglo
		for(int i=0;i<usos;i++){
			System.out.println(siglo());
		}
	}

}
