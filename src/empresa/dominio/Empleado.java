package empresa.dominio;

public class Empleado {
	private String nombre;
	private String apellido;
	protected Double salario;
	private Integer fechaDeNacimiento;
	
	public Empleado() {
		
	}
	
	public Empleado(String nombre, String apellido, Double salario, Integer fechaDeNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
}
