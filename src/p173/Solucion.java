package p173;
import java.util.Scanner;
public class Solucion {

	//teclado
	public static Scanner teclado = new Scanner(System.in);
	
	//Set
	public static void Set(String respuesta) {
		
		//variables
		int a=0;
		int b=0;
		String[] puntos;
		String turno="A";
		int contador=0;
		
		//Dividimos el resultado en puntos
		puntos=respuesta.split("");
		
		//while que va mirando los valores y si es F se para el bucle
		while (!puntos[contador].equals("F")){
			if(puntos[contador].equals("A")) {
				if(puntos[contador].equals(turno)) {
					a++;
					if (a==11) {
						System.out.print(a+"-"+b+" ");
						a=0;
						b=0;
					}
				} else {
					turno="A";
				}
			} else {
				if(puntos[contador].equals(turno)) {
					b++;
					if (b==11) {
						System.out.print(a+"-"+b+" ");
						a=0;
						b=0;
					}
				} else {
					turno="B";
				}
			}
			contador++;
		}
		
		//Imprimir resultado
		System.out.println(a+"-"+b);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variable
		String respuesta;
			
		//Solicitamos el resultado
		respuesta = teclado.next();
		
		while(!respuesta.equals("F")) {
			Set(respuesta);
			respuesta = teclado.next();
		}
		
		
		
	}

}
