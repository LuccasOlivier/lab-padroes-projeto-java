package one.innovation.gof;

import one.innovation.gof.facade.Facade;
import one.innovation.gof.singleton.SingletonEager;
import one.innovation.gof.singleton.SingletonLazy;
import one.innovation.gof.singleton.SingletonLazyHolder;
import one.innovation.gof.strategy.Comportamento;
import one.innovation.gof.strategy.ComportamentoAgressivo;
import one.innovation.gof.strategy.ComportamentoDefensivo;
import one.innovation.gof.strategy.ComportamentoNormal;
import one.innovation.gof.strategy.Robo;

public class Test {
    public static void main(String[] args) {
        
        // Teste relacionados ao Design Pattern Singleton        
        /*SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder); 
        */

        //Testes Strategy
        /*Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
        
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover(); */
        
        //Teste do novo comportamento de salto
        Comportamento defensivoComSalto = new ComportamentoDefensivo();
        Comportamento normalComSalto = new ComportamentoNormal();
        Comportamento agressivoComSalto = new ComportamentoAgressivo();

        Robo robo2 = new Robo();

        robo2.setComportamento(normalComSalto);
        robo2.mover();
        robo2.saltar();

        robo2.setComportamento(defensivoComSalto);
        robo2.mover();
        robo2.saltar();

        robo2.setComportamento(agressivoComSalto);
        robo2.mover();
        robo2.saltar();

        /* //Testes Facade 
        Facade facade = new Facade();
        facade.migrarCliente("Lucas", "36576195"); */
    } 
}
