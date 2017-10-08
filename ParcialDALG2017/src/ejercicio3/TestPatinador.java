package ejercicio3;

import utiles.TecladoIn;

public class TestPatinador {
	public static void main(String[] args){
		int cantPatinadores , opcion;
		char cat;
		
		System.out.print("Cuantos patinadores hay?: ");
		cantPatinadores = TecladoIn.readLineInt();
		Patinador[] patinadores = new Patinador[cantPatinadores];
		
		do{
			menu();
			opcion = TecladoIn.readLineInt();
			
			switch(opcion){
			case 1:	for(int i = 0; i < patinadores.length; i++){
						patinadores[i] = cargarPatinador();
						System.out.println("---------");
					}
					break;
					
			case 2:	System.out.println("Ingrese la categoria a buscar");
					cat = TecladoIn.readLineNonwhiteChar();
					mostrarPatinador(patinadores , cat);
					break;
					
			case 3:	mostrarMenor(patinadores);
					break;
					
			case 0:	System.out.println("Saliendo...");
					break;
					
			default: System.out.println("Esa no es una opcion");
			}
			
		}while(opcion != 0);
	}
	
	public static void menu(){
		System.out.println("1. Cargar datos de los patinadores.");
		System.out.println("2. Mostrar patinadores segun la categoria.");
		System.out.println("3. Mostrar el patinador de menor edad.");
		System.out.println("0. Salir");
		System.out.print("Elija una opcion: ");
	}
	
	public static Patinador cargarPatinador(){
		String nombre , apellido , dni;
		int edad;
		char categoria;
		
		System.out.print("Apellido: ");
		apellido = TecladoIn.readLine();
		System.out.print("Nombre: ");
		nombre = TecladoIn.readLine();
		System.out.print("DNI: ");
		dni = TecladoIn.readLine();
		System.out.print("Edad: ");
		edad = TecladoIn.readLineInt();
		do{
			System.out.print("Categoria: ");
			categoria = TecladoIn.readLineNonwhiteChar();
		}while(!catValida(categoria));
		return new Patinador(apellido , nombre , dni , edad , categoria);
	}
	
	public static boolean catValida(char c){
		boolean valido = false;
		switch(c){
		case 'P':	valido = true; break;
		case 'I':	valido = true; break;
		case 'C':	valido = true; break;
		case 'B':	valido = true; break;
		case 'A':	valido = true; break;
		}
		return valido;
	}
	
	public static void mostrarPatinador(Patinador[] p , char c){
		for(int i = 0; i < p.length; i++){
			if(p[i].getCategoria() == c)
				System.out.println(p[i].toString());
		}
	}
	
	public static void mostrarMenor(Patinador[] p){
		int pos, edadMin;
		
		edadMin = p[0].getEdad();
		pos = 0;
		
		for(int i = 0; i < p.length; i++){
			if(p[i].getEdad() < edadMin){
				edadMin = p[i].getEdad();
				pos = i;
			}
		}
		
		System.out.println(p[pos].toString());
	}
	
}