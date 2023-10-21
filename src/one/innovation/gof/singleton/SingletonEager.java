package one.innovation.gof.singleton;
/**
 * Singleton "Apressado".
 * 
 * @author Lucas
 * 
 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    // Constructor privado, isso faz com que ninguém consiga instanciá-lo fora.
    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}

