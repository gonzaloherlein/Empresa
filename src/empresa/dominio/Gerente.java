package empresa.dominio;

public class Gerente extends Empleado {
	private Cochera cochera;
	
	public Gerente() {
		
	}
	
	public Gerente(String nombre, String apellido, Double salario, Integer fechaDeNacimiento,Cochera cochera) {
		super(nombre,apellido,salario,fechaDeNacimiento);
		this.cochera = cochera;
	}
}
