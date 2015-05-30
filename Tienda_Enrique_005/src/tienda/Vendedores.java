package tienda;

public class Vendedores {
	
	public String id_Vendedor;
	public String nomVendedor;
	public String apeVendedor;
	
	public Vendedores(String id_Vendedor, String nomVendedor, String apeVendedor) {
		super();
		this.id_Vendedor = id_Vendedor;
		this.nomVendedor = nomVendedor;
		this.apeVendedor = apeVendedor;
	}
	public String getId_Vendedor() {
		return id_Vendedor;
	}
	public void setId_Vendedor(String id_Vendedor) {
		this.id_Vendedor = id_Vendedor;
	}
	public String getNomVendedor() {
		return nomVendedor;
	}
	public void setNomVendedor(String nomVendedor) {
		this.nomVendedor = nomVendedor;
	}
	public String getApeVendedor() {
		return apeVendedor;
	}
	public void setApeVendedor(String apeVendedor) {
		this.apeVendedor = apeVendedor;
	}

}
