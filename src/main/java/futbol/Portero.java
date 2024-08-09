package futbol;

public class Portero extends Futbolista{
    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal){
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    public String toString(){
        return super.toString() + " con el dorsal "+dorsal+". Le han marcado "+golesRecibidos;
    }

    public boolean jugarConLasManos(){return true;}

    public int compareTo(Futbolista p){
        return Math.abs(this.golesRecibidos - ((Portero)p).golesRecibidos);
    }
}
