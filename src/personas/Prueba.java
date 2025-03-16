package personas;

public class Prueba {

	public static void main(String[] args) {
		Persona persona1Pepe = new Persona("Pepe", 35);
		Prest prestamo1 = new Prest(1000);
		persona1Pepe.addPrestamo(prestamo1);
		
		persona1Pepe.pTI();
		System.out.println("Número de préstamos: " + persona1Pepe.numPrestamos);
	}

}
