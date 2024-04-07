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
		this.marca_id = 0;
		this.unidades = 0;
		this.medida_id = 0;
		this.cantidad = 0;		
	}

	public Producto(
			Long id, 
			Long barcode, 
			String denominacion, 
			int marca, 
			int unidades, 
			int medida, 
			double cantidad
		) {
		this.id = id;
		this.barcode = barcode;
		this.denominacion = denominacion;
		this.marca_id = marca;
		this.unidades = unidades;
		this.medida_id = medida;
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

	public int getMarca_id() {
		return marca_id;
	}

	public int getUnidades() {
		return unidades;
	}

	public int getMedida_id() {
		return medida_id;
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

	public void setMarca_id(int marca_id) {
		this.marca_id = marca_id;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public void setMedida_id(int medida_id) {
		this.medida_id = medida_id;
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
