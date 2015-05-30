package tienda;

public class Productos {
	
	public String id_Producto;
	public String nomProducto;
	public int precioProducto;
	
	public Productos(String id_Producto, String nomProducto, int precioProducto) {
		super();
		this.id_Producto = id_Producto;
		this.nomProducto = nomProducto;
		this.precioProducto = precioProducto;
	}

	public String getId_Producto() {
		return id_Producto;
	}

	public void setId_Producto(String id_Producto) {
		this.id_Producto = id_Producto;
	}

	public String getNomProducto() {
		return nomProducto;
	}

	public void setNomProducto(String nomProducto) {
		this.nomProducto = nomProducto;
	}

	public int getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(int precioProducto) {
		this.precioProducto = precioProducto;
	}

}
