package one.innovation.gof.singleton;

/**
 * Singleton "Lazy holder".
 * 
 * @author Lucas
 * 
 */
public class SingletonLazyHolder {
    
    private static class InstanceHolder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }    
    //Constructor privado, isso faz com que ninguem consiga instanciá-lo fora.
    private SingletonLazyHolder(){
        super();
        }
    
    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
        }
}
