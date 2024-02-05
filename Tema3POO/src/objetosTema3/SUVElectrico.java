package objetosTema3;

public class SUVElectrico extends SUV implements InterfaceElectrico,Isientos {
	public static final String TYPE_SUVE="SUVE";
	private double capacidadBateria=0;
	private double consumo=0;
	private int numeroDeAsientos;

	public SUVElectrico(String color, String marca, String modelo, double precio, double coste,double capacidadBateria,double consumo,int numeroDeAsientos) {
		super(color, marca, modelo, precio, coste);
		this.capacidadBateria=capacidadBateria;
		this.consumo=consumo;
		this.numeroDeAsientos=numeroDeAsientos;
	}

@Override
public double capacidadBateria() {
	// TODO Auto-generated method stub
	return 0;
}
@Override
public double consumoParaCienKilometros() {
	// TODO Auto-generated method stub
	return 0;
}
@Override
public double autonomia() {
	return capacidadBateria/consumo;
}


@Override
public int numeroDeAsientos() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public String toString() {
	return "SUVElectrico [capacidadBateria=" + capacidadBateria + ", consumo=" + consumo + ", numeroDeAsientos="
			+ numeroDeAsientos + ", capacidadBateria()=" + capacidadBateria() + ", consumoParaCienKilometros()="
			+ consumoParaCienKilometros() + ", autonomia()=" + autonomia() + ", numeroDeAsientos()="
			+ numeroDeAsientos() + ", getTipoCoche()=" + getTipoCoche() + ", getColor()=" + getColor() + ", getMarca()="
			+ getMarca() + ", getModelo()=" + getModelo() + ", getPrecio()=" + getPrecio() + ", getCoste()="
			+ getCoste() + "]";
}

}
