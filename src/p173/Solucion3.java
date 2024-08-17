package p173;
import java.util.Scanner;
public class Solucion3 {

	//teclado
	public static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables
		char[] respuesta;
		
		//bucle infinito
		while(true) {
			
			//variables
			respuesta=teclado.next().toCharArray();
			int puntosA=0;
			int puntosB=0;
			char saque='A';
			boolean imprimir=true;
			boolean espacio=false;
			
			//Si el primer digito es F se rompe el bucle
			if(respuesta[0]=='F') {
				break;
			}
			
			//Se crea un bucle para revisar los caracteres uno a uno
			for(int i=0;i<respuesta.length;i++) {
				
				 if (respuesta[i] == 'F' && imprimir) {
	                    if (espacio) System.out.print(" ");
	                    System.out.print(puntosA + "-" + puntosB);
	                    break;
	                } else imprimir = true;
				
				//Comprobamos si el valor es A
				if(respuesta[i]=='A') {
					
					//Comprobamos que el anterior punto lo ganara A
					if(saque=='A') {
						puntosA++;
					} else {
						saque='A';
					}
				} else {
					//Comprobamos que el anterior punto lo ganara A
					if(saque=='B') {
						puntosB++;
					} else {
						saque='B';
					}
				}
				
				if ((puntosA > 8 || puntosB > 8) && (Math.abs(puntosA - puntosB) > 1) ) {
                    if (espacio) System.out.print(" ");
                    System.out.print(puntosA + "-" + puntosB);
                    puntosA = puntosB = 0;
                    espacio = true; imprimir = false;
            }
			}
			
			System.out.println();
			
		}
		
	}

}
