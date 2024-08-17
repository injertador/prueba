package p540;
import java.util.Scanner;
public class Solucion {

	//Teclado
	public static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		int casos;
		String respuesta;
		String[] edificio;
		int[] escaleras;
		int bajadas;
		int subidas;
		
		//Solicitamos el numero de casos
		casos=teclado.nextInt();
		teclado.nextLine();
		
		//Bucle con el numero de casos
		for(int i=0;i<casos;i++) {
			
			//Solicitamos los datos de las escaleras
			respuesta=teclado.nextLine();
			
			//Separamos la respuesta por espacios
			edificio=respuesta.split(" ");
			
			//Inicializamos el array de int
			escaleras=new int[edificio.length];
			
			//Convertimos el array de String en array de int
			for(int x=0;x<edificio.length;x++) {
				escaleras[x]=Integer.parseInt(edificio[x]);
			}
			
			//Calculadmos las escaleras bajadas
			bajadas=(escaleras[1]*escaleras[2])+escaleras[3];
			
			//Calculadmos las escaleras subidas
			subidas=(escaleras[0]*escaleras[1])+bajadas;
			
			//resultado
			System.out.println(bajadas+" "+subidas);		
		}
	}
}
