
package main;

import Carros.Carro;
import Carros.Color;
import Carros.TiposCarros;
import Carros.TiposCombustible;


public class Carro_Ejecutable {
    public static void main(String[] args) {
        Carro carro = new Carro("ford", 2019, 3, 5, 6,250,0);
        
        int aceleracion1 = carro.getVelocidadMin() + (carro.getVelocidadA() + carro.getAceleracion());
        
        System.out.println("Marca = " + carro.getMarca());
        System.out.println("Modelo = " + carro.getAños());
        System.out.println("Motor = " + carro.getMotor());
        System.out.println("Tipo de combustible = " + TiposCombustible.Diesel);
        System.out.println("Tipo de carros = " + TiposCarros.Familiar );
        System.out.println("Numero de puertas = " + carro.getPuertas());
        System.out.println("Cantidad de asientos = " + carro.getAsientos());
        System.out.println("Velocidad maxima = " + carro.getVelocidadM());
        System.out.println("Color = " + Color.Negro);
        
        while(aceleracion1 < carro.getVelocidadM()){
            if(aceleracion1 < 0){
                aceleracion1 = 0;
                System.out.println("Velocidad actual = " + aceleracion1 + " km/h");
                System.out.println("No se puede desacelerar en negativo");
                break;
            }else{
                 System.out.println("Velocidad actual = " + aceleracion1 + " km/h");
                 aceleracion1 = aceleracion1 - carro.getDesaceleracion();
            }
        }
        
    }
}
