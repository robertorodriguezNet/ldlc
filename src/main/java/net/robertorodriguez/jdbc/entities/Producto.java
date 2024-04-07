package net.robertorodriguez.jdbc.entities;

public class Producto {
	
	private Long id;
	private Long barcode;
	private String denominacion;
	private Marca marca;
	private int unidades;
	private Medida medida;
	private double cantidad;
	
	public Producto() {
		this.id = 0L;
		this.barcode = 0L;
		this.denominacion = "";
		this.marca = null;
		this.unidades = 0;
		this.medida = null;
		this.cantidad = 0;		
	}

	public Producto(
			Long id, 
			Long barcode, 
			String denominacion, 
			Marca marca, 
			int unidades, 
			Medida medida, 
			double cantidad
		) {
		this.id = id;
		this.barcode = barcode;
		this.denominacion = denominacion;
		this.marca = marca;
		this.unidades = unidades;
		this.medida = medida;
		this.cantidad = cantidad;
	}

	public Long getId() {
		return id;
	}

	public Long getBarcode() {
		return barcode;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public String getMarca() {
		return marca.getName();
	}

	public int getUnidades() {
		return unidades;
	}

	public String getMedida() {
		return medida.getAbbreviation();
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setBarcode(Long barcode) {
		this.barcode = barcode;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public String toString() {
		
		return String.format("%14s", barcode)
				+ " "
				+ String.format("%-60s", denominacion);
		
	}

}
