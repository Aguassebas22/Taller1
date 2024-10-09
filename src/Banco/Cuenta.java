package Banco;

public class Cuenta {
    private float saldo;
    private int numeroConsignaciones;
    private int numeroRetiros;
    private float tasaAnual;
    private float comisionMensual;
    int numeroC = 0;
    int numeroR = 0;

    public Cuenta() {
    }

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    
    
    
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConsignaciones() {
        return numeroConsignaciones;
    }

    public void setNumeroConsignaciones(int numeroConsignaciones) {
        this.numeroConsignaciones = numeroConsignaciones;
    }

    public int getNumeroRetiros() {
        return numeroRetiros;
    }

    public void setNumeroRetiros(int numeroRetiros) {
        this.numeroRetiros = numeroRetiros;
    }

    public float getTasaAnual() {
        return tasaAnual;
    }

    public float setTasaAnual(float Anual) {
        this.tasaAnual = tasaAnual;
        float anual = 0;
        return anual;
    }

    public float getComisionMensual() {
        return comisionMensual;
    }

    public void setComisionMensual(float comisionMensual) {
        this.comisionMensual = comisionMensual;
    }

    public int getNumeroC() {
        return numeroC;
    }

    public void setNumeroC(int numeroC) {
        this.numeroC = numeroC;
    }

    public int getNumeroR() {
        return numeroR;
    }

    public void setNumeroR(int numeroR) {
        this.numeroR = numeroR;
    }
    
    
}
