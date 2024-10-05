
package main;

import Planetas.Planeta;
import Planetas.Tipos;

public class Ejecutable_planeta {
        public static void main(String[] args) {
        Planeta tierra = new Planeta("Tierra", 1, 5.9736E24, 1.08321E12, 150000000, true );
        tierra.setDensidad(tierra.getMasa()/tierra.getVolumen());
        tierra.setDiametro((int) Math.pow((3*tierra.getVolumen())/(4*Math.PI), 1.0/3)* 2);
        
            System.out.println("Nombre del plante = " + tierra.getNombre());
            System.out.println("Cantidad de satelites = " + tierra.getCantidadS());
            System.out.println("Masa = " + tierra.getMasa());
            System.out.println("Volumen = " + tierra.getVolumen());
            System.out.println("Diametro = " +tierra.getDiametro());
            
        if(tierra.getDiametro() <= tierra.getTerrestre() && tierra.getDiametro() >= tierra.getEnano()){
            System.out.println("Es un planeta = " + Tipos.Terrestre);
        }else {
            if(tierra.getDiametro() < tierra.getEnano()){
                System.out.println("Es un planeta = " + Tipos.Enano);
        }else{
                System.out.println("Es un planeta = " + Tipos.Gaseoso);
                }
             }
         System.out.println("Es observable = " + tierra.isObservable());
         System.out.println("Densidad = " + tierra.getDensidad());
         tierra.setVista(tierra.getDistancia() >= tierra.getUA());
         System.out.println("Es exterior = " + tierra.isVista());
        
 }
}