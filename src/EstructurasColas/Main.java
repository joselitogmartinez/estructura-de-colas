package EstructurasColas;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayBasedQueue array = new ArrayBasedQueue(10);
		
		LinkedListBasedQueue Lista = new LinkedListBasedQueue();
		String Dato;
		int opcion = 0;
		int opcion1 = 0;
		Scanner entrada = new Scanner(System.in);
		
		while(opcion!=3) {

			System.out.println("Estructuras de Colas");
			System.out.println("1. Basada en Arrays");
			System.out.println("2. Basada en Listas");
			System.out.println("3. Salir");
			
			opcion = entrada.nextInt();
			entrada.nextLine();
			System.out.println(" ");
			
			switch(opcion) {
			case 1:{

				while(opcion1!=5) {
					System.out.println("Colas basadas en Arrays");
					System.out.println("1. Encolar");
					System.out.println("2. Desencolar");
					System.out.println("3. Cima");
					System.out.println("4. Tamano");
					System.out.println("5. Regresar");	
					
					opcion1 = entrada.nextInt();
					entrada.nextLine();
					System.out.println(" ");
					
					switch(opcion1) {
					case 1:{
						System.out.println("Escriba el dato que desea encolar: ");
						Dato = entrada.nextLine();
						array.enqueue(Dato);
						System.out.println(" ");
						break;
					}
					case 2:{
						System.out.println("Escriba el dato que desea desencolar: ");
						System.out.println(array.dequeue());
						System.out.println(" ");
						break;
					}
					case 3:{
						System.out.println("La cima es: ");
						System.out.println(array.peek());
						System.out.println(" ");
						break;
					}
					case 4:{
						System.out.println("El tamano es: ");
						System.out.println((array.size() +1)+ " datos");
						System.out.println(" ");
						break;
					}
					case 5:{
						System.out.println("Saliendo");
						System.out.println(" ");
						break;
					}
					default:
						System.out.println("Error");
						System.out.println(" ");
					}
				break;
			}
				}
			
			case 2:{
				while(opcion1!=5) {
					System.out.println("Colas basadas en Listas ");
					System.out.println("1. Encolar");
					System.out.println("2. Desencolar");
					System.out.println("3. Cima");
					System.out.println("4. Tamano");
					System.out.println("5. Regresar");
					opcion1 = entrada.nextInt();
					entrada.nextLine();
					System.out.println(" ");
					
					switch(opcion1) {
					case 1:{
						System.out.println("Escriba el dato que desea encolar: ");
						Dato = entrada.nextLine();
						Lista.enqueue(Dato);
						System.out.println(" ");
						break;
					}
					case 2:{
						System.out.println("Se ha desencolado un dato");
						System.out.println(Lista.dequeue());
						System.out.println(" ");
						break;
					}
					case 3:{
						System.out.println("La cima es: ");
						System.out.println(Lista.peek());
						System.out.println(" ");
						break;
					}
					case 4:{
						System.out.println("El tamano es: ");
						System.out.println((Lista.size() + 1) + " datos");
						System.out.println(" ");
						break;
					}
					case 5:{
						System.out.println("Saliendo");
						System.out.println(" ");
						break;
					}
					default:
						System.out.println("Error");
						System.out.println(" ");
					}
				}
			}
			
			case 3:{
				System.out.println("Salir");
				break;
			}
			default:
				System.out.println("Error");
				System.out.println(" ");
			}
		}
	}
}
