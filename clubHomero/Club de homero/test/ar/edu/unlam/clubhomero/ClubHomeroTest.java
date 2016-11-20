package ar.edu.unlam.clubhomero;

import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;

import junit.framework.Assert;

import org.junit.Test;

@SuppressWarnings("deprecation")
public class ClubHomeroTest{

	
	@Test
	public void crearBarDeHomeroConSoloUnHomero(){
		
		ClubHomero miClub = new ClubHomero();
		
		miClub.agregarCliente(new Cliente("Homero", 44));
		miClub.agregarCliente(new Cliente("Homero", 45));
		
		Assert.assertEquals(1, miClub.getClientesClub().size());
		
	}
	
	@Test
	public void obtenerClientesOrdenadosAlfabeticamente(){
		
		ClubHomero miClub = new ClubHomero();
		
		miClub.agregarCliente(new Cliente("n", 44));		
		miClub.agregarCliente(new Cliente("a", 44));
		miClub.agregarCliente(new Cliente("x", 45));		
		miClub.agregarCliente(new Cliente("b", 45));
		
		SortedSet<Cliente> misClientes = miClub.getClientesClub();
		
		Iterator<Cliente> clienteIT = misClientes.iterator();
		
		while(clienteIT.hasNext()){
			System.out.println(clienteIT.next().getNombre());
		}
		
	}	

	@Test
	public void losClienteSeComparanFueraDelBar(){
		
		
		Cliente homero = new Cliente("Homero", 44);
		Cliente homeroCopia = new Cliente("Homero", 44);
		Cliente lisa = new Cliente("Lisa", 8);		
		
		Assert.assertFalse(homero.compareTo(lisa) == 0);
		Assert.assertTrue(homero.compareTo(homeroCopia) == 0);
		
	}	
	
	@Test
	public void obtenerClientesOrdenadosPorEdad(){
		
		ClubHomero miClub = new ClubHomero();
		
		miClub.agregarCliente(new Cliente("Bart", 10));		
		miClub.agregarCliente(new Cliente("Homero", 44));				
		miClub.agregarCliente(new Cliente("Lisa", 8));				
		miClub.agregarCliente(new Cliente("Marge", 35));
		miClub.agregarCliente(new Cliente("Maggie", 0));
		
		List<Cliente> misClientes = miClub.mostrarClientesPorEdad();
		
		Iterator<Cliente> clienteIT = misClientes.iterator();
		
		while(clienteIT.hasNext()){
			System.out.println(clienteIT.next().getNombre());
		}
		
	}		
	
}
