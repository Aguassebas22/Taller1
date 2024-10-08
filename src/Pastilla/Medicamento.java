
package Pastilla;


public class Medicamento {
    private String nombre;
    private String fabricante;
    private String via;

    public Medicamento() {
    }

    public Medicamento(String nombre, String fabricante, String via) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.via = via;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }
    
    
    public static class Posologia{
        private String usuario;
        private int dosis;
        private int tiempo;
        private String recomendaciones;

        public Posologia() {
        }

        public Posologia(String usuario, int dosis, int tiempo, String recomendaciones) {
            this.usuario = usuario;
            this.dosis = dosis;
            this.tiempo = tiempo;
            this.recomendaciones = recomendaciones;
        }

        
        public String getUsuario() {
            return usuario;
        }

        public void setUsuario(String usuario) {
            this.usuario = usuario;
        }

        public int getDosis() {
            return dosis;
        }

        public void setDosis(int dosis) {
            this.dosis = dosis;
        }

        public int getTiempo() {
            return tiempo;
        }

        public void setTiempo(int tiempo) {
            this.tiempo = tiempo;
        }

        public String getRecomendaciones() {
            return recomendaciones;
        }

        public void setRecomendaciones(String recomendaciones) {
            this.recomendaciones = recomendaciones;
        }
        
        
    }
    
}
