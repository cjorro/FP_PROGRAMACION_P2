package Inmobiliaria;

public class Inmobiliaria {
	
	public static void main(String[] args) {
		Chalet	chalet1 = new Chalet("464758", "Chalet", "Calle paraiso", "Madrid", 367, 17, 6, 6000000.00, 987, true, true);
		Chalet	chalet2 = new Chalet("464778", "Chalet", "Calle iso", "Madrid", 67, 1, 0, 6000.00, 187, false, true);
		Vivienda vivienda1 = new Vivienda("5678493", "Vivienda", "Paseo de las delicias", "Riaza", 200, 4, 2, 87655.00, 4, true, false);
		Vivienda vivienda2 = new Vivienda("5673293", "Vivienda", "Paseo gran via", "Riaza", 300, 4, 3, 287655.00, 6, true, true);
		
		System.out.println("DATOS:");
		chalet1.mostrarInmueble();
		chalet2.mostrarInmueble();
		vivienda1.mostrarInmueble();
		vivienda2.mostrarInmueble();
		
		System.out.println("PRECIO FINAL (en euros)");
		System.out.println("\t-CHALET1: " + chalet1.precioFinal());
		System.out.println("\t-CHALET2: " + chalet2.precioFinal());
		System.out.println("\t-VIVIENDA1: " + vivienda1.precioFinal());
		System.out.println("\t-VIVIENDA2: " + vivienda2.precioFinal());
		
		System.out.println(" COMISION (en euros)");
		System.out.println("\t-CHALET1: " + chalet1.comision());
		System.out.println("\t-CHALET2: " + chalet2.comision());
		System.out.println("\t-VIVIENDA1: " + vivienda1.comision());
		System.out.println("\t-VIVIENDA2: " + vivienda2.comision());
		
		
		
	}

}
