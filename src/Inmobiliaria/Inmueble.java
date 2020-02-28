package Inmobiliaria;

public class Inmueble {
	
	protected static final double IVA = 10.0/100.0;
	
	protected String codigo;
	protected String tipo;
	protected String direccion;
	protected String poblacion;
	protected int metros;
	protected int habitaciones;
	protected int plazaGaraje;
	protected double precio;
	
	
	public Inmueble(String codigo, String tipo, String direccion, String poblacion, 
					int metros, int habitaciones, int plazaGaraje, double precio) {
		
		this.codigo = codigo;
		this.tipo = tipo;
		this.direccion = direccion;
		this.poblacion = poblacion;
		this.metros = metros;
		this.habitaciones = habitaciones;
		this.plazaGaraje = plazaGaraje;
		this.precio = precio;
		
	}
	
	public double calculaIva() {
		
		double iva = precio * 0.1;
		return iva;
		
	}

	public void mostrarInmueble() {
		System.out.println("Inmueble: ");
		System.out.println("\t-CODIGO: " + codigo);
		System.out.println("\t-TIPO: " + tipo);
		System.out.println("\t-DIRECCION: " + direccion);
		System.out.println("\t-POBLACION: " + poblacion);
		System.out.println("\t-SUPERFICIE: " + metros + "m2");
		System.out.println("\t-HABITACIONES: " + habitaciones);
		System.out.println("\t-PLAZA DE GARAJE : " + plazaGaraje);
		System.out.println("\t-PRECIO: " + precio);
	}
	
	public double precioFinal() {
		double precioFinal = precio + calculaIva();
		return precioFinal;
	}
	
	
	

}
