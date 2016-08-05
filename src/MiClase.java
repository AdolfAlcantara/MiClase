import java.util.Scanner;

public class MiClase {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		
		int numero = leer.nextInt();
		
		if(numero>18){
			System.out.println("El numero mayor que 18");
		}else{
			System.out.println("El numero menor que 18");
		}
		
	}

}
