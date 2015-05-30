package tienda;

public class Clientes {
	
	public String id_Cliente;
	public String nomCliente;
	public String apeCliente;
	
	public Clientes(String id_Cliente, String nomCliente, String apeCliente) {
		super();
		this.id_Cliente = id_Cliente;
		this.nomCliente = nomCliente;
		this.apeCliente = apeCliente;
	}
	public String getId_Cliente() {
		return id_Cliente;
	}
	public void setId_Cliente(String id_Cliente) {
		this.id_Cliente = id_Cliente;
	}
	public String getNomCliente() {
		return nomCliente;
	}
	public void setNomCliente(String nomCliente) {
		this.nomCliente = nomCliente;
	}
	public String getApeCliente() {
		return apeCliente;
	}
	public void setApeCliente(String apeCliente) {
		this.apeCliente = apeCliente;
	}

}
