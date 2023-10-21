package one.innovation.gof.singleton;

/**
 * Singleton "Preguiçoso".
 * 
 * @author Lucas
 * 
 */
public class SingletonLazy {
    
    private static SingletonLazy instancia;

//constructor privado, isso faz com que ninguem consiga instanciá-lo lá fora
    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstancia(){
        if (instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
