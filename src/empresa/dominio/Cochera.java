package empresa.dominio;

import java.util.HashSet;

public class Cochera {
	
	private HashSet<Empleado> espaciosCochera = new HashSet<Empleado>();
	
	public Cochera() {
		this.espaciosCochera = new HashSet<Empleado>();
	}
}
