package org.comIT.proyecto.entities;



public class Ingreso{
	
	private int fecha;
	private float monto;
	private String detalles;
	private String categoria;

	public Ingreso(int fecha, float monto, String detalles, String categoria){
		this.fecha=fecha;
		this.monto=monto;
		this.detalles=detalles;
		this.categoria=categoria;
		
		
}


	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	public String getDetalles() {
		return detalles;
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}
	
	
	


