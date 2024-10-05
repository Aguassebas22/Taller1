
package Planetas;

public class Planeta {
    private String nombre;
    private int CantidadS;
    private double masa;
    private double volumen;
    private int distancia;
    private boolean observable;
    private double densidad;
    private int diametro;
    private boolean vista;
    
    int Terrestre = 20000;
    int Gaseoso = 50000;
    int Enano = 2300;
    
    int UA = (int) (3.4 * 149597870);

    public Planeta() {
    }

    public Planeta(String nombre, int CantidadS, double masa, double volumen, int distancia, boolean observable) {
        this.nombre = nombre;
        this.CantidadS = CantidadS;
        this.masa = masa;
        this.volumen = volumen;
        this.distancia = distancia;
        this.observable = observable;
    }

    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadS() {
        return CantidadS;
    }

    public void setCantidadS(int CantidadS) {
        this.CantidadS = CantidadS;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public boolean isObservable() {
        return observable;
    }

    public void setObservable(boolean observable) {
        this.observable = observable;
    }

    public double getDensidad() {
        return densidad;
    }

    public void setDensidad(double densidad) {
        this.densidad = densidad;
    }

    

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public int getTerrestre() {
        return Terrestre;
    }

    public void setTerrestre(int Terrestre) {
        this.Terrestre = Terrestre;
    }

    public int getGaseoso() {
        return Gaseoso;
    }

    public void setGaseoso(int Gaseoso) {
        this.Gaseoso = Gaseoso;
    }

    public int getEnano() {
        return Enano;
    }

    public void setEnano(int Enano) {
        this.Enano = Enano;
    }

    public boolean isVista() {
        return vista;
    }

    public void setVista(boolean vista) {
        this.vista = vista;
    }

    public int getUA() {
        return UA;
    }

    public void setUA(int UA) {
        this.UA = UA;
    }
    
    
    
}
