package empresa.dominio;

import java.util.HashSet;

public class Empresa {
	private String nombre;
	private HashSet<Empleado> listaDeEmpleados = new HashSet<Empleado>();
	
	
	public Empresa() {
		
	}
	
	public Empresa(String nombre) {
		this.nombre = nombre;
		this.listaDeEmpleados = new HashSet<Empleado>();
	}

	public void agregarEmpleado(Empleado empleado) {
		listaDeEmpleados.add(empleado);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public HashSet<Empleado> getListaDeEmpleados() {
		return listaDeEmpleados;
	}

	public void setListaDeEmpleados(HashSet<Empleado> listaDeEmpleados) {
		this.listaDeEmpleados = listaDeEmpleados;
	}
	
	
}
