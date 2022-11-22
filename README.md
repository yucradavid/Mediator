
# Mediator
Exposición de mediator del grupo 2 - ciclo 2 presentado por David Robert Yucra Mamani.

# Codigo Utilizado

# Main.java:
```xml
package Mediator1;
public class Main
{
    public static void main(String[] args)
    {
        // Crear el objeto centralizador de la comunicación
         Mediador m = new Mediador();
        // Crear los objetos que participarán en la comunicación
        Colega cc1 = new ColegaConcreto1( m );
        Colega cc2 = new ColegaConcreto2( m );
        Colega cc3 = new ColegaConcreto3( m );
        // Agregarlos al objeto centralizador
         m.agregarColega( cc1 );
         m.agregarColega( cc2 );
         m.agregarColega( cc3 );
        // Provocar un cambio en un uno de los elementos
        cc2.comunicar("ColegaConcreto2 ha cambiado!");
    }
}
```

# IMediador.java:
```xml
package Mediator1;
 public interface IMediador
{
     public void enviar(String mensaje, Colega emisor);
}
Collapse Code
Mediador.java:

package Mediator1;
import java.util.ArrayList;
public class Mediador implements IMediador
{
    private ArrayList<Colega> colegas;
    // -------------------------------
    public Mediador()
    {
        this.colegas = new ArrayList<Colega>();
    }
    // -------------------------------
     public void agregarColega(Colega colega)
    {
        this.colegas.add( colega );
    }
    // ------------------------------
    @Override
     public void enviar(String mensaje, Colega originator)
    {
        for( Colega colega : colegas )
        {
            if( colega != originator )
            {
                colega.recibir( mensaje );
            }
        }
    }
}
```

#Colega.java:
```xml
package Mediator1;
public abstract class Colega
{
    protected IMediador mediador;
    // -------------------------------
    public IMediador getMediador()
    {
        return this.mediador;
    }
    // -------------------------------
    public void setMediador( IMediador m )
    {
        this.mediador = m;
    }
    // -------------------------------
     public void comunicar(String mensaje)
    {
        this.getMediador().enviar(mensaje, this);
    }
    // -------------------------------
    // Método a implementar por las clases que hereden
     public abstract void recibir(String mensaje);
}
```

# ColegaConcreto1.java:
```xml
package Mediator1;
public class ColegaConcreto1 extends Colega
{
    public ColegaConcreto1(IMediador m) {
        this.setMediador( m );
    }
    // -------------------------------
    @Override
     public void recibir(String mensaje)
    {
        System.out.println( "ColegaConcreto1: " + mensaje );
    }
}
```

# ColegaConcreto2.java:
```xml
package Mediator1;
public class ColegaConcreto2 extends Colega
{
    public ColegaConcreto2(IMediador m) {
        this.setMediador( m );
    }
    // -------------------------------
    @Override
     public void recibir(String mensaje)
    {
        System.out.println( "ColegaConcreto1: " + mensaje );
    }
}
```

# ColegaConcreto3.java:
```xml
copytextpop-up

package Mediator1;
public class ColegaConcreto3 extends Colega
{
    public ColegaConcreto3(IMediador m) {
        this.setMediador( m );
    }
    // -------------------------------
    @Override
     public void recibir(String mensaje)
    {
        System.out.println( "ColegaConcreto1: " + mensaje );
    }
}
```
