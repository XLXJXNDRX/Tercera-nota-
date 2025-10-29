package unidad3.modelo;

public class Carro extends Vehiculo {
    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    public void abrirPuerta() {
        System.out.println("El carro " + getMarca() + " " + getModelo() + " abrió la puerta.");
    }
}
