
package Carros;


public class Carro {
    private String marca;
    private int años;
    private int motor;
    private int puertas;
    private int asientos;
    private int velocidadM;
    private int velocidadMin;
    
    int velocidadA = 100;
    int aceleracion = 20;
    int desaceleracion = 50;

    public Carro() {
    }

    public Carro(String marca, int años, int motor, int puertas, int asientos, int velocidadM, int velocidadMin) {
        this.marca = marca;
        this.años = años;
        this.motor = motor;
        this.puertas = puertas;
        this.asientos = asientos;
        this.velocidadM = velocidadM;
        this.velocidadMin = velocidadMin;
    }

    
    
    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public int getVelocidadM() {
        return velocidadM;
    }

    public void setVelocidadM(int velocidadM) {
        this.velocidadM = velocidadM;
    }

    public int getVelocidadMin() {
        return velocidadMin;
    }

    public void setVelocidadMin(int velocidadMin) {
        this.velocidadMin = velocidadMin;
    }

    public int getVelocidadA() {
        return velocidadA;
    }

    public void setVelocidadA(int velocidadA) {
        this.velocidadA = velocidadA;
    }

    public int getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(int aceleracion) {
        this.aceleracion = aceleracion;
    }

    public int getDesaceleracion() {
        return desaceleracion;
    }

    public void setDesaceleracion(int desaceleracion) {
        this.desaceleracion = desaceleracion;
    }
    
    
    
}
