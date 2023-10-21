package one.innovation.gof.strategy;

public class ComportamentoAgressivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se agressivamente...");
    }

    public void saltar(){
        System.out.println("Ativando comportamentos agressivos:");
        System.out.println("(Saltando alto e atacando...)");
        System.out.println("-------------------------------------------");
    }
}