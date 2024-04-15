abstract class Barco {
    public abstract void Alarma();
    public abstract void Msg(String texto);
}
abstract class BarcoPasajeros extends Barco {


}
public class Abstracta {

    public static void main(String [] args){
        //BarcoPasajeros barcoPasajeros= new BarcoPasajeros();
        System.out.println("Estoy en el main");
    }
}