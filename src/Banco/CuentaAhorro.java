
package Banco;


public class CuentaAhorro extends Cuenta{ 
    
     private boolean activa;

    public CuentaAhorro() {
    }

    public CuentaAhorro(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
     
     
     
}
