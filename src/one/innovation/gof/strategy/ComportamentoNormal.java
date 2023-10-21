package one.innovation.gof.strategy;

public class ComportamentoNormal implements Comportamento {

    @Override
    public void mover() {
       System.out.println("-------------------------------------------");
       System.out.println("Movendo-se normalmente...");
    }
    
    public void saltar(){
        System.out.println("Ativando comportamentos normais:");
        System.out.println("(Salto fraco...)");
        System.out.println("-------------------------------------------");
    }
}
