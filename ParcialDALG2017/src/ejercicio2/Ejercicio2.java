package ejercicio2;

public class Ejercicio2 {
	public static void main(String[] args){
		//ESTA PARTE ES INVENTADA PARA PROBAR EL MODULO
		
		int[][] m = {{1 , 2 , 3},
					 {0 , 1 , 2},
					 {0 , 0 , 1}};
		
		System.out.println(triangularSuperior(m));
	}
	
	//ESTO PUSE EN EL PARCIAL
	public static boolean triangularSuperior(int[][] a){
		boolean triangularSuperior = true;
		int posFila, posCol;
		
		posFila = 0;
		posCol = 0;
		
		if(a.length == a[0].length){
			while(triangularSuperior && posFila < a.length){
				while(triangularSuperior && posCol < a[0].length){
					if(posFila > posCol && a[posFila][posCol] != 0)
						triangularSuperior = false;
					posCol++;
				}
				posFila++;
				posCol = 0;
			}
		}else{
			triangularSuperior = false;
		}
		
		return triangularSuperior;
	}
	
}