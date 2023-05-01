package empresa.tes;

import static org.junit.Assert.*;

import org.junit.Test;

import empresa.dominio.Director;
import empresa.dominio.Empleado;
import empresa.dominio.Empresa;
import empresa.dominio.Gerente;
import empresa.dominio.Ingeniero;

public class TestEmpresa {

	@Test
	public void queSeCreeUnaEmpresa() {
		Empresa empresa = new Empresa();
		assertNotNull(empresa);
	}
	
	@Test
	public void queSeCreeUnEmpleado() {
		Empleado empleado = new Empleado();
		assertNotNull(empleado);
	}
	
	@Test
	public void queSeCreeUnGerente() {
		Empleado gerente = new Gerente();
		assertNotNull(gerente);
	}
	
	@Test
	public void queSeCreeUnDirector() {
		Empleado director = new Director();
		assertNotNull(director);
	}
	
	@Test
	public void queSeCreeUnIngeniero() {
		Empleado ingeniero = new Ingeniero();
		assertNotNull(ingeniero);
	}

	@Test
	public void queSeCreeUnEmpleadoSeAgregeALaEmpresa() {
		Empleado empleado = new Empleado();
		Empresa empresa = new Empresa();
		
		empresa.agregarEmpleado(empleado);
		
		assertEquals(empresa.getListaDeEmpleados().size(), 1);
	}
	
	@Test
	public void queSeApliqueElAdicionalAlIngeniero() {
		Ingeniero ingeniero = new Ingeniero("Hernan", "Ruiz", 200.0, 1902);
		assertEquals(ingeniero.comisionPorProductividad(), (Double) 210.0);
		
	}
}
