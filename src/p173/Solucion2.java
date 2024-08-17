package p173;

import java.util.Scanner;
public class Solucion2 {

	//teclado
	public static Scanner teclado = new Scanner(System.in);
	
	//Set
	public static void Set(String respuesta) {
		
		//variables
		int a=0;
		int b=0;
		char[] puntos;
		char turno='A';
		int contador=0;
		int puntosA=0;
		int puntosB=0;
		
		//Dividimos el resultado en puntos
		puntos=respuesta.toCharArray();
		
		//while que va mirando los valores y si es F se para el bucle
		while (puntos[contador]!=('F')){
			if(puntos[contador]==('A')) {
				if(turno=='A') {
					a++;
					if (a>=9) {
						if(a-b>1) {
							puntosA++;
							if(puntosA==3) {
								System.out.println(a+"-"+b);
								break;
							} else {
								System.out.print(a+"-"+b+" ");
							}
							a=0;
							b=0;
						}
					}
				} else {
					turno='A';
				}
			} else {
				if(turno=='B') {
					b++;
					if (b>8) {
						if(b-a>1) {
							puntosB++;
							if(puntosB==3) {
								System.out.println(a+"-"+b);
								break;
							} else {
								System.out.print(a+"-"+b+" ");
							}
							a=0;
							b=0;
						}
					}
				} else {
					turno='B';
				}
			}
			contador++;
		}
		
		//Imprimir resultado
		if(puntosA!=3 && puntosB!=3) {
			System.out.println(a+"-"+b);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variable
		String respuesta;
		char[] parche;
			
		//Solicitamos el resultado
		respuesta = teclado.next();
		
		parche=respuesta.toCharArray();
		
		while(parche[0]!='F') {
			Set(respuesta);
			respuesta = teclado.next();
			parche=respuesta.toCharArray();
		}
		System.out.println();
	}
}