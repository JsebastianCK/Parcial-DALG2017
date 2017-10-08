package ejercicio1;

import utiles.TecladoIn;

public class Ejercicio1 {
	public static void main(String[] args){
		//ESTA PARTE ES INVENTADA PARA PROBAR LOS MODULOS
		int k;
		String[] pw = {"DW97OALS01EI" , "A77MHJ86AL54O" , "W23K100LPCXD"};
		
		System.out.print("Ingrese la cantidad de K-digitos: ");
		k = TecladoIn.readLineInt();
		encontrarContrasena(pw , k);
	}
	
	//DESDE ACA PUSE EN EL PARCIAL
	public static boolean esNumero(char a){
		boolean esNum = false;
		switch(a){
		case '0':	esNum = true; break;
		case '1':	esNum = true; break;
		case '2':	esNum = true; break;
		case '3':	esNum = true; break;
		case '4':	esNum = true; break;
		case '5':	esNum = true; break;
		case '6':	esNum = true; break;
		case '7':	esNum = true; break;
		case '8':	esNum = true; break;
		case '9':	esNum = true; break;
		}
		return esNum;
	}
	
	public static int contarNumeros(String a){
		int cantNum = 0;
		for(int i = 0; i < a.length(); i++){
			if(esNumero(a.charAt(i)))
				cantNum++;
		}
		return cantNum;
	}
	
	public static void encontrarContrasena(String[] arr , int k){
		for(int i = 0; i < arr.length; i++){
			if(contarNumeros(arr[i]) >= k)
				System.out.println(arr[i]);
		}
	}
	
}
