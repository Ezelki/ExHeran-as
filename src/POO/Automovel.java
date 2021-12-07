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
public class Automovel extends Terrestre {

    private String cor, nPlaca;
    private int nPortas;
    
    public void impCar(){
        System.out.println("----------Automóvel----------");
        System.out.println("Placa do veículo: "+nPlaca);
        System.out.println("Número de portas: "+nPortas);
        System.out.println("Número de rodas: "+nRodas);
        System.out.println("Número de passageiros: "+capacidade);
        System.out.println("Cor do veículo: "+cor);
    }
    
    public Automovel() {

    }

    public int getnPortas() {
        return nPortas;
    }

    public void setnPortas(int nPortas) {
        this.nPortas = nPortas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getnPlaca() {
        return nPlaca;
    }

    public void setnPlaca(String nPlaca) {
        this.nPlaca = nPlaca;
    }

}
