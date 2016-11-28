package ar.edu.unlam.clubhomero;

import java.util.Comparator;
import java.util.TreeSet;

public class ClubHomero{
	public TreeSet<Cliente> clientesClub;
	static final Comparator<Cliente> ordenadoPorEdad = new Comparator<Cliente>() {

															public int compare(Cliente cliente, Cliente otroCliente){																
																return cliente.getEdad().compareTo(otroCliente.getEdad());
															}
		
													   }; 
	
	//public List<Cliente> mostrarClientesPorEdad(){
	public TreeSet<Cliente> mostrarClientesPorEdad(){		
		/*
		List<Cliente> clienteOrdenadoEdad = new ArrayList<Cliente>(this.clientesClub);
		
		Collections.sort(clienteOrdenadoEdad, ordenadoPorEdad);
		
		return clienteOrdenadoEdad;
		*/
		TreeSet<Cliente> clientesOrdenados = new TreeSet<Cliente>(ordenadoPorEdad);
		
		if(clientesOrdenados.addAll(this.clientesClub))
			return clientesOrdenados;
		else
			return new TreeSet<Cliente>();
	}													   
													   
	public ClubHomero(){
		this.clientesClub = new TreeSet<Cliente>();
	}
	
	public Boolean agregarCliente(Cliente cliente){
		return this.clientesClub.add(cliente);
	}
	
	public TreeSet<Cliente> getClientesClub() {
		return clientesClub;
	}	

}
