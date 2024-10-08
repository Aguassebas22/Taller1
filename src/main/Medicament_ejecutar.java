
package main;

import Pastilla.Medicamento;



public class Medicament_ejecutar {
    public static void main(String[] args) {
        Medicamento medicamento = new Medicamento("Acetaminofen", "Bayer", "oral");
        Medicamento.Posologia posologia = new Medicamento.Posologia("Adultos y mayores de 16 años", 500, 6, "No debe tomar este medicamento con el estomago vacio");
        
        System.out.println("Nombre = " + medicamento.getNombre());
        System.out.println("Fabricante = " + medicamento.getFabricante());
        System.out.println("Via = " + medicamento.getVia());
        System.out.println("Usuarios = " + posologia.getUsuario());
        System.out.println("Dosis = " + posologia.getDosis());
        System.out.println("Periodo = " + posologia.getTiempo() + " horas ");
        System.out.println("Recomendaciones = " + posologia.getRecomendaciones());
        
    }
}
