package ejercicio3;

public class Patinador {
	
	//ATRIBUTOS
	private String apellido , nombre , dni;
	private int edad;
	private char categoria;
	
	//CONSTRUCTORES
	public Patinador(){
		apellido = "";
		nombre = "";
		dni = "";
		edad = 0;
		categoria = ' ';
	}
	
	public Patinador(String ape, String nom , String doc, int ed, char cat){
		apellido = ape;
		nombre = nom;
		dni = doc;
		edad = ed;
		categoria = cat;
	}
	
	//OBSERVADORES
	public String getApellido(){
		return apellido;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public String getDoc(){
		return dni;
	}
	
	public int getEdad(){
		return edad;
	}
	
	public char getCategoria(){
		return categoria;
	}
	
	public String toString(){
		return "Apellido: " + apellido +
				"\nNombre: " + nombre + 
				"\nDNI: " + dni + 
				"\nEdad: " + edad +
				"\nCategoria: " + categoria;
	}
	
	//MODIFICADORES	
	public void setApellido(String ape){
		apellido = ape;
	}
	
	public void setNombre(String nom){
		nombre = nom;
	}
	
	public void setDoc(String doc){
		dni = doc;
	}
	
	public void setEdad(int ed){
		edad = ed;
	}
	
	public void setCategoria(char cat){
		categoria = cat;
	}
	
	//METODOS PROPIOS DEL TIPO
	public void asciendeCategoria(){
		switch(this.getCategoria()){
		case 'P':	this.setCategoria('I'); break;
		case 'I':	this.setCategoria('B'); break;
		case 'B':	this.setCategoria('C'); break;
		case 'C':	this.setCategoria('A'); break;
		case 'A':	System.out.println("Este patinador ya no puede ascender mas.");
		}
	}
	
	public boolean equals(Patinador p){
		return (p.getNombre().equals(nombre) &&
				p.getApellido().equals(apellido) &&
				p.getDoc().equals(dni) &&
				p.getEdad() == edad &&
				p.getCategoria() == categoria);
	}
	
}