package Inmobiliaria;
public class Vivienda extends Inmueble {
	
	private static final double COMISION_VIVIENDA = 5.0/100.0;
	
	private int altura;
	private boolean balcon;
	private boolean exterior;
	

	public Vivienda(String codigo, String tipo, String direccion, String poblacion, int metros, int habitaciones,
			int plazaGaraje, double precio, int altura, boolean balcon, boolean exterior) {
		super(codigo, tipo, direccion, poblacion, metros, habitaciones, plazaGaraje, precio);
		
		this.altura = altura;
		this.balcon = balcon;
		this.exterior = exterior;
		
	}
	
	public void mostrarInmueble() {
		super.mostrarInmueble();
		//TODO--implementar
		
	}
	
	public double comision() {
		double comision = precio * COMISION_VIVIENDA;
		return comision;
	}
	

}
