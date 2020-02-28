package Inmobiliaria;

public class Chalet extends Inmueble {
	
	private static final double COMISION_CHALET = 10.0/100.0;
	private static final double PLUS_PISCINA = 1000;
	private static final double PLUS_PAELLERO = 500;
	
	private int parcela;
	private boolean piscina;
	private boolean paellero;

	public Chalet(String codigo, String tipo, String direccion, String poblacion, int metros, int habitaciones,
			int plazaGaraje, double precio, int parcela, boolean piscina, boolean paellero) {
		super(codigo, tipo, direccion, poblacion, metros, habitaciones, plazaGaraje, precio);
		 
		this.parcela = parcela;
		this.piscina = piscina;
		this.paellero = paellero;
	}
	
	public void mostrarInmueble() {
		super.mostrarInmueble();
		System.out.println("\t-TIPO: CHALET ");
		System.out.println("\t-SUPERFICIE PARCELA: " + parcela + "m2");
		System.out.println("\t-PISCINA: " + piscina);
		System.out.println("\t-PAELLERO: " + paellero);
		
		
	}
	
	public double comision() {
		double comision = precio * COMISION_CHALET;
		
		if (piscina) {
			comision += PLUS_PISCINA;
		}
		
		if (paellero) {
			comision += PLUS_PAELLERO;
		}
		
		return comision;
		
	}
 

}
