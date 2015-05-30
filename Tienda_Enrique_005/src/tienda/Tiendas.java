package tienda;

public class Tiendas {
	
	public String id_Tienda;
	public String nomTienda;
	public String direccion;
	
	public Tiendas(String id_Tienda, String nomTienda, String direccion) {
		super();
		this.id_Tienda = id_Tienda;
		this.nomTienda = nomTienda;
		this.direccion = direccion;
	}
	public String getId_Tienda() {
		return id_Tienda;
	}
	public void setId_Tienda(String id_Tienda) {
		this.id_Tienda = id_Tienda;
	}
	public String getNomTienda() {
		return nomTienda;
	}
	public void setNomTienda(String nomTienda) {
		this.nomTienda = nomTienda;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
