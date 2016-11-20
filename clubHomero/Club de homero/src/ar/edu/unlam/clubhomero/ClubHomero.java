package ar.edu.unlam.clubhomero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class ClubHomero{
	public TreeSet<Cliente> clientesClub;
	static final Comparator<Cliente> ordenadoPorEdad = new Comparator<Cliente>() {

															public int compare(Cliente cliente, Cliente otroCliente){																
																return cliente.getEdad().compareTo(otroCliente.getEdad());
															}
		
													   }; 
	
	public ClubHomero(){
		this.clientesClub = new TreeSet<Cliente>();
	}
	
	public Boolean agregarCliente(Cliente cliente){
		return this.clientesClub.add(cliente);
	}
	
	public List<Cliente> mostrarClientesPorEdad(){
		
		List<Cliente> clienteOrdenadoEdad = new ArrayList<Cliente>(this.clientesClub);
		
		Collections.sort(clienteOrdenadoEdad, ordenadoPorEdad);
		
		return clienteOrdenadoEdad;
	}
	
	public TreeSet<Cliente> getClientesClub() {
		return clientesClub;
	}	

}
