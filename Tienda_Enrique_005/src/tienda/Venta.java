package tienda;

public class Venta {
	
	public String fecha_hora;
	public int numVenta;
	
	public Venta(String fecha_hora, int numVenta) {
		super();
		this.fecha_hora = fecha_hora;
		this.numVenta = numVenta;
	}
	public String getFecha_hora() {
		return fecha_hora;
	}
	public void setFecha_hora(String fecha_hora) {
		this.fecha_hora = fecha_hora;
	}
	public int getNumVenta() {
		return numVenta;
	}
	public void setNumVenta(int numVenta) {
		this.numVenta = numVenta;
	}

}
