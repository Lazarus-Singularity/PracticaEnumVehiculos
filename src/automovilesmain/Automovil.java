package automovilesmain;

public class Automovil {

	String marca;
	int modelo;
	int motor;
	int numeroPuertas;
	int cantidadAsientos;
	int velocidadMaxima;
	tipoColor color;
	tipoCom tipoCombustible;
	tipoA tipoAutomobil;
	int velocidadActual;
	public Automovil(){
	
	};
	public Automovil(String marca, int modelo, int motor, tipoCom tipoCombustible, tipoA tipoAutomobil, int numeroPuertas, int cantidadAsientos,
		int velocidadMaxima, tipoColor color) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.motor = motor;
		this.tipoAutomobil = tipoAutomobil;
		this.numeroPuertas = numeroPuertas;
		this.cantidadAsientos = cantidadAsientos;
		this.velocidadMaxima = velocidadMaxima;
		this.color = color;
		this.tipoCombustible = tipoCombustible;
	}

	public String getMarca() {
		return marca;
	}

	public int getModelo() {
		return modelo;
	}

	public int getMotor() {
		return motor;
	}

	public tipoCom getCom() {
		return tipoCombustible;
	}

	public tipoA getAutomobil() {
		return tipoAutomobil;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public int getCantidadAsientos() {
		return cantidadAsientos;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public tipoColor getColor() {
		return color;
	}

	public int getVelocidadActual() {
		return velocidadActual;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public void setMotor(int motor) {
		this.motor = motor;
	}

	public void setCombustible(tipoCom tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	public void setAutomobil(tipoA tipoAutomobil) {
		this.tipoAutomobil = tipoAutomobil;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public void setCantidadAsientos(int cantidadAsientos) {
		this.cantidadAsientos = cantidadAsientos;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public void setColor(tipoColor color) {
		this.color = color;
	}

	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	public void frenar() {
		System.out.println("El auto esta frenando");
	}

	public void imprimir() {
                                
		System.out.println("Marca del vehiculo: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Caballos de fuerza total: " + motor);
		System.out.println("Numero de puertas en el auto: " + numeroPuertas);
		System.out.println("Numero de asientos en el auto: " + cantidadAsientos);
		System.out.println("Velocidad maxima (kilometros por hora): " + velocidadMaxima);
		System.out.println("Color del auto: " + color);
		System.out.println("Tipo de vehiculo: " + tipoAutomobil);
		System.out.println("Tipo de combustible: " + tipoCombustible);
	}

}
