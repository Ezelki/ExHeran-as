/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author IFSC
 */
public class Main {
    public static void main(String[] args) {
        Automovel car = new Automovel();
        Automovel moto = new Automovel();
        
        car.setnPlaca("TRUT-485");
        car.setnPortas(4);
        car.setCor("Preto");
        car.setnRodas(4);
        car.setCapacidade(4);
        
        moto.setnPlaca("HIUT-455");
        moto.setnPortas(0);
        moto.setCor("Preta");
        moto.setnRodas(2);
        moto.setCapacidade(2);
        
        car.impCar();
        moto.impCar();
    }
}
