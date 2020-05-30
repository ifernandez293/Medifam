package testOne;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import capaNegocio.Login;

public class TestOne 
{	
	@Test
	public void test() 
	{
		// Variables del login esperadas
		
		String nombre="Francisco", apellidos="Sanchez Fernandez", password = "1234AAA";
		
		boolean ok = false;
				
		// Creación de los objetos
		
		Login login = new Login(nombre, apellidos);
		
		// Consulta realizada
		
		assertEquals(nombre, login.getNombre());
		assertEquals(apellidos, login.getApellidos());
		assertEquals(password, login.getPassword(nombre, apellidos));
		
		
		// Resultados
		
		if( nombre.equals(login.getNombre()) )
			if( apellidos.equals(login.getApellidos()) ) 
				if( password.equals(login.getPassword(nombre, apellidos)) ) 
					ok = true;
		
		if( ok == true )
			System.out.println("\nComprobacion correcta");
		
		//fail("Not yet implemented");
	}

}
