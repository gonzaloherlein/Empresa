package empresa.dominio;

public class Director extends Empleado {
	private Cochera cochera;
	private Double sueldoExtra;
	
	public Director() {
		
	}

	public Director(String nombre, String apellido, Double salario, Integer fechaDeNacimiento,Cochera cochera,Double sueldoExtra) {
		super(nombre, apellido, salario, fechaDeNacimiento);
		this.cochera = cochera;
		this.sueldoExtra = sueldoExtra;
	}
	
	
}
