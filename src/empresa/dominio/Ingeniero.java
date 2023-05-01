package empresa.dominio;

public class Ingeniero extends Empleado {
	private final Double PARA_LA_PRODUCTIVIDAD = 0.05;
	
	
	public Ingeniero() {
		super();
		
	}

	public Ingeniero(String nombre, String apellido, Double salario, Integer fechaDeNacimiento) {
		super(nombre, apellido, salario, fechaDeNacimiento);
		
	}
	
	
	public Double comisionPorProductividad() {
		return this.salario + (this.salario * PARA_LA_PRODUCTIVIDAD);
	}
}
