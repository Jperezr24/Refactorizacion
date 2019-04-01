package es.studium.Refactorizacion;

public class Refactorizacion
{

	public double calcularPrecio (int unidades,double precioUnitario) {
		
		double precioTotal;
		double IVA;
		
		
		precioTotal=unidades*precioUnitario;
		IVA=precioTotal*0.21;
		
		return precioTotal+IVA;
		
	}

}
