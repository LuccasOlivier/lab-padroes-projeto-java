package one.innovation.gof.strategy;

public class ComportamentoDefensivo implements Comportamento {

    @Override
    public void mover() {
       System.out.println("Movendo-se defensivamente...");
    }

    public void saltar(){
        System.out.println("Ativando comportamentos defensivos:");
        System.out.println("(Saltando e esquivando...)");
        System.out.println("-------------------------------------------");
    }
}
