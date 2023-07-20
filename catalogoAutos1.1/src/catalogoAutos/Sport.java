package catalogoAutos;

public class Sport extends Auto{
	
	private final int id;
	private static int contadorId = 1;
	
	
	public Sport(int id, String nombre, String marca, String modelo, String tipo, String combustible, int anio, double motor, int potencia,
			double precio) {
		super(nombre, marca, modelo, tipo, combustible, anio, motor, potencia, precio);
		
		this.id = ++Sport.contadorId;
	}


	
	public int getId() {
		return id;
	}



	@Override
	public String toString() {
		return "Sport [id=" + id +","+super.toString()+ "]";
	}

}
