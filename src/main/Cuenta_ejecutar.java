package main;

import Banco.CuentaAhorro;


public class Cuenta_ejecutar {
    public static void main(String[] args) {
        CuentaAhorro cuenta = new CuentaAhorro(100000, 0.10F );
        cuenta.setNumeroC(50000);
        cuenta.setNumeroR(70000);
        int trans = 0;
        float interesMensual = cuenta.setTasaAnual(cuenta.getTasaAnual()/12);
        System.out.println("Saldo inicial = " + cuenta.getSaldo());
        System.out.println("Tasa anual = " + cuenta.getTasaAnual());
        
       
        
        if(cuenta.getNumeroC()> 0){
           System.out.println("Consignacion = " + cuenta.getNumeroC());
           cuenta.setSaldo(cuenta.getSaldo()+cuenta.getNumeroC());
           trans++;
        }else{
            System.out.println("No puedes consignar un valor negativo");
        }
        System.out.println("Retiro = " + cuenta.getNumeroR());
        
        if(cuenta.getNumeroR() < cuenta.getSaldo()){
            cuenta.setSaldo(cuenta.getSaldo()-cuenta.getNumeroR());
            float interesM = cuenta.getSaldo() * interesMensual;
            System.out.println("Saldo = " + (interesM + cuenta.getSaldo()));
            trans++;
            
        }else {
            System.out.println("No tienes suficiente dinero para retirar");
        }
        if(trans > 4){
            cuenta.setComisionMensual((trans-4)*1000);
            System.out.println("Comision mensual = " + cuenta.getComisionMensual());
            System.out.println("Numero de transacciones = " + trans);
        }else {
            System.out.println("Comision mensual = " + cuenta.getComisionMensual());
            System.out.println("Numero de transacciones = " + trans);
        }
    }
            
}
