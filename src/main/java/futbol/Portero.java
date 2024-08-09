package futbol;

public class Portero extends Futbolista{
    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad, String posicion, short golesRecibidos, byte dorsal){
        super(nombre, edad, posicion);
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    public String toString(){
        return super.toString() + " con el dorsal "+dorsal+". Le han marcado "+golesRecibidos;
    }

    public boolean jugarConLasManos(){return true;}

    public int compareTo(Futbolista p){
        return Math.abs(golesRecibidos - p.golesRecibidos);
    }
}
