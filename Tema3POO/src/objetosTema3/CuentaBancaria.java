package objetosTema3;

public class CuentaBancaria {
	private String nombre;
	private String apellido;
	private int num;
	private String tipo;
	private double saldo=0; //quizas es statico



public CuentaBancaria() {
	
}

public CuentaBancaria(String nombre, String apellido, int num, String tipo, double saldo) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.num = num;
	this.tipo = tipo;
	this.saldo = saldo;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public int getNum() {
	return num;
}

public void setNum(int num) {
	this.num = num;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public double getSaldo() {
	return saldo;
}

public void setSaldo(double saldo) {
	this.saldo = saldo;
}
@Override
public String toString() {
	
	return "Cuenta Bancaria [Titular= " + nombre + ", apellidos= " + apellido + ", Numero de cuenta= " + num + ", Tipo de cuenta= " + tipo + ", Saldo= " + saldo + "]";
	}

}


